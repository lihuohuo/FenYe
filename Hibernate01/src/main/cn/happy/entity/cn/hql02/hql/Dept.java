package main.cn.happy.entity.cn.hql02.hql;

/**
 * Created by lenovo on 2017/9/25.
 */
public class Dept {
    private Integer deptno;
    private  String deptname;


    public Dept(){

    }


    public Dept(Integer deptno, String deptname) {
        this.deptno = deptno;
        this.deptname = deptname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }


}
