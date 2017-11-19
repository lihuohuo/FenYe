package cn.happy.util;

/**
 * Created by lenovo on 2017/6/16.
 */


import cn.happy.entity.Employee;

import java.util.List;


public class Page {
    private int pageindex;
    private int pagesize;
    private int pagetotalpages;
    private List<Employee> list;

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public int getPagetotalpages() {
        return pagetotalpages;
    }

    public void setPagetotalpages(int pagetotalpages) {
        this.pagetotalpages = pagetotalpages;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
