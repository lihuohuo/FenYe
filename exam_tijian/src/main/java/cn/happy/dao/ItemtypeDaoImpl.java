package cn.happy.dao;


import cn.happy.entity.Itemtypes;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 *
 */
@Transactional
@Repository("ItemtypeDao")
public class ItemtypeDaoImpl implements ItemtypeDao {
    @Resource
    private SessionFactory sessionFactory;

    public List<Itemtypes> selectitem() {

        return sessionFactory.getCurrentSession().createQuery("from Itemtypes").list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
