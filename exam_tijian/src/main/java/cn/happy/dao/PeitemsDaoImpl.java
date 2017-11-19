package cn.happy.dao;


import cn.happy.entity.Itemtypes;
import cn.happy.entity.Peitems;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 */
@Transactional
@Repository("PeitemsDao")
public class PeitemsDaoImpl implements PeitemsDao {
    @Resource
    private SessionFactory sessionFactory;


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public List<Peitems> selectp() {
        return sessionFactory.getCurrentSession().createQuery("from Peitems").list();
    }

    public List<Peitems> perlist(String typename) {
        return sessionFactory.getCurrentSession().createQuery("from peitems where typename=?").setParameter(0,typename).list();
    }

    public Peitems find(Integer item) {
        Peitems p = sessionFactory.getCurrentSession().get(Peitems.class,item);
        return p;
    }

    public void update(String itemname, Integer typeid, Integer necessary, String ref, Integer price, String info, Integer itemid) {

    }
}
