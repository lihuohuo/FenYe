package main.cn.happy.entity.hqlneilianjie;

/**
 * Created by Happy on 2017-09-25.
 */
public class Emp {
    private Integer empno;
    private String empname;
    private Dept dept=new Dept();

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
