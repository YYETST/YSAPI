package com.yonyou.iuap.corp.demo.api.V1.product;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.product.ProClassListEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料分类
 */
@Component
public class ProclassService extends BaseApi {

    @Value("${api.managementclass.list}")
    private String list_uri;
    @Value("${api.managementclass.detail}")
    private String detail_uri;
    @Value("${api.managementclass.save}")
    private String save_uri;

    /**
     * 获取物料分类列表
     * @param params
     * @return
     */
    public List<ProClassListEntity> list(Map<String, Object> params) throws Exception {
        List<ProClassListEntity> result = doPost(list_uri,params,new TypeReference<List<ProClassListEntity>>(){});
        return result;
    }

    /**
     * 获取物料分类详情  --list和detail的差别只有name字段
     * @param params
     * @return
     */
    public ProClassListEntity detail(Map<String, Object> params) throws Exception {
        ProClassListEntity result = doGet(detail_uri,params,ProClassListEntity.class);
        return result;
    }
}
