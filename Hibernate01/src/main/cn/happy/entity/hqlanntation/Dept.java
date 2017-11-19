package main.cn.happy.entity.hqlanntation;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by lenovo on 2017/10/11.
 */
@Entity
@Table(name = "Dept1011New")
public class Dept {
    @Id
    @GeneratedValue(generator = "uuidGen")
    @GenericGenerator(name = "uuidGen",strategy = "uuid")
    private String deptno;
    @Column(name = "deptname")
    private String deptname;
    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }


    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
