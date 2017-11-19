package cn.huohuo.cglibProxy;

import cn.huohuo.jdkProxy.IUserDao;

/**
 * Created by lenovo on 2017/7/30.
 */
public class UserDaoImpl implements IUserDao{
    public void add() {
        System.out.println("add  success!!!!!");
    }
}
