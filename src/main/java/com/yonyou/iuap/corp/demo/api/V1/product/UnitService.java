package com.yonyou.iuap.corp.demo.api.V1.product;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.product.UnitBodyEntity;
import com.yonyou.iuap.corp.demo.entity.product.UnitListEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  计量单位
 */
@Component
public class UnitService extends BaseApi {

    @Value("${api.unit.list}")
    private String list_uri;
    @Value("${api.unit.detail}")
    private String detail_uri;
    @Value("${api.unit.save}")
    private String save_uri;

    /**
     * 获取计量单位列表
     * @param params
     * @return
     */
    public UnitListEntity list(Map<String, Object> params) throws Exception {
        UnitListEntity result = requestPostPage2(list_uri,params,UnitListEntity.class);
        return result;
    }

    /**
     * 获取计量单位详情
     * @param params
     * @return
     */
    public UnitBodyEntity detail(Map<String, Object> params) throws Exception {
        UnitBodyEntity result = doGet(detail_uri,params,UnitBodyEntity.class);
        return result;
    }

}
