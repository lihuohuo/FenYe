package cn.happy.Dao;

import cn.happy.entity.Dept;
import cn.happy.entity.Employee;

import java.util.List;

/**
 * Created by lenovo on 2017/6/16.
 */
public interface EmployeeDao {
    public List<Employee> selectempl(int pageIndex, int pageSize)throws Exception;

    public int getCount()throws Exception;

    //查询部门
    public List<Dept> selectdept() throws Exception;

    //多条件查询带分页
    public List<Employee> likeselect(String name, int deptid, int pageIndex, int pageSize) throws Exception;

    //根据条件查询记录数
    public int getlikeCount(String name, int deptid) throws Exception;

}
