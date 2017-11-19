package cn.happy.entity;

/**
 * Created by Happy on 2017-07-10.
 */
public class Emp {
    private Integer empid;
    private Dept dept;
    private String empname;
    private Integer deptid;

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }


    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }


    public Emp() {
    }
}
