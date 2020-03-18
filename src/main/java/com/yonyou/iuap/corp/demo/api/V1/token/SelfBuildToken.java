package com.yonyou.iuap.corp.demo.api.V1.token;

import com.google.gson.Gson;
import com.yonyou.iuap.corp.demo.constraint.ResultCode;
import com.yonyou.iuap.corp.demo.crypto.SignHelper;
import com.yonyou.iuap.corp.demo.utils.RedisUtil;
import com.yonyou.iuap.corp.demo.utils.RequestTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  自建应用获取token信息
 */
@Component
public class SelfBuildToken {

    @Value("${app.key}")
    private String appKey;

    @Value("${app.secret}")
    private String appSecret;

    @Value("${api.token}")
    private String openApiUrl;

    @Autowired
    private RedisUtil redis;

    private static String tokenKey = "access_token";
    //存储redis时减少有效期200秒
    private Long reduceExpire = 200L;


    public String createToken() throws Exception {
        String token = null;
        if(redis.exists(tokenKey)){
            token = redis.get(tokenKey).toString();
        }else{
            Map<String, String> params = new HashMap<String, String>();
            // 除签名外的其他参数
            params.put("appKey", appKey);
            params.put("timestamp", String.valueOf(System.currentTimeMillis()));
            // 计算签名
            String signature = SignHelper.sign(params, appSecret);
            params.put("signature", signature);
            String responseString = RequestTool.doGet(openApiUrl, params);
            Gson gson = new Gson();
            Map<String,Object> result = gson.fromJson(responseString,Map.class);
            if(ResultCode.SUCCESS.getIndex().equals(result.get(ResultCode.SUCCESS.getName()))) {
                Map<String, Object> tokenInfo = (Map<String, Object>) result.get("data");
                String access_token = (String) tokenInfo.get(tokenKey);
                String[] expireStr = String.valueOf(tokenInfo.get("expire")).split("\\.");
                Long expire = Long.valueOf(expireStr[0]);
                if(expire<reduceExpire){
                    token = access_token;
                }else{
                    redis.set(tokenKey, access_token, expire-reduceExpire);
                    token = redis.get(tokenKey).toString();
                }
            }else{
                throw  new Exception("获取token失败");
            }
        }
        return token;
    }

}
