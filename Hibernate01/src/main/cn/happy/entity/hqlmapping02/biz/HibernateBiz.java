package main.cn.happy.entity.hqlmapping02.biz;

import main.cn.happy.entity.hqlmapping02.dao.HibernateDao;
import main.cn.happy.entity.hqlmapping02.util.HibernateUtil;
import org.hibernate.Transaction;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/9.
 */
public class HibernateBiz {
    HibernateDao dao=new HibernateDao();
    public Object get(Class clazz,Serializable id){
        Transaction tx = HibernateUtil.currentSession().beginTransaction();
        Object obj= dao.get(clazz, id);
        System.out.println("==============================================");
        tx.commit();
        HibernateUtil.closeSession();
        return obj;
    }

}
