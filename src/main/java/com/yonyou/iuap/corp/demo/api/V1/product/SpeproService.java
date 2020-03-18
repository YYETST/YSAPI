package com.yonyou.iuap.corp.demo.api.V1.product;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.product.SpeproHeadEntity;
import com.yonyou.iuap.corp.demo.entity.product.SpeproListEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料规格
 */
@Component
public class SpeproService extends BaseApi {

    @Value("${api.spepro.list}")
    private String list_uri;
    @Value("${api.spepro.detail}")
    private String detail_uri;
    @Value("${api.spepro.save}")
    private String save_uri;

    /**
     * 获取物料规格列表
     * @param params
     * @return
     */
    public SpeproListEntity list(Map<String, Object> params) throws Exception {
        SpeproListEntity result = requestPostPage2(list_uri,params,SpeproListEntity.class);
        return result;
    }

    /**
     * 获取物料规格详情
     * @param params
     * @return
     */
    public SpeproHeadEntity detail(Map<String, Object> params) throws Exception {
        SpeproHeadEntity result = doGet(detail_uri,params,SpeproHeadEntity.class);
        return result;
    }

}
