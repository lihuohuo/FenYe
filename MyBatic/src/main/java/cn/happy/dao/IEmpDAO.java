package cn.happy.dao;



import cn.happy.entity.Emp;

/**
 * Created by Happy on 2017-07-10.
 */
public interface IEmpDAO {
    //根据员工编号查询员工对象   ，部门也可以查询
 public Emp getEmpById(Integer id);
}
