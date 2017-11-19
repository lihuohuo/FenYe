package main.cn.happy.entity.cn.hql02.hql.dynamic.viewmodel;

import java.util.Date;

/**
 * Created by Happy on 2017-09-25.
 */
public class EmpCondition {
    private String job;
    private Date fromhiredate;//区间 ，或者是范围
    private Date endhiredate;
    private Integer sal;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getFromhiredate() {
        return fromhiredate;
    }

    public void setFromhiredate(Date fromhiredate) {
        this.fromhiredate = fromhiredate;
    }

    public Date getEndhiredate() {
        return endhiredate;
    }

    public void setEndhiredate(Date endhiredate) {
        this.endhiredate = endhiredate;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
}
