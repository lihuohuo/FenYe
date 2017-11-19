package cn.happy.test;

import main.cn.happy.entity.LazyAndLoad.entity.StudentNew;
import main.cn.happy.entity.cn.hql02.hql.util.hibernateUtil;
import main.cn.happy.entity.hqlanntation.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/6.
 */
public class AnnotationTest {


    Configuration cfg;
    Session session;
    Transaction tx;
    SessionFactory sessionFactory;

    @Before
    public void testBefore() {
        //1.创建config对象
        cfg = new Configuration().configure();
        //2.factory
        sessionFactory = cfg.buildSessionFactory();
        //3.session
        session = sessionFactory.openSession();
        tx= session.beginTransaction();
    }

    @Test
    public void Test() {
        System.out.println("===========");
        Dept dept = new Dept();
        dept.setDeptname("开发部");
        session.save(dept);
        System.out.println(dept);
        tx.commit();
        System.out.println(" ok  !");

    }
}
