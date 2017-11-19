package cn.happy.Dao.impl;

import cn.happy.Dao.EmployeeDao;
import cn.happy.entity.Dept;
import cn.happy.entity.Employee;
import cn.happy.util.BaseDao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/6/16.
 */
public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {
    public List<Employee> selectempl(int pageIndex, int pageSize) throws Exception {
        List<Employee> emplist = new ArrayList<Employee>();
        String sql = "select * from Employee limit ?,?";
        Object[] obj = {pageIndex, pageSize};
        ResultSet rs = executeQuery(sql, obj);
        if (rs != null) {
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmpid(rs.getInt("empid"));
                emp.setName(rs.getString("name"));
                emp.setDepartment_id(rs.getInt("department_id"));
                emp.setSalary(rs.getInt("salary"));
                emplist.add(emp);
            }
        }
        return emplist;
    }

    public int getCount() throws Exception {
        int result = 0;
        String sql = "select count(*) as num from Employee";
        ResultSet rs = executeQuery(sql);
        if (rs != null) {
            if (rs.next()) {
                result = rs.getInt("num");
            }
        }
        return result;
    }


    public List<Dept> selectdept() throws Exception {
        List<Dept> deptlist = new ArrayList<Dept>();
        String sql = "select * from department";
        ResultSet rs = executeQuery(sql);
        if (rs != null) {
            while (rs.next()) {
                Dept dept = new Dept();
                dept.setId(rs.getInt("id"));
                dept.setName(rs.getString("name"));
                deptlist.add(dept);
            }
        }
        return deptlist;
    }


    public List<Employee> likeselect(String name, int deptid, int pageIndex, int pageSize) throws Exception {
        List<Employee> emplist = new ArrayList<Employee>();
        StringBuffer buffer = new StringBuffer("select * from Employee where 1=1 ");
        if (name != null) {
            buffer.append(" and name like '%" + name + "%' ");
        }
        if (deptid != 0) {
            buffer.append(" and department_id='" + deptid + "' ");
        }
        buffer.append(" limit ?,?");
        Object[] obj = {pageIndex, pageSize};
        ResultSet rs = executeQuery(buffer.toString(), obj);
        if (rs != null) {
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmpid(rs.getInt("empid"));
                emp.setName(rs.getString("name"));
                emp.setDepartment_id(rs.getInt("department_id"));
                emp.setSalary(rs.getDouble("salary"));
                emplist.add(emp);
            }
        }
        return emplist;
    }


    public int getlikeCount(String name, int deptid) throws Exception {
        int result=0;
        StringBuffer buffer = new StringBuffer("select count(*) as num from Employee where 1=1 ");
        if (name != null) {
            buffer.append(" and name like '%" + name + "%' ");
        }
        if (deptid != 0) {
            buffer.append(" and department_id='" + deptid + "' ");
        }
        ResultSet rs = executeQuery(buffer.toString());
        if (rs != null) {
            if (rs.next()) {
                result = rs.getInt("num");
            }
        }
        return result;

    }
    /*  @Test
        public void Tests() throws Exception {
          List<Employee> emp = selectempl(0, 3);
          for (Employee emps : emp) {
              System.out.print(emps.getName());
          }
      }*/
    }
