package cn.happy.util;

import cn.happy.entity.Bill;
import cn.happy.entity.User;

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
    private List<Bill> list;
    private List<User> userList;

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

    public List<Bill> getList() {
        return list;
    }

    public void setList(List<Bill> list) {
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

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
