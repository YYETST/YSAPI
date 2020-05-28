package com.yonyou.iuap.corp.demo.entity.user;

import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/5/28
 * @des
 */
public class ThirdUserEntity extends BaseEntity {

    private String thirdUcId;
    private String userId;
    private String mobile;
    private String email;
    private String userName;
    private String userCode;

    public String getThirdUcId() {
        return thirdUcId;
    }

    public void setThirdUcId(String thirdUcId) {
        this.thirdUcId = thirdUcId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
