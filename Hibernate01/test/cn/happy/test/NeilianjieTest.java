package cn.happy.test;



import main.cn.happy.entity.hqlneilianjie.Dept;
import main.cn.happy.entity.hqlneilianjie.Emp;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;


import java.util.List;
import java.util.ListResourceBundle;

/**
 * Created by lenovo on 2017/10/6.
 */
public class NeilianjieTest {


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
    transaction= session.beginTransaction();
      /*  session = hibernateUtil.getSession();*/
    }

    @Test
    public void util() {

        String hql = "select distinct d from Dept d inner join fetch d.emps";
        Query query = session.createQuery(hql);
        List<Dept> list =query.list();
        for (Dept dept : list){
            System.out.println(dept.getDeptname());
            System.out.println("=============");
            for(Emp emp : dept.getEmps()){
                System.out.println(emp.getEmpname());

            }
        }
    }
//查询工资小于5000的部门   子查询
    @Test
    public  void test(){
        String hql = "from Dept d where 5000>all (select e.empno from d.emps e)";
        Query query = session.createQuery(hql);
        List<Dept> list = query.list();
        for (Dept dept:list) {
            System.out.println(dept.getDeptname());
        }
    }

    @Test
    public void test2(){
        String hql = "from Emp e where e.dept.deptname='开发部'";
        Query query  = session.createQuery(hql);
        List<Emp> list=query.list();
        for (Emp emp :list) {
            System.out.println(emp.getEmpname());
        }

    }


}
