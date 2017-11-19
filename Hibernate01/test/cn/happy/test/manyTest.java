package cn.happy.test;

import main.cn.happy.entity.cn.hql02.hql.util.hibernateUtil;
import main.cn.happy.entity.manytodouble.Dept;
import main.cn.happy.entity.manytodouble.Emp;
import main.cn.happy.entity.manytomany.Employee;
import main.cn.happy.entity.manytomany.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;

/**
 * Created by lenovo on 2017/10/6.
 */
public class manyTest {

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
       /* session = sessionFactory.openSession();*/
        session = hibernateUtil.getSession();
        transaction = session.beginTransaction();


    }


    //检索指定部门下所有员工集合，打印输出 工号降序
    @Test
    public void testEmpno() {
        Dept dept = session.get(Dept.class, 1);
        for (Emp emp : dept.getEmps()) {
            System.out.println(emp.getEmpname());
        }
    }

    //添加
    @Test
    public void add() {
        Dept dept = new Dept();
        dept.setDeptname("生产部");
        Emp emp = new Emp();
        emp.setEmpname("你好");
        emp.setDept(dept);
        dept.getEmps().add(emp);
        session.save(dept);
        session.save(emp);
        System.out.println("保存成功");
        transaction.commit();
    }




    @Test
    public void addTest(){
        //雇员对象
        Employee emp1=new Employee();
        emp1.setEmpname("张三8");
        //雇员对象
        Employee emp2=new Employee();
        emp2.setEmpname("李四8");
        //项目对象
        Project pro1=new Project();
        pro1.setProname("海淀花园8");
        //项目一方，主的一方。
        pro1.getEmployees().add(emp1);
        pro1.getEmployees().add(emp2);

        emp1.getProjects().add(pro1);
        emp2.getProjects().add(pro1);


        session.save(pro1);
        session.save(emp1);
        ;      session.save(emp2);
        transaction.commit();
    }

    //01.检索特定员工参与的所有工程名称
    @Test
    public void testPrintEmpByNo(){
        Employee employee =session.get(Employee.class,1);
        System.out.println(employee.getEmpname());
        System.out.println("======================");
        for (Project pro:employee.getProjects()){
            System.out.println(pro.getProname());
        }
    }

}
