package cn.happy.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/5.
 */
public class User {
    private Integer UserCode;
    private String UserName;
    private String UserPwd;
    private Date lastLoginTime;
    private boolean IsUse;
    public Integer getUserCode() {
        return UserCode;
    }

    public void setUserCode(Integer userCode) {
        UserCode = userCode;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPwd() {
        return UserPwd;
    }

    public void setUserPwd(String userPwd) {
        UserPwd = userPwd;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public boolean isUse() {
        return IsUse;
    }

    public void setUse(boolean use) {
        IsUse = use;
    }

    public User() {
        super();
    }

    public User(Integer userCode, String userName, String userPwd, Date lastLoginTime, boolean isUse) {
        UserCode = userCode;
        UserName = userName;
        UserPwd = userPwd;
        this.lastLoginTime = lastLoginTime;
        IsUse = isUse;
    }

    public User(Integer userCode, String userPwd) {
        UserCode = userCode;
        UserPwd = userPwd;
    }
}
