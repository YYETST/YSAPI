package com.yonyou.iuap.corp.demo.api.V1.vendor;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoBodyEntity;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoHeadEntity;
import com.yonyou.iuap.corp.demo.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  供应商信息
 */
@Component
public class VendorInfoService extends BaseApi {
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

    /**
     * 供应商保存
     */
    public VendorInfoBodyEntity save(VendorInfoBodyEntity body) throws Exception {
        setSaveDefaultValue(body);
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("data",body);
        VendorInfoBodyEntity entity = doPost(save_uri,params,VendorInfoBodyEntity.class);
        return entity;
    }

    public void setSaveDefaultValue(VendorInfoBodyEntity body){
        body.setStopstatus(false);
        body.setOrg(666666);
        body.setOrg_code("global00");
        body.setOrg_name("企业账号级");
        body.setSimplename(body.getName());
        body.setVendorextendsstopstatus(0);
        body.setVendorextends_status("Insert");
        body.set_status("Insert");
        body.setPubts(BaseUtils.getCurrentData());
    }



}
