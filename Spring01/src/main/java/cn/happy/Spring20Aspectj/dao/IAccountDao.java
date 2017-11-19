package cn.happy.Spring20Aspectj.dao;

import cn.happy.Spring20Aspectj.entity.Account;

/**
 * Created by lenovo on 2017/8/4.
 */
public interface IAccountDao {
    //  开户方法
    public boolean addAccount(Account account);
//余额
    public  boolean updateAccount(int aid, double money, boolean isbuy);
}
