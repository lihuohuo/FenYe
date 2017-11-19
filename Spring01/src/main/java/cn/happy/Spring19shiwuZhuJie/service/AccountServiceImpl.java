package cn.happy.Spring19shiwuZhuJie.service;

import cn.happy.Spring19shiwuZhuJie.dao.IAccountDao;
import cn.happy.Spring19shiwuZhuJie.dao.IStockDao;
import cn.happy.Spring19shiwuZhuJie.entity.Account;
import cn.happy.Spring19shiwuZhuJie.entity.Stock;
import cn.happy.Spring19shiwuZhuJie.entity.StockException;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2017/8/4.
 */
public class AccountServiceImpl implements IAccountSevice {
    private IAccountDao accountdao ;
    private IStockDao stockDao;

    public IAccountDao getAccountdao() {
        return accountdao;
    }

    public void setAccountdao(IAccountDao accountdao) {
        this.accountdao = accountdao;
    }

    public IStockDao getStockDao() {
        return stockDao;
    }

    public void setStockDao(IStockDao stockDao) {
        this.stockDao = stockDao;
    }

    public boolean addAccount(Account account) {
        return false;
    }

    public boolean addStock(Stock stock) {
        return false;
    }


    //事务
   //@Transactional(rollbackFor = StockException.class)
    public void buyStock(int sid, int count, int aid, double money) throws StockException {
            //默认    是购买
        boolean isbuy= true;
        //01 账户
        accountdao.updateAccount(aid,money,isbuy);
        //编译时异常  SPring处理 方式
        //编译时 SPring事务自动提交

        //运行时   SPring 自动回滚
        if (1==1){
            throw new StockException();

        }
        stockDao.updateStock(sid,count,isbuy);
    }
}
