package cn.happy.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/10.
 */
public class Student {
    private  Integer stuno;

    public Integer getStuno() {
        return stuno;
    }

    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }

    private String stuname;

    @Override
    public String toString() {
        return "Student{" +
                "stuno=" + stuno +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                ", studate=" + studate +
                '}';
    }

    private Integer stuage;

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Date getStudate() {
        return studate;
    }

    public void setStudate(Date studate) {
        this.studate = studate;
    }

    private Date studate;
}
