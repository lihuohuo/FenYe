package main.cn.happy.entity.cn.hql02.hql.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by lenovo on 2017/10/6.
 */
public class hibernateUtil {
    static ThreadLocal<Session> tlSession;
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
    public void Close() {
        Session session = tlSession.get();
        if (session != null) {
            session.close();
            tlSession.set(null);
        }
    }

}
