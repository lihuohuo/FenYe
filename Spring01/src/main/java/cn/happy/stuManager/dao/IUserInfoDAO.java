package cn.happy.stuManager.dao;



import cn.happy.stuManager.entity.UserInfo;

import java.util.Map;

/**
 * Created by Happy on 2017-08-09.
 * 用户接口层
 */
public interface IUserInfoDAO {
   //01.登录方法
    public int isLogin(UserInfo info);
}
