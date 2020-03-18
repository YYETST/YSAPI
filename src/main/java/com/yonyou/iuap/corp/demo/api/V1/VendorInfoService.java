package com.yonyou.iuap.corp.demo.api.V1;

import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoBodyEntity;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoHeadEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  供应商信息
 */
@Component
public class VendorInfoService extends BaseApi{
    @Value("${api.vendor.list}")
    private String list_uri;
    @Value("${api.vendor.detail}")
    private String detail_uri;
    @Value("${api.vendor.save}")
    private String save_uri;

    /**
     * 获取供应商列表
     * @param params
     * @return
     */
    public VendorInfoHeadEntity list(Map<String, Object> params) throws Exception {
        VendorInfoHeadEntity result = requestPostPage2(list_uri,params,VendorInfoHeadEntity.class);
        return result;
    }

    /**
     * 获取供应商详情
     * @param params
     * @return
     */
    public VendorInfoBodyEntity detail(Map<String, Object> params) throws Exception {
        VendorInfoBodyEntity result = doGet(detail_uri,params,VendorInfoBodyEntity.class);
        return result;
    }


}
