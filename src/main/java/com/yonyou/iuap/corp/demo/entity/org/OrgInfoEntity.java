package com.yonyou.iuap.corp.demo.entity.org;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  组织实体
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrgInfoEntity extends BaseEntity {
    private int total;
    private List<OrgInfo> content;
    private int totalPages;
    private int currentPage;
    private int pageSize;
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<OrgInfo> getContent() {
        return content;
    }

    public void setContent(List<OrgInfo> content) {
        this.content = content;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "OrgInfoEntity{" +
                "total=" + total +
                ", content=" + content +
                ", totalPages=" + totalPages +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                '}';
    }
}
