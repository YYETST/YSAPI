package com.yonyou.iuap.corp.demo.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料分类列表
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProClassListEntity extends BaseEntity {

    //中文名称
    private String name;
    private String code; //编码
    private long productCount; //商品数量
    private String erpCode; //外部编码
    private String parent; //上级分类id
    private String parent_name; //上级分类
    private int level; 	//层级;
    private String path; //路径;
    private long productClass; //商品分类id
    private String productClass_Name; //商品分类
    private int order; //排序
    private long template; //物料模板id
    private String template_name; //物料模板
    @JsonProperty("isEnd")
    private boolean isEnd; //是否末级
    private long id; //ID
    private String pubts; //时间戳
    private String stopstatus; //启用状态
    private String _status; //操作状态

    public ProClassListEntity(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public ProClassListEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
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

    public long getProductClass() {
        return productClass;
    }

    public void setProductClass(long productClass) {
        this.productClass = productClass;
    }

    public String getProductClass_Name() {
        return productClass_Name;
    }

    public void setProductClass_Name(String productClass_Name) {
        this.productClass_Name = productClass_Name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public long getTemplate() {
        return template;
    }

    public void setTemplate(long template) {
        this.template = template;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
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

    public String getStopstatus() {
        return stopstatus;
    }

    public void setStopstatus(String stopstatus) {
        this.stopstatus = stopstatus;
    }

    public String get_status() {
        return _status;
    }

    public void set_status(String _status) {
        this._status = _status;
    }
}
