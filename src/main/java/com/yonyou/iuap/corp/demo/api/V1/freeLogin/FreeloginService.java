package com.yonyou.iuap.corp.demo.api.V1.freeLogin;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.crypto.SignHelper;
import com.yonyou.iuap.corp.demo.entity.freelogin.NcLoginEntity;
import com.yonyou.iuap.corp.demo.entity.freelogin.OtherLoginEntity;
import com.yonyou.iuap.corp.demo.utils.RedisUtil;
import com.yonyou.iuap.corp.demo.utils.RequestTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des 免登示例    ----1.在用友平台点开自己的应用页面的时候才需要免登，调用业务接口不需要免登
 * 2.在打开应用首页的时候，用友平台会将url上拼接一个code，使用request.get("code")获取到值后，做为传参调用免登接口
 */
@Component
public class FreeloginService extends BaseApi {

    //nc免登访问地址
    @Value("${api.freelogin.nc}")
    private String nc_uri;
    //其他系统免登访问地址
    @Value("${api.freelogin.other}")
    private String other_uri;


    //isv免登
    @Value("${isv.getBaseInfoByCode}")
    private String isv_uri;
    @Value("${isv.redis.suiteTicket}")
    private String cacheSuiteTicket;
    @Value("${isv.suiteKey}")
    private String suiteKey;
    @Value("${isv.suiteKey}")
    private String isvKey;
    @Value("${isv.suiteSecret}")
    private String isvSecret;
    @Autowired
    private RedisUtil redis;

    public NcLoginEntity ncFreeLogin(HttpServletRequest request) throws Exception {
        //友空间给应用首页访问地址自动拼接的code
        NcLoginEntity ncLoginEntity= doGet(nc_uri,getCode(request),NcLoginEntity.class);
        return ncLoginEntity;
    }


    public String isvFreeLogin(HttpServletRequest request) throws Exception{
        if(!redis.exists(cacheSuiteTicket)){
            throw  new Exception("获取token失败--suiteTicket不存在，请查看回调地址是否畅通");
        }
        Map<String, String> params = new HashMap<>();
        // 除签名外的其他参数
        params.put("suiteKey", suiteKey);
        String code = request.getParameter("code");
        if(null==code|| StringUtils.isEmpty(code))throw new Exception("没有获取到code");
        params.put("code",code);
        params.put("suiteTicket", redis.get(cacheSuiteTicket).toString());
        params.put("timestamp", String.valueOf(System.currentTimeMillis()));
        // 计算签名
        String signature = SignHelper.sign(params, isvSecret);
        params.put("signature", signature);
        String responseString = RequestTool.doGet(isv_uri, params);
        return responseString;
    }

    /**
     * 从request中获取code
     * @param request
     * @return
     * @throws Exception
     */
    public OtherLoginEntity otherLogin(HttpServletRequest request) throws Exception {
        Map<String,Object> params = getCode(request);
        //是否用户返回手机号等信息
        params.put("flag",true);
        OtherLoginEntity otherLoginEntity= doGet(other_uri,params,OtherLoginEntity.class);
        return otherLoginEntity;
    }





    /**
     * 为了方便测试我们传入一个code  ----仅供测试使用
     * @return
     * @throws Exception
     */
    public OtherLoginEntity otherLoginTest(String code) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("code",code);
        //是否用户返回手机号等信息
        params.put("flag",true);
        OtherLoginEntity otherLoginEntity= doGet(other_uri,params,OtherLoginEntity.class);
        return otherLoginEntity;
    }

    /**
     * 为了方便测试我们传入一个code  ----仅供测试使用
     * @return
     * @throws Exception
     */
    public String isvFreeLoginTest(String code) throws Exception{
        if(!redis.exists(cacheSuiteTicket)){
            throw  new Exception("获取token失败--suiteTicket不存在，请查看回调地址是否畅通");
        }
        Map<String, String> params = new HashMap<>();
        // 除签名外的其他参数
        params.put("suiteKey", suiteKey);
        params.put("code",code);
        params.put("suiteTicket", redis.get(cacheSuiteTicket).toString());
        params.put("timestamp", String.valueOf(System.currentTimeMillis()));
        // 计算签名
        String signature = SignHelper.sign(params, isvSecret);
        params.put("signature", signature);
        String responseString = RequestTool.doGet(isv_uri, params);
        return responseString;
    }

    private Map<String,Object> getCode(HttpServletRequest request) throws Exception {
        String code = request.getParameter("code");
        if(null==code|| StringUtils.isEmpty(code))throw new Exception("没有获取到code");
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("code",code);
        return params;
    }

}
