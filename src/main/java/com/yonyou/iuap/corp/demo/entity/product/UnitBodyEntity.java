package com.yonyou.iuap.corp.demo.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des 计量单位表体
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UnitBodyEntity extends BaseEntity {

    private String code; //编码
    private String name; //名称
    private String truncationType; //批发舍位方式
    private String precision; //单位精度
    private String erpCode; //外部编码
    private String creator; //创建人
    private String createDate; //创建日期
    private String stopstatus; //启用状态
    private String createTime; //创建时间
    private String modifier; //修改人
    private String modifyTime; //修改时间
    private String modifyDate; //修改日期
    private long id; //ID
    private String pubts; //时间戳
    private String _status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruncationType() {
        return truncationType;
    }

    public void setTruncationType(String truncationType) {
        this.truncationType = truncationType;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getErpCode() {
        return erpCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getStopstatus() {
        return stopstatus;
    }

    public void setStopstatus(String stopstatus) {
        this.stopstatus = stopstatus;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
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

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }
}
