package com.yonyou.iuap.corp.demo.api.V1;

import com.yonyou.iuap.corp.demo.entity.org.OrgInfo;
import com.yonyou.iuap.corp.demo.entity.org.OrgInfoEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  组织信息接口
 */
@Component
public class OrgInfoService extends BaseApi{

    @Value("${api.org.detail}")
    private String detail_uri;
    @Value("${api.org.list}")
    private String list_uri;

    /**
     * 获取组织列表
     * @param params
     * @return
     */
    public OrgInfoEntity list(Map<String, Object> params) throws Exception {
        OrgInfoEntity result = requestPostPage1(list_uri,params,OrgInfoEntity.class);
        return result;
    }

    /**
     * 获取组织详情
     * @param params
     * @return
     */
    public OrgInfo detail(Map<String, Object> params) throws Exception {
        OrgInfo result = doGet(detail_uri,params, OrgInfo.class);
        return result;
    }

}
