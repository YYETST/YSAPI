package com.yonyou.iuap.corp.demo.api.V1.vendor;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorClassEntity;
import com.yonyou.iuap.corp.demo.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/30
 * @des 供应商分类
 */
@Component
public class VendorClassService extends BaseApi {

    @Value("${api.vendorclass.list}")
    private String list_uri;
    @Value("${api.vendorclass.detail}")
    private String detail_uri;
    @Value("${api.vendorclass.save}")
    private String save_uri;

    /**
     * 获取供应商分类列表
     * @param params
     * @return
     */
    public List<VendorClassEntity> list(VendorClassEntity params) throws Exception {
        List<VendorClassEntity> result = doPost(list_uri,params,new TypeReference<List<VendorClassEntity>>(){});
        return result;
    }

    /**
     * 获取供应商分类详情
     * @param params
     * @return
     */
    public VendorClassEntity detail(Map<String, Object> params) throws Exception {
        VendorClassEntity result = doGet(detail_uri,params,VendorClassEntity.class);
        return result;
    }

    /**
     * 保存供应商分类
     */
    public VendorClassEntity save(VendorClassEntity body) throws Exception {
        setSaveDefaultValue(body);
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("data",body);
        VendorClassEntity entity = doPost(save_uri,params,VendorClassEntity.class);
        return entity;
    }

    /**
     * 设置保存默认值
     */
    public void setSaveDefaultValue(VendorClassEntity body){
        body.setLevel(1);
        body.setEnabled(true);
        body.setEnd(true);
        body.setPubts(BaseUtils.getCurrentData());
        body.set_status("Insert");
    }
}
