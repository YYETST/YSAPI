package com.yonyou.iuap.corp.demo.entity.transtype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  交易类型表体
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranstypeBodyEntity extends BaseEntity {
    private String code; //编码
    private int is_support_workflow; //流程支持
    private String name; //交易类型名称
    private String billtype_id; //单据类型
    private String memo;  //备注
    private long id;  //ID
    @JsonProperty("default")
    private boolean isdefault; //默认交易类型

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getIs_support_workflow() {
        return is_support_workflow;
    }

    public void setIs_support_workflow(int is_support_workflow) {
        this.is_support_workflow = is_support_workflow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBilltype_id() {
        return billtype_id;
    }

    public void setBilltype_id(String billtype_id) {
        this.billtype_id = billtype_id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isIsdefault() {
        return isdefault;
    }

    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }
}
