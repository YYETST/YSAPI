package com.yonyou.iuap.corp.demo.entity.transtype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  交易类型表头
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TranstypeHeadEntity extends BaseEntity {

    private String code; //编码
    private String name; //名称
    private String level; //级次
    private String id; //ID
    private Object children; //子项

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getChildren() {
        return children;
    }

    public void setChildren(Object children) {
        this.children = children;
    }
}
