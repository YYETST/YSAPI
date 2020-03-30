package com.yonyou.iuap.corp.demo.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;
import com.yonyou.iuap.corp.demo.entity.Language;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料分类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProClassEntity extends BaseEntity {

    public ProClassEntity(Language name, String code) {
        this.name = name;
        this.code = code;
    }

    public ProClassEntity() {
    }

    private Language name; //物料分类名称
    private String code; //编码
    private long productCount; //商品数量
    private String erpCode; //外部编码
    private long parent; //上级分类id
    private String parent_name; //上级分类
    private int level; 	//层级;
    private String path; //路径;
    private int order; //排序
    @JsonProperty("isEnd")
    private boolean isEnd; //是否末级
    private long id; //ID
    private String pubts; //时间戳
    private int stopstatus; //启用状态
    private String _status; //操作状态
    private String remark;

    public Language getName() {
        return name;
    }

    public void setName(Language name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getProductCount() {
        return productCount;
    }

    public void setProductCount(long productCount) {
        this.productCount = productCount;
    }

    public String getErpCode() {
        return erpCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public long getParent() {
        return parent;
    }

    public void setParent(long parent) {
        this.parent = parent;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
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

    public int getStopstatus() {
        return stopstatus;
    }

    public void setStopstatus(int stopstatus) {
        this.stopstatus = stopstatus;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
