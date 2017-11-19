package main.cn.happy.entity.hqlmappingOne;

/**
 * Created by lenovo on 2017/10/6.
 */
public class Emp {
    private Integer empno;
    private String empname;
    //一个类的属性类型又是另外一个自定义类或者接口
    private Dept dept=new Dept();

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

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


}
