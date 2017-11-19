package cn.happy.test;

import cn.happy.dao.IDeptDAO;
import cn.happy.dao.IEmpDAO;
import cn.happy.entity.Dept;
import cn.happy.entity.Emp;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by lenovo on 2017/7/10.
 */
public class MyBatisTableSelectTest {




    @Test
    //多对一
    public void testgetEmpById(){
        SqlSession session=null;
        try {
            session = MyBatisUtil.getSqlSession();
            System.out.println("aaa" + session);
            IEmpDAO dao = session.getMapper(IEmpDAO.class);
            Emp emp = dao.getEmpById(2);
            System.out.println(emp.getEmpname() + "\t"+emp.getDept().getDeptname());
        } finally {
            session.close();
        }

    }











    @Test
    //一对多
    public void findEmpsByDeptNo(){
        SqlSession session=null;
        try {
            session= MyBatisUtil.getSqlSession();
            IDeptDAO dao = session.getMapper(IDeptDAO.class);
            Dept dept= dao.findEmpsByDeptNoMultipleSQL(3);
            System.out.println(dept.getDeptname());
            for (Emp emp:dept.getEmps()) {
                System.out.println(emp.getEmpname());
            }
        } finally {
            session.close();
        }

    }

    @Test
    //智能标签choose
    public void findByListGeneric(){
        SqlSession session=null;
        try {
            session= MyBatisUtil.getSqlSession();
            IDeptDAO dao = session.getMapper(IDeptDAO.class);
            Dept dept= dao.findEmpsByDeptNo(1);
            System.out.println(dept.getDeptname());
            for (Emp emp:dept.getEmps()) {
                System.out.println(emp.getEmpname());
            }
        } finally {
            session.close();
        }

    }
}
