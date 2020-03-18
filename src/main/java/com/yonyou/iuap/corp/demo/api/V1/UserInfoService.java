package com.yonyou.iuap.corp.demo.api.V1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.entity.UserInfoEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  员工信息接口
 */
@Component
public class UserInfoService extends BaseApi{

    @Value("${api.user.info}")
    private String detail_uri;

    /**
     * 根据手机号获取员工信息
     * @param params
     * @return
     */
    public List<UserInfoEntity> detail(Map<String, Object> params) throws Exception {
        params.put("type","1");
        List<UserInfoEntity> result = doGet(detail_uri,params,new TypeReference<List<UserInfoEntity>>(){});
        return result;
    }

}
