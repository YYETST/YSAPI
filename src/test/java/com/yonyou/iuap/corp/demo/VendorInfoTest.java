package com.yonyou.iuap.corp.demo;

import com.yonyou.iuap.corp.demo.api.V1.VendorInfoService;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoBodyEntity;
import com.yonyou.iuap.corp.demo.entity.vendor.VendorInfoHeadEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  供应商测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VendorInfoTest {

    @Autowired
    VendorInfoService vendorInfoService;

    /**
     * 获取供应商列表
     */
    @Test
    public void getVendorList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        VendorInfoHeadEntity result = vendorInfoService.list(params);
        System.out.println(result.toString());
    }


    /**
     * 获取供应商详情
     */
    @Test
    public void getVendorDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1641526656504064");
        params.put("vendorApplyRangeId","1641526658617600");
        VendorInfoBodyEntity result = vendorInfoService.detail(params);
        System.out.println(result.toString());
    }
}
