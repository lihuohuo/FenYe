package cn.happy.test;


import main.cn.happy.entity.Dog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2017/9/17.
 */
public class FirstTest {
    Configuration cfg;
    Session session;
    Transaction transaction;
    SessionFactory sessionFactory;

    @Before
    public void Before() {
        //创建配置 对象
        cfg = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = cfg.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    public void tet() {
        //01   添加
        Dog dog = new Dog();

        dog.setName("郭华");
        dog.setAge(15);
        session.save(dog);


        //提交事务
        transaction.commit();
        //关闭session
        session.close();
    }

    /*
    *  修改记录
    * */
    @Test
    public void update() {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //事务

        Dog dog = new Dog();
        dog.setId(2);
        dog.setAge(20);
        dog.setName("小黄");
        session.update(dog);
        transaction.commit();
        session.close();
        System.out.println(" 修改成功 ！！");
    }

    //删除
    @Test
    public void delete() {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Dog dog = new Dog();
        ;
        dog.setId(21);
        session.delete(dog);
        tx.commit();
        session.close();
        System.out.println("删除 OK ！ ");


    }


}
