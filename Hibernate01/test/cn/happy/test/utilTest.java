package cn.happy.test;

import main.cn.happy.entity.cn.hql02.hql.util.MyThread;
import main.cn.happy.entity.cn.hql02.hql.util.hibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/6.
 */
public class utilTest {


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
        /*session = sessionFactory.openSession();*/
        // tx= session.beginTransaction();
        session = hibernateUtil.getSession();
    }

    @Test
    public void util() {

        MyThread myThread = new MyThread();
        myThread.start();
        Session session = hibernateUtil.getSession();
        System.out.println("主线程 1" + session.hashCode());
        Session session1 = hibernateUtil.getSession();
        System.out.println("主线程2 "+ session1.hashCode());
    }
}
