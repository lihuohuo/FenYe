package cn.happy.test;

import main.cn.happy.entity.hqlOnetoOne注解.Card;
import main.cn.happy.entity.hqlOnetoOne注解.Humen;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lenovo on 2017/10/6.
 */
public class AnnotationAndOnetoOneTest {


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
        tx = session.beginTransaction();
    }

    @Test
    public void Test() {
        Humen humen = new Humen();
        humen.setHname("科比");

        Card card = new Card();
        card.setCname("身份证");

        card.setHumen(humen);
        session.save(humen);
        session.save(card);
        tx.commit();
        System.out.println(" ok  !");

    }
}
