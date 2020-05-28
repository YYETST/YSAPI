package com.yonyou.iuap.corp.demo.api.V1.thirdsingleon;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;

import com.yonyou.iuap.corp.demo.entity.user.ThirdUserEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.net.URLEncoder;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/5/28
 * @des 第三方单点登录Yonsuite
 */
@Component
public class SingleSignOnService extends BaseApi {

    //配置文件路径 在 apiuri.properties
    @Value("${api.sso.code}")
    private String code_uri;
    @Value("${api.sso.openysurl}")
    private String openys_uri;
    @Value("${api.sso.access}")
    private String access_uri;

    /**
     * 获取单点登录地址
     * @param entity
     * @return
     */
    public String getSingleSignOnUrl(ThirdUserEntity entity) throws Exception {
        String code = getCode(entity);
        String thirdUCId = entity.getThirdUcId();
        String service = URLEncoder.encode(access_uri,"utf-8");
        String url = openys_uri+"?thirdUCId="+thirdUCId+"&code="+code+"&service="+service;
        return url;
    }
    /**
     * 获取临时code
     * @param entity
     * @return
     * @throws Exception
     */
    private String getCode(ThirdUserEntity entity) throws Exception {
        if(null==entity||null==entity.getThirdUcId()||StringUtils.isEmpty(entity.getThirdUcId())
        ||null==entity.getUserId()||StringUtils.isEmpty(entity.getUserId())){
            throw new Exception("用户参数不全");
        }
        Map<String,Object> result = doPost(code_uri,entity,Map.class);
        return result.get("code").toString();
    }
}
