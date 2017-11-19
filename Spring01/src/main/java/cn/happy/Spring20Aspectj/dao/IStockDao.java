package cn.happy.Spring20Aspectj.dao;

import cn.happy.Spring20Aspectj.entity.Stock;

/**
 * Created by lenovo on 2017/8/4.
 */
public interface IStockDao {
    public  boolean addStock(Stock stock);
    public  boolean updateStock(int sid, int count, boolean isbuy);

}
