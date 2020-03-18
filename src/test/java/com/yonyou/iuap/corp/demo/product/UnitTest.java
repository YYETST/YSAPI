package com.yonyou.iuap.corp.demo.product;

import com.yonyou.iuap.corp.demo.api.V1.product.SpeproService;
import com.yonyou.iuap.corp.demo.api.V1.product.UnitService;
import com.yonyou.iuap.corp.demo.entity.product.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  计量单位测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitTest {

    @Autowired
    UnitService unitService;

    /**
     * 获取物料规格列表
     */
    @Test
    public void getProductList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        UnitListEntity result = unitService.list(params);
        List<UnitBodyEntity> data = result.getRecordList();
        //获取详情要用到
        System.out.println("id:"+data.get(0).getId());
    }


    /**
     * 获取物料规格详情
     */
    @Test
    public void getProductDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1641554627268864");
        UnitBodyEntity result = unitService.detail(params);
        System.out.println(result.toString());
    }
}
