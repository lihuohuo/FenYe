package cn.happy.test;



import main.cn.happy.entity.hqlmappingOne.Emp;

import main.cn.happy.entity.manytodouble.Dept;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by lenovo on 2017/10/6.
 */
public class mappingTest {

    Configuration cfg;
    Session session;
    Transaction transaction;
    SessionFactory sessionFactory;

    @Before
    public void testBefore() {
        //1.创建config对象
        cfg = new Configuration().configure();
        //2.factory
        sessionFactory = cfg.buildSessionFactory();
        //3.session
       session = sessionFactory.openSession();
         //tx= session.beginTransaction();

    }

    //02.一对多双向关联
    @Test
    public void ManyDouble(){
        List<Dept> list = session.createQuery("from Dept").list();
        for (Dept dept : list) {
            System.out.println(dept.getDeptname());
            System.out.println("======================");
            for (main.cn.happy.entity.manytodouble.Emp emp : dept.getEmps()) {
                System.out.println(emp.getEmpname());
            }
        }
    }

    /*//多对一
    @Test
    public void testToOne() {

        Emp emp = session.get(Emp.class, 1);
        System.out.println(emp.getDept().getDeptname());
    }*/
}
