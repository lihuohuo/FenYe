package main.cn.happy.entity.manytomany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Happy on 2017-09-26.
 * 工程实体
 */
public class Project {
    private Integer proid;
    private String proname;
    //关联一个雇员的集合
    private Set<Employee> employees = new HashSet<Employee>();

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
