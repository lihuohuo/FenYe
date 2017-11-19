package cn.happy.dao;

import cn.happy.bean.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;


/**
 *
 */
@Repository("deptDAO")
public class DeptDAOImpl implements IDeptDAO {
    @Resource(name = "sessionFactory")
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
