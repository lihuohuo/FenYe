package main.cn.happy.entity.hqlmapping02.dao;

import main.cn.happy.entity.hqlmapping02.util.HibernateUtil;

import java.io.Serializable;

/**
 * Created by lenovo on 2017/10/9.
 */
public class HibernateDao {

    public Object get(Class clazz, Serializable id) {

        Object result = HibernateUtil.currentSession().load(clazz, id);
        return result;
    }
}