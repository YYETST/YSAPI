package com.yonyou.iuap.corp.demo.api.V1.product;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.product.ProductBodyEntity;
import com.yonyou.iuap.corp.demo.entity.product.ProductHeadEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料
 */
@Component
public class ProductProService extends BaseApi {

    @Value("${api.product.list}")
    private String list_uri;
    @Value("${api.product.detail}")
    private String detail_uri;
    @Value("${api.product.save}")
    private String save_uri;

    /**
     * 获取物料列表
     * @param params
     * @return
     */
    public ProductHeadEntity list(Map<String, Object> params) throws Exception {
        ProductHeadEntity result =  requestPostPage2(list_uri,params,ProductHeadEntity.class);
        return result;
    }

    /**
     * 获取物料详情
     * @param params
     * @return
     */
    public ProductBodyEntity detail(Map<String, Object> params) throws Exception {
        ProductBodyEntity result = doGet(detail_uri,params,ProductBodyEntity.class);
        return result;
    }

    /**
     * 物料保存
     */
    public ProductBodyEntity save(ProductBodyEntity product) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        product.set_status("Insert");
        params.put("data",product);
        ProductBodyEntity result = doPost(save_uri,params,ProductBodyEntity.class);
        return result;
    }



}
