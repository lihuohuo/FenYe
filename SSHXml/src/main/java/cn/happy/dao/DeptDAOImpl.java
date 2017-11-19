package cn.happy.dao;

import cn.happy.bean.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 *
 */

public class DeptDAOImpl implements IDeptDAO {

    private SessionFactory sessionFactory;

    public void addDept(Dept dept) {
        Session session = sessionFactory.getCurrentSession();
        session.save(dept);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
