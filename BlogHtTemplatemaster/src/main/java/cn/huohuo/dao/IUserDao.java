package cn.huohuo.dao;

import cn.smbms.UserInfo;

/**
 * Created by guo on 2017/7/5.
 */
public interface IUserDao {
    public boolean Login(UserInfo u);
    public UserInfo SelectAll(UserInfo u);
}
