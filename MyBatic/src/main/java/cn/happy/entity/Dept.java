package cn.happy.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Happy on 2017-06-30.
 */
public class Dept implements Serializable {
    private Integer deptid;
    private String deptname;


    @Override
    public String toString() {
        return "Dept{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", emps=" + emps +
                '}';
    }

    public Dept(Integer deptid, String deptname, List<Emp> emps) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.emps = emps;
    }

    public Dept() {

    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    //植入一个Emp的集合
    private List<Emp> emps;

    public List<Emp> getEmps() {
        return emps;
    }

    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
    //alt+Insert



}
