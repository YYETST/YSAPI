package com.yonyou.iuap.corp.demo.entity.org;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/13
 * @des
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgInfo {

    private String id;  //ID
    private String code;  //编码
    private String name;  //名称
    private String parentid; //上级组织ID
    private String innercode; //内部编码
    private String modifiedtime; //修改时间
    private int enable; // 	状态
    private int orgtype; //是否部门
    private String orgfuns;
    private int isdefault; //是否默认

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getInnercode() {
        return innercode;
    }

    public void setInnercode(String innercode) {
        this.innercode = innercode;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    public int getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(int orgtype) {
        this.orgtype = orgtype;
    }

    public String getOrgfuns() {
        return orgfuns;
    }

    public void setOrgfuns(String orgfuns) {
        this.orgfuns = orgfuns;
    }

    public int getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(int isdefault) {
        this.isdefault = isdefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}
