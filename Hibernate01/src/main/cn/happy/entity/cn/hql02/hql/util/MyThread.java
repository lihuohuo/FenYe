package main.cn.happy.entity.cn.hql02.hql.util;

import org.hibernate.Session;

/**
 * Created by lenovo on 2017/10/6.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Session session = hibernateUtil.getSession();
        Session session2 = hibernateUtil.getSession();
        System.out.println(" 子线程=== 1  " + session.hashCode());
        System.out.println("    子线程===  2 " + session2.hashCode());
    }

}
