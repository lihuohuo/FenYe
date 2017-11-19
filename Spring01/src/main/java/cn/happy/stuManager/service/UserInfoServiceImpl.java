package cn.happy.stuManager.service;


import cn.happy.stuManager.dao.IUserInfoDAO;
import cn.happy.stuManager.entity.UserInfo;

/**
 * Created by Happy on 2017-08-09.
 */
public class UserInfoServiceImpl implements IUserInfoService {
    private IUserInfoDAO dao;
    public int isLogin(UserInfo info) {
        return dao.isLogin(info);
    }

    public IUserInfoDAO getDao() {
        return dao;
    }

    public void setDao(IUserInfoDAO dao) {
        this.dao = dao;
    }
}
