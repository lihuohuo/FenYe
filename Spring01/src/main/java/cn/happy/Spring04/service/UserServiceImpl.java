package cn.happy.Spring04.service;

import cn.happy.Spring04.dao.IUserDao;
import cn.happy.Spring04.entity.User;

/**
 * Created by lenovo on 2017/7/24.
 */
public class UserServiceImpl implements IUserService {
    private IUserDao dao;

    public void save2(User user) {

        //主业务
        dao.save(user);

    }


    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }
}
