package com.yonyou.iuap.corp.demo.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yonyou.iuap.corp.demo.constraint.IsvEventType;
import com.yonyou.iuap.corp.demo.crypto.EncryptionHolder;
import com.yonyou.iuap.corp.demo.crypto.IsvEventCrypto;
import com.yonyou.iuap.corp.demo.model.EventContent;
import com.yonyou.iuap.corp.demo.model.Suite;
import com.yonyou.iuap.corp.demo.model.SuiteAuth;
import com.yonyou.iuap.corp.demo.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 处理套件授权相关的回调事件：1. 推送套件票据 suiteTicket, 2. 推送授权的租户 id。
 * 这里的回调地址填写在套件的编辑页面。
 */
@RestController
public class PushAuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PushAuthController.class);

    private ObjectMapper mapper = new ObjectMapper();

    @Value("${isv.redis.suiteTicket}")
    private String cacheSuiteTicket;

    @Autowired
    private RedisUtil redis;

    @Value("${isv.suiteKey}")
    private String suiteKey;
    @Value("${isv.suiteSecret}")
    private String suiteSecret;
    @Value("${isv.EncodingAESKey}")
    private String EncodingAESKey;

    private static long cacheSuiteTicketTime = 1200;

    @PostMapping("/open/auth_push1")
    public String authCallbackHandler(@RequestBody EncryptionHolder holder) throws IOException {

        // 构建解密验签处理对象
        IsvEventCrypto crypto = new IsvEventCrypto(suiteSecret, EncodingAESKey, suiteKey);
        // 验签解密后的消息体
        String decryptMessage = crypto.decryptMsg(holder);
        // 反序列化后的消息内容对象
        EventContent content = mapper.readValue(decryptMessage, EventContent.class);

        // 套件票据推送事件
        if (content.getType() == IsvEventType.SUITE_TICKET) {
            LOGGER.info("新的票据推送事件, suitekey: {}, suiteTicket: {}", content.getSuiteKey(), content.getSuiteTicket());
            redis.set(cacheSuiteTicket,content.getSuiteTicket(),cacheSuiteTicketTime);
            handleTicketPush(content);
        }

        // 套件租户授权事件
        if (content.getType() == IsvEventType.SUITE_AUTH) {
            LOGGER.info("新的授权事件, suitekey: {}, authTenantId: {}", content.getSuiteKey(), content.getAuthTenantId());
            LOGGER.info("order id: {}", content.getOrder());
            handleAuthPush(content);
        }
        // 处理成功，回复 "success" 告知开放平台，否则开放平台会重试推送，每分钟一次，重试 60 次
        return "success";
    }

    /**
     * 处理套件票据 (suiteTicket) 推送事件
     * 将票据进行存储，票据 20 分钟推送一次，有效期 20 分钟
     * 开发者需要对推送的票据进行存储，每个套件对应一个有效的票据
     * @param content
     */
    private void handleTicketPush(EventContent content) {
        Suite suite = new Suite();
        suite.setSuiteKey(content.getSuiteKey());
        suite.setSuiteSecret(suiteSecret);
        suite.setSuiteTicket(content.getSuiteTicket());
        //TODO；自选存储票据的方式
    }

    /**
     * 处理套件授权推送事件
     * 套件授权时开放平台会推送授权的租户 id (tenantId) ，
     * 开发者需要使用 tenantId 调用开放平台接口获得该租户的访问令牌 (accessToken)
     * @param content
     */
    private void handleAuthPush(EventContent content) {
        SuiteAuth suiteAuth = new SuiteAuth();
        suiteAuth.setTenantId(content.getSuiteKey());
        suiteAuth.setTenantId(content.getAuthTenantId());
        //TODO:进行存储
    }
}
