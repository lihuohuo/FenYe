package cn.happy.Spring20Aspectj.service;

import cn.happy.Spring20Aspectj.entity.Account;
import cn.happy.Spring20Aspectj.entity.Stock;
import cn.happy.Spring20Aspectj.entity.StockException;

/**
 * Created by lenovo on 2017/8/4.
 */
public interface IAccountSevice {
    public  boolean addAccount(Account account);
    //股票初始化方法
    public  boolean addStock(Stock stock);
    public void buyStock(int sid, int count, int aid, double money) throws StockException;

}
