package cn.happy.Spring18.cn.happy.dao;

import cn.happy.Spring18.cn.happy.entity.Stock;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by lenovo on 2017/8/4.
 */
public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {
    public boolean addStock(Stock stock) {
        return false;
    }

    public boolean updateStock(int sid, int count, boolean isbuy) {
        boolean flag = false;
        String sql = null;
        if (isbuy) {
            sql = "update stock set count=count+? where sid=?";
        } else {
            sql = "update stock set count=count-? where sid=?";
        }
        int str = this.getJdbcTemplate().update(sql, count, sid);
        if (str > 0) {
            flag = true;
        }

        return flag;
    }

   /* public boolean update(int sid, int count, boolean isbuy) {
        boolean flag = false;
        String sql = null;
        if (isbuy) {
            sql = "update stock set count =count+? where sid=?";
        } else {
            sql = "update stock set count=count-? where sid=?";
        }
        int str = this.getJdbcTemplate().update(sql, count, sid);
        if (str > 0) {
            flag = true;
        }


        return flag;
    }*/
}
