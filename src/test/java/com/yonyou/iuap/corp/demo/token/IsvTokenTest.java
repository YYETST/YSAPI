package com.yonyou.iuap.corp.demo.token;

import com.yonyou.iuap.corp.demo.api.V1.token.IsvToken;
import com.yonyou.iuap.corp.demo.entity.product.UnitBodyEntity;
import com.yonyou.iuap.corp.demo.entity.product.UnitListEntity;
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
 * @date 2020/3/13
 * @des  IsvToken测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IsvTokenTest {

    @Autowired
    IsvToken isvToken;

    /**
     * 测试获取token
     */
    @Test
    public void createToken() throws Exception {
        String tenantId = "pqgkceae";
        String result = isvToken.createToken(tenantId);
        System.out.println(result);
    }
}
