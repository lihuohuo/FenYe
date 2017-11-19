package cn.smbms;

import java.util.Date;

/**
 * Created by guo on 2017/7/5.
 */
public class UserInfo {
    private int usercode;
    private String username;
    private String userpwd;
    private Date loginlasttime;
    private int isuser;

    public int getUsercode() {
        return usercode;
    }

    public void setUsercode(int usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Date getLoginlasttime() {
        return loginlasttime;
    }

    public void setLoginlasttime(Date loginlasttime) {
        this.loginlasttime = loginlasttime;
    }

    public int getIsuser() {
        return isuser;
    }

    public void setIsuser(int isuser) {
        this.isuser = isuser;
    }
}
