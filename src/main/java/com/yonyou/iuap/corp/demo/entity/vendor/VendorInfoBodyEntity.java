package com.yonyou.iuap.corp.demo.entity.vendor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  供应商表体
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorInfoBodyEntity extends BaseEntity {
    private long id;   //ID
    private String code;  //供应商编码
    private String name;  //供应商名称
    private long org; //管理组织主键
    private String org_code; //管理组织编码
    private String org_name; //管理组织名称
    private boolean internalunit; //内部组织
    private long vendorApplyRangeId; //vendorApplyRangeId
    private String vendorApplyRange_org; //使用组织主键
    private String vendorApplyRange_org_name; //使用组织
    private long vendorclass; //所属分类id
    private String vendorclass_code; //所属分类编码
    private String vendorclass_name; //所属分类
    private boolean retailInvestors; //散户
    private String yhttenant; //对应企业
    private String datasource; //档案来源
    private boolean isApplied; //是否被分配者使用
    private String pubts; //时间戳
    private boolean isCreator; //是否创建者
    private boolean stopstatus; //状态
    private String _status; //操作状态

    @JsonProperty("vendorextends!simplename")
    private String simplename; //简称
    @JsonProperty("vendorextends!helpcode")
    private int vendorextendsstopstatus;  //停用状态
    @JsonProperty("vendorextends!_status")
    private String vendorextends_status; //操作状态

    public VendorInfoBodyEntity(String code, String name,long vendorclass) {
        this.code = code;
        this.name = name;
        this.vendorclass = vendorclass;
    }

    public VendorInfoBodyEntity() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isInternalunit() {
        return internalunit;
    }

    public void setInternalunit(boolean internalunit) {
        this.internalunit = internalunit;
    }

    public long getVendorApplyRangeId() {
        return vendorApplyRangeId;
    }

    public void setVendorApplyRangeId(long vendorApplyRangeId) {
        this.vendorApplyRangeId = vendorApplyRangeId;
    }

    public String getVendorApplyRange_org_name() {
        return vendorApplyRange_org_name;
    }

    public void setVendorApplyRange_org_name(String vendorApplyRange_org_name) {
        this.vendorApplyRange_org_name = vendorApplyRange_org_name;
    }

    public boolean isApplied() {
        return isApplied;
    }

    public void setApplied(boolean applied) {
        isApplied = applied;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPubts() {
        return pubts;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public boolean isCreator() {
        return isCreator;
    }

    public void setCreator(boolean creator) {
        isCreator = creator;
    }

    public boolean isStopstatus() {
        return stopstatus;
    }

    public void setStopstatus(boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public String getVendorclass_name() {
        return vendorclass_name;
    }

    public void setVendorclass_name(String vendorclass_name) {
        this.vendorclass_name = vendorclass_name;
    }

    public boolean isRetailInvestors() {
        return retailInvestors;
    }

    public void setRetailInvestors(boolean retailInvestors) {
        this.retailInvestors = retailInvestors;
    }

    public long getVendorclass() {
        return vendorclass;
    }

    public void setVendorclass(long vendorclass) {
        this.vendorclass = vendorclass;
    }

    public String getYhttenant() {
        return yhttenant;
    }

    public void setYhttenant(String yhttenant) {
        this.yhttenant = yhttenant;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendorApplyRange_org() {
        return vendorApplyRange_org;
    }

    public void setVendorApplyRange_org(String vendorApplyRange_org) {
        this.vendorApplyRange_org = vendorApplyRange_org;
    }

    public long getOrg() {
        return org;
    }

    public void setOrg(long org) {
        this.org = org;
    }

    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getVendorclass_code() {
        return vendorclass_code;
    }

    public void setVendorclass_code(String vendorclass_code) {
        this.vendorclass_code = vendorclass_code;
    }

    public String getSimplename() {
        return simplename;
    }

    public void setSimplename(String simplename) {
        this.simplename = simplename;
    }

    public int getVendorextendsstopstatus() {
        return vendorextendsstopstatus;
    }

    public void setVendorextendsstopstatus(int vendorextendsstopstatus) {
        this.vendorextendsstopstatus = vendorextendsstopstatus;
    }

    public String getVendorextends_status() {
        return vendorextends_status;
    }

    public void setVendorextends_status(String vendorextends_status) {
        this.vendorextends_status = vendorextends_status;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }
}
