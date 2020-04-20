package com.yonyou.iuap.corp.demo.entity.freelogin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NcLoginEntity extends BaseApi {

    private String yhtUserId; //用户id
    private String tenantId; //租户Id
    private String memberId; //空间用户id
    private String qzId; 	//空间Id
    private String bindEmail; //绑定的邮箱
    private String bindMobile; //绑定的手机号
    private String bindUcode ; //绑定的用户编码
    private String bindUid; //绑定的用户ID
    private String tenantCode; 	//租户编码
    private String userName; //用户名

    public String getYhtUserId() {
        return yhtUserId;
    }

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getQzId() {
        return qzId;
    }

    public void setQzId(String qzId) {
        this.qzId = qzId;
    }

    public String getBindEmail() {
        return bindEmail;
    }

    public void setBindEmail(String bindEmail) {
        this.bindEmail = bindEmail;
    }

    public String getBindMobile() {
        return bindMobile;
    }

    public void setBindMobile(String bindMobile) {
        this.bindMobile = bindMobile;
    }

    public String getBindUcode() {
        return bindUcode;
    }

    public void setBindUcode(String bindUcode) {
        this.bindUcode = bindUcode;
    }

    public String getBindUid() {
        return bindUid;
    }

    public void setBindUid(String bindUid) {
        this.bindUid = bindUid;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
