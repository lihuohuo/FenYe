package cn.happy.dao.impl;

import cn.happy.dao.UserDao;
import cn.happy.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by guo on 2017/10/10.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public void addUser(User user) {
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        getCurrentSession().save(user);
        Transaction tx = getCurrentSession().beginTransaction();
        tx.commit();
    }
}
