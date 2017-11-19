package cn.happy.Spring18.cn.happy.dao;

import cn.happy.Spring18.cn.happy.entity.Account;

/**
 * Created by lenovo on 2017/8/4.
 */
public interface IAccountDao {
    //  开户方法
    public boolean addAccount(Account account);
//余额
    public  boolean updateAccount(int aid,double money,boolean isbuy);
}
