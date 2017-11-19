package main.cn.happy.entity.manytodouble;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Happy on 2017-09-25.
 */
public class Dept {
    private Integer deptno;
    private String deptname;
    private Set<Emp> emps=new HashSet<Emp>();

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
