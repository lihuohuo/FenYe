package cn.happy.util;


import cn.happy.entity.News;
import cn.happy.entity.Talk;

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

    //总页数
    private int totalPages;

    //总记录数
    private int totalRecords;

    private List<News> list;

    public List<News> getList() {
        return list;
    }

    public void setList(List<News> list) {
        this.list = list;
    }

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
