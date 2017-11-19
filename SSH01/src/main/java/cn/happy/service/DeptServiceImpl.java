package cn.happy.service;

import cn.happy.bean.Dept;
import cn.happy.dao.IDeptDAO;
import cn.happy.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
 */
@Service("DeptService")
public class DeptServiceImpl implements  IDeptService {
   /* private SessionFactory sessionFactory;*/
    @Resource
    private IDeptDAO dao;
    /*@Transactional*/
    @Transactional
    public int addDept(Dept dept) {
       /* Session session=sessionFactory.getCurrentSession();*/
        int result=dao.addDept(dept);
        return result;
    }


    public IDeptDAO getDao() {
        return dao;
    }

    public void setDao(IDeptDAO dao) {
        this.dao = dao;
    }
}
