package main.cn.happy.entity.hqlmapping02.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by lenovo on 2017/10/6.
 */
public class HibernateUtil {
  /*  static ThreadLocal<Session> tlSession;
    static Configuration cfg;
    static SessionFactory sessionFactory;

    // 静态代码块
    static {
        //创建configure 对象
        cfg = new Configuration().configure();
        //
        sessionFactory = cfg.buildSessionFactory();
        tlSession = new ThreadLocal<Session>();
    }

    public static Session getSession() {
        Session session = tlSession.get();
        if (session == null) {
            session = sessionFactory.openSession();
            tlSession.set(session);

        }

        return session;
    }

    // 关闭
    public void closeSession() {
        Session session = tlSession.get();
        if (session != null) {
            session.close();
            tlSession.set(null);
        }
    }*/

    //getCurrentSession()底层实现原理
    //ThreadLocal变量
    public static final ThreadLocal<Session> threadTL=new ThreadLocal<Session>();

    //我想直接调用一个方法，获取Session
    //定义一个sessionFactory对象
    private static SessionFactory factory;
    private static Configuration cfg;
    static{
        cfg=new Configuration().configure();
        factory=cfg.buildSessionFactory();
    }
    //提供一个静态方法
    public static Session currentSession(){
        Session session=threadTL.get();
        if(session==null){  //当前线程中没有session对象
            session=factory.openSession();
            threadTL.set(session);
        }
        return session;

    }
    //关闭session
    public static void closeSession(){
        //获取线程中的session
        Session session = threadTL.get();
        if (session!=null) {
            threadTL.set(null);
            session.close();
        }
    }

}
