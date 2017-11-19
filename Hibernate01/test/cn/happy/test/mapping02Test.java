package cn.happy.test;

import main.cn.happy.entity.hqlmapping02.Emp;
import main.cn.happy.entity.hqlmapping02.biz.HibernateBiz;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/9.
 */
public class mapping02Test {
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
        //tx= session.beginTransaction();

    }

    @Test
    public void loadGetTest() {
        HibernateBiz biz = new HibernateBiz();
        Emp emp = (Emp) biz.get(Emp.class, 1);
        System.out.println(emp.getEmpname());
    }



}
