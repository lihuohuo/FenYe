package cn.happy.Spring04.service;

import cn.happy.Spring04.entity.User;

/**
 * Created by lenovo on 2017/7/24.
 */
public interface IUserService {
    // BLL   隔离作用
    public void save2(User user);

}
