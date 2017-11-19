package cn.happy.stuManager.service;


import cn.happy.stuManager.entity.UserInfo;

/**
 * Created by Happy on 2017-08-09.
 * 用户业务逻辑层
 */
public interface IUserInfoService {
    //01.登录方法
    public int isLogin(UserInfo info);
}
