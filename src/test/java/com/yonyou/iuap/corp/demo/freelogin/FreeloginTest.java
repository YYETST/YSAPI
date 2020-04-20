package com.yonyou.iuap.corp.demo.freelogin;

import com.yonyou.iuap.corp.demo.api.V1.freeLogin.FreeloginService;
import com.yonyou.iuap.corp.demo.entity.freelogin.OtherLoginEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/4/15
 * @des 免登测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FreeloginTest {

    @Autowired
    FreeloginService freeloginService;

    /**
     * 免登接口
     * @throws Exception
     */
    @Test
    public void freeLogin() throws Exception {
        OtherLoginEntity result = freeloginService.otherLoginTest("b33877aeac19d26c0ffce5c8e955d4d49744563b1e94f65110ce107651cf");
        System.out.println(result.toString());
    }
}
