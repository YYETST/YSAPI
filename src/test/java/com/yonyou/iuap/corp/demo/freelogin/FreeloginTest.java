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
        OtherLoginEntity result = freeloginService.otherLoginTest("38a044868f0d33e51478a83d0e4961a5365098c3c3c9ea51cd07e7d5c093");
        System.out.println(result.toString());
    }

    /**
     * 免登接口
     * @throws Exception
     */
    @Test
    public void isvFreeLogin() throws Exception {
        String result = freeloginService.isvFreeLoginTest("85dbafffc412f204a46766b8fbd71883c1ddad7bd4c44af0aedddce295f6");
        System.out.println(result);
    }

}
