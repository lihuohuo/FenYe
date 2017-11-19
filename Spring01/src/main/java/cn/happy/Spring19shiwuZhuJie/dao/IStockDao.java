package cn.happy.Spring19shiwuZhuJie.dao;

import cn.happy.Spring19shiwuZhuJie.entity.Stock;

/**
 * Created by lenovo on 2017/8/4.
 */
public interface IStockDao {
    public  boolean addStock(Stock stock);
    public  boolean updateStock(int sid, int count, boolean isbuy);

}
