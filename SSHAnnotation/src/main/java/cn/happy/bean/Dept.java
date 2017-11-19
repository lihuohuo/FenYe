package cn.happy.bean;


import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "Dept")
public class Dept {
    @Id
    @GeneratedValue
    private Integer deptno;
    @Column
    private String deptname;

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
