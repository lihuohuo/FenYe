package cn.happy.dao;


import cn.happy.entity.Itemtypes;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 *
 */
@Repository("deptDAO")
public class ItemtypeDaoImpl implements ItemtypeDao {
    @Resource
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Itemtypes select(Itemtypes itemtypes) {
        return null;
    }
}
