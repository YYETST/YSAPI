package com.yonyou.iuap.corp.demo.entity.vendor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  供应商表头
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorInfoHeadEntity extends BaseEntity {

    private int pageIndex;
    private int pageSize;
    private int recordCount;
    private List<VendorInfoBodyEntity> recordList;
    private int pageCount;
    private int beginPageIndex;
    private int endPageIndex;
    private String pubts;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public List<VendorInfoBodyEntity> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<VendorInfoBodyEntity> recordList) {
        this.recordList = recordList;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getBeginPageIndex() {
        return beginPageIndex;
    }

    public void setBeginPageIndex(int beginPageIndex) {
        this.beginPageIndex = beginPageIndex;
    }

    public int getEndPageIndex() {
        return endPageIndex;
    }

    public void setEndPageIndex(int endPageIndex) {
        this.endPageIndex = endPageIndex;
    }

    public String getPubts() {
        return pubts;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

}
