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
public class OtherLoginEntity extends BaseApi {

    private String yhtUserId; //用户id
    private String tenantId;  //租户Id
    private String memberId; //空间用户id
    private String qzId; //空间ID

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
}
