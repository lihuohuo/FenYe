package cn.happy.Spring19shiwuZhuJie.service;

import cn.happy.Spring19shiwuZhuJie.entity.Account;
import cn.happy.Spring19shiwuZhuJie.entity.Stock;
import cn.happy.Spring19shiwuZhuJie.entity.StockException;

/**
 * Created by lenovo on 2017/8/4.
 */
public interface IAccountSevice {
    public  boolean addAccount(Account account);
    //股票初始化方法
    public  boolean addStock(Stock stock);
    public void buyStock(int sid, int count, int aid, double money) throws StockException;

}
