package com.yonyou.iuap.corp.demo.api.V1.token;

import com.google.gson.Gson;
import com.yonyou.iuap.corp.demo.constraint.ResultCode;
import com.yonyou.iuap.corp.demo.crypto.SignHelper;
import com.yonyou.iuap.corp.demo.utils.RedisUtil;
import com.yonyou.iuap.corp.demo.utils.RequestTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/13
 * @des 应用服务商ISV Token
 */
@Component
public class IsvToken {

    private static final Logger logger = LoggerFactory.getLogger(IsvToken.class);

    @Value("${isv.suiteKey}")
    private String isvKey;

    @Value("${isv.suiteSecret}")
    private String isvSecret;

    @Value("${isv.token}")
    private String isvTokenURI;

    @Value("${isv.redis.token-cacheKey}")
    private String cacheTokenKey;

    @Value("${isv.redis.suiteTicket}")
    private String cacheSuiteTicket;

    @Value("${isv.redis.suiteKey}")
    private String cacheSuiteKey;

    @Autowired
    private RedisUtil redis;

    private static String tokenKey = "access_token";

    //存储redis时减少有效期200秒
    private Long reduceExpire = 200L;

    public String createToken(String tenantId) throws Exception {
        String token = null;
        cacheTokenKey = cacheTokenKey+tenantId;
        if(redis.exists(cacheTokenKey)){
            token = redis.get(cacheTokenKey).toString();
        }else{
            Map<String, String> params = new HashMap<>();
            if(!redis.exists(cacheSuiteTicket)){
                throw  new Exception("获取token失败--suiteTicket不存在，请查看回调地址是否畅通");
            }
            // 除签名外的其他参数
            System.out.println("cacheSuiteKey:"+redis.get(cacheSuiteKey).toString());
            params.put("suiteKey", redis.get(cacheSuiteKey).toString());
            params.put("tenantId", tenantId);
            System.out.println("cacheSuiteTicket:"+redis.get(cacheSuiteTicket).toString());
            params.put("suiteTicket", redis.get(cacheSuiteTicket).toString());
            params.put("timestamp", String.valueOf(System.currentTimeMillis()));
            // 计算签名
            String signature = SignHelper.sign(params, isvSecret);
            params.put("signature", signature);
            String responseString = RequestTool.doGet(isvTokenURI, params);
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
                    redis.set(cacheTokenKey, access_token, expire-reduceExpire);
                    token = redis.get(cacheTokenKey).toString();
                }
            }else{
                throw  new Exception("获取token失败");
            }
        }
        return token;
    }
}
