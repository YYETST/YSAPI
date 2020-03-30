package com.yonyou.iuap.corp.demo.entity.product;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/30
 * @des
 */
public class ProClassSaveEntity {
    private String name;
    private String code;
    private int stopstatus;
    private String _status;
    private boolean isEnd;

    public ProClassSaveEntity(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public ProClassSaveEntity() {
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

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
