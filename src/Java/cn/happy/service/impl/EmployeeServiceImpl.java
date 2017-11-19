package cn.happy.service.impl;

import cn.happy.Dao.impl.EmployeeDaoImpl;
import cn.happy.entity.Dept;
import cn.happy.entity.Employee;
import cn.happy.service.EmployeeService;

import java.util.List;

/**
 * Created by lenovo on 2017/6/16.
 */
public class EmployeeServiceImpl implements EmployeeService{
    //植入dao 对象
    EmployeeDaoImpl daoimpl=new EmployeeDaoImpl();

    public List<Employee> selectempl(int pageIndex, int pageSize) throws Exception {
        return daoimpl.selectempl(pageIndex,pageSize);
    }

    public int getCount() throws Exception {
        return daoimpl.getCount();
    }
    public List<Dept> selectdept() throws  Exception{

        return  daoimpl.selectdept();
    }
    public List<Employee> likeselect(String name, int deptid, int pageIndex, int pageSize) throws Exception {
        return daoimpl.likeselect(name,deptid,pageIndex,pageSize);
    }

    public int getlikeCount(String name, int deptid) throws Exception {
        return daoimpl.getlikeCount(name, deptid);
    }
}
