package com.yonyou.iuap.corp.demo.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料规格子表数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpeproBodyEntity extends BaseEntity {
    //子表数据
    private long id; 	//ID
    private long userdefid; //主表id
    private String name; //规格值名称
    private String erpName; //外部值名称
    private String orderNum;  //排序
    private String _status; //操作状态
    private String pubts; 	//时间戳

    //主表数据list中用到
    private String showItem; //规格名称
    private String erpCode; //外部编码
    private boolean isShowSpec;//单独显示
    private String userdefDesc; //规格备注
    private String defineId; //编码
    private boolean isEnabled; 	//启用状态


    public String getShowItem() {
        return showItem;
    }

    public void setShowItem(String showItem) {
        this.showItem = showItem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserdefid(long userdefid) {
        this.userdefid = userdefid;
    }

    public String getErpCode() {
        return erpCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public String getPubts() {
        return pubts;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public boolean isShowSpec() {
        return isShowSpec;
    }

    public void setShowSpec(boolean showSpec) {
        isShowSpec = showSpec;
    }

    public String getUserdefDesc() {
        return userdefDesc;
    }

    public void setUserdefDesc(String userdefDesc) {
        this.userdefDesc = userdefDesc;
    }

    public String getDefineId() {
        return defineId;
    }

    public void setDefineId(String defineId) {
        this.defineId = defineId;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getErpName() {
        return erpName;
    }

    public void setErpName(String erpName) {
        this.erpName = erpName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }
}
