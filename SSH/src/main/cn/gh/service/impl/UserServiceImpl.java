package cn.happy.service.impl;


import cn.happy.dao.UserDao;
import cn.happy.entity.User;
import cn.happy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by guo on 2017/10/8.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public void addUser(User user) {
         userDao.addUser(user);
    }
}
