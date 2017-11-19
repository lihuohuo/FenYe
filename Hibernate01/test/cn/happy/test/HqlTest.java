package cn.happy.test;

import main.cn.happy.entity.cn.hql02.hql.Dept;
import main.cn.happy.entity.cn.hql02.hql.dynamic.Emp;
import main.cn.happy.entity.cn.hql02.hql.dynamic.viewmodel.EmpCondition;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by lenovo on 2017/9/25.
 */
public class HqlTest {
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
        // tx= session.beginTransaction();
    }


    @Test
    //检索部门集合  所有记录
    public void Test() {
        String hql = "from  Dept";
        Query query = session.createQuery(hql);
     /*   Dept dd = new Dept();*/
        List<Dept> list = query.list();
        for (Dept dept : list) {
            System.out.println(dept.getDeptname());
        }
        System.out.println("ok !! ");
    }

    // 检索部分记录
    @Test
    public void test01() {
        String hql = "    from  Dept where deptname='开发部门'";
        Query query = session.createQuery(hql);
        List<Dept> depts = query.list();
        for (Dept dept : depts) {
            System.out.println(dept.getDeptname());
        }
        System.out.println("ok -");

    }

    @Test
    //检索部门列
    public void test02() {
        String hql = "select deptname from Dept ";
        Query query = session.createQuery(hql);
        List<Object> depts = query.list();
        System.out.println(depts);
        System.out.println("ok ");


    }

    @Test
    //检索多列  部门集合
    public void test03() {
        String hql = "select deptno,deptname from Dept";
        Query query = session.createQuery(hql);
        List<Object[]> list = query.list();
        for (Object[] objects : list) {
            System.out.println(objects);

        }
    }

    @Test
    //检索部分列   投影出强类型 dept 对象
    public void test04() {
        String hql = "select new Dept(deptno,deptname) from Dept";
        Query query = session.createQuery(hql);
        List<Dept> list = query.list();
        for (Dept dept : list) {
            System.out.println(dept.getDeptname());
        }
    }

    @Test
    //参数绑定  --- 参数位置绑定
    public void test05() {
        String hql = "from Dept where deptname=?";
        Query query = session.createQuery(hql);
        query.setParameter(0, "开发");
        List<Dept> list = query.list();
        for (Dept dept : list) {
            System.out.println(dept.getDeptname());

        }
    }

    @Test
    //  ---  参数名称
    public void test06() {
        String hql = "from Dept where deptname=:deptname";
        Query query = session.createQuery(hql);
        query.setParameter("deptname", "火火");
        List<Dept> list = query.list();
        for (Dept dept : list) {
            System.out.println(dept.getDeptname());
        }
    }

    @Test

    //对象属性绑定
    public void test07() {
        String hql = "from Dept dept where dept.deptname=:deptname";
        Query query = session.createQuery(hql);
        Dept dep = new Dept();
        dep.setDeptname("火火");
        query.setProperties(dep);
        List<Dept> list = query.list();
        for (Dept dept : list) {
            System.out.println(dept.getDeptname());

        }

    }

    @Test
    //03.动态查询
    /*
     查找出符合以下条件的员工信息：
    职位是店员，如：job = ’CLERK’
    工资大于1000元，如：salary > 1000
    入职时间在1981年4月1日至1985年9月9日之间
     */
    public void test08() throws ParseException {
        String hql = "from Emp where 1=1";
        EmpCondition empCondition = new EmpCondition();
        empCondition.setJob("ClERK");
        empCondition.setSal(1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date fromDate = simpleDateFormat.parse("1981-04-01");
        empCondition.setFromhiredate(fromDate);
        Date endDate = simpleDateFormat.parse("1985-09-09");
        empCondition.setEndhiredate(endDate);
        StringBuffer stringBuffer = new StringBuffer(hql);
        if (empCondition.getJob() != null) {
            stringBuffer.append("and job=:job");
        }
        if (empCondition.getSal() != null) {
            stringBuffer.append(" and sal=:sal");
        }
        if (empCondition.getFromhiredate()!=null){  //用户填写了职位作为检索条件
            stringBuffer.append(" and hiredate>=:fromhiredate");
        }
        if (empCondition.getEndhiredate()!=null){  //用户填写了职位作为检索条件
            stringBuffer.append(" and hiredate<=:endhiredate");
        }
        Query query = session.createQuery(stringBuffer.toString());
        query.setProperties(empCondition);
        List<Emp> list = query.list();
        for (Emp emp: list) {
            System.out.println(emp.getEname());
        }

    }


}
