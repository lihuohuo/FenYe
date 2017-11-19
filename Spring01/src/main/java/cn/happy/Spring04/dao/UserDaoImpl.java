package cn.happy.Spring04.dao;

import cn.happy.Spring04.entity.User;

/**
 * Created by lenovo on 2017/7/24.
 */
public class UserDaoImpl implements  IUserDao{
//实现类
    public void save(User user) {
        System.out.println("save  success!!!");
    }
}
