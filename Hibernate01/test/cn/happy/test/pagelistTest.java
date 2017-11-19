package cn.happy.test;

import main.cn.happy.entity.cn.hql02.hql.dynamic.Emp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2017/10/6.
 */
public class pagelistTest {

    Configuration cfg;
    Session session;
    Transaction transaction;
    SessionFactory sessionFactory;

    @Before
    public void testBefore() {
        //1.创建config对象
        cfg = new Configuration().configure();
        //2.factory
        sessionFactory = cfg.buildSessionFactory();
        //3.session
        session = sessionFactory.openSession();
        // tx= session.beginTransaction();
    }


    @Test
    public void pagelistTest(){
        String hql = "from Emp";
        Query query = session.createQuery(hql);
        int  pageIndex=2;
        int pageSize=3;
        query.setFirstResult((pageIndex-1)*pageSize);
        query.setMaxResults(pageSize);
        List<Emp> list = query.list();
        for(Emp emp : list){
            System.out.println(emp.getEname());
        }

    }


}
