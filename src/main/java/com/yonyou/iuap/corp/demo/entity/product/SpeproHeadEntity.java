package com.yonyou.iuap.corp.demo.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料规格主表数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SpeproHeadEntity extends BaseEntity {

    private String showItem; //规格名称
    private long id; 	//ID
    private String erpCode; //外部编码
    private String pubts; 	//时间戳
    private boolean isShowSpec;//单独显示
    private String userdefDesc; //规格备注
    private String defineId; //编码
    private boolean isEnabled; 	//启用状态
    private List<SpeproBodyEntity> userdefinespecs; //子表数据
    private String _status;

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

    public List<SpeproBodyEntity> getUserdefinespecs() {
        return userdefinespecs;
    }

    public void setUserdefinespecs(List<SpeproBodyEntity> userdefinespecs) {
        this.userdefinespecs = userdefinespecs;
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

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }
}
