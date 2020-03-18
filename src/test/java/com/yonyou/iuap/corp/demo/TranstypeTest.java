package com.yonyou.iuap.corp.demo;

import com.yonyou.iuap.corp.demo.api.V1.TranstypeService;
import com.yonyou.iuap.corp.demo.entity.transtype.TranstypeBodyEntity;
import com.yonyou.iuap.corp.demo.entity.transtype.TranstypeHeadEntity;
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
 * @des  交易类型测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TranstypeTest {

    @Autowired
    TranstypeService transtypeService;

    /**
     * 获取交易类型列表
     */
    @Test
    public void getTranstypeList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("treename","bd.bill.BillTypeVO");
        List<TranstypeHeadEntity> result = transtypeService.list(params);
        System.out.println(result.toString());
    }


    /**
     * 获取交易类型详情
     */
    @Test
    public void getTranstypeDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1641526656504064");
        TranstypeBodyEntity result = transtypeService.detail(params);
        System.out.println(result.toString());
    }
}
