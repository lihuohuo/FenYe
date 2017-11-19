package cn.huohuo.util;

import cn.smbms.BlogInfo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by guo on 2017/7/5.
 */
public class Page implements Serializable{
    //当前页
    private int pageIndex;

    //页面记录数
    private int pageSize;

    //本业显示真实数据
    private List<BlogInfo> list;

    //总页数
    private int totalPages;

    //总记录数
    private int totalRecords;


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

    public List<BlogInfo> getList() {
        return list;
    }

    public void setList(List<BlogInfo> list) {
        this.list = list;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}
