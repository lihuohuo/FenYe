package cn.happy.stuManager.entity;

/**
 * Created by Happy on 2017-08-09.
 * 用户信息表
 */
public class UserInfo {
    private Integer uid;
    private String uname;
    private String upwd;
    private Integer urole;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public Integer getUrole() {
        return urole;
    }

    public void setUrole(Integer urole) {
        this.urole = urole;
    }
}
