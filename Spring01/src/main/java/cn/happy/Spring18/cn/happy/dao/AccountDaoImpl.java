package cn.happy.Spring18.cn.happy.dao;

import cn.happy.Spring18.cn.happy.entity.Account;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by lenovo on 2017/8/4.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {
    public boolean addAccount(Account account) {
        return false;
    }

    public boolean updateAccount(int aid, double money, boolean isbuy) {
        boolean flag = false;
        String sql = null;
        if (isbuy) {
            sql = "update account set balance=balance-? where aid=?";

        } else {
            sql = "update account set balance=balance+? where aid=?";
        }
        int count = this.getJdbcTemplate().update(sql, money, aid);
        if (count > 0) {
            flag = true;
        }
        return flag;
    }
}
