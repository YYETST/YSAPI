package com.yonyou.iuap.corp.demo;

import com.yonyou.iuap.corp.demo.api.V1.OrgInfoService;
import com.yonyou.iuap.corp.demo.entity.org.OrgInfo;
import com.yonyou.iuap.corp.demo.entity.org.OrgInfoEntity;
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
 * @des  组织单元测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrgInfoTest {
    @Autowired
    private OrgInfoService org;

    /**
     * 获取组织列表
     */
    @Test
    public void getOrgList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        OrgInfoEntity result = org.list(params);
        System.out.println(result.toString());
    }


    /**
     * 获取组织详情
     */
    @Test
    public void getOrgDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1640198360125696");
        OrgInfo result = org.detail(params);
        System.out.println(result.toString());
    }
}

