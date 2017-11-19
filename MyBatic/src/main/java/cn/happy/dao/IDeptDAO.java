package cn.happy.dao;


//alt+Enter自动import 包
import cn.happy.entity.Dept;

import java.util.List;

/**
 * Created by Happy on 2017-06-30.
 */
public interface IDeptDAO {
    //查询所有部门
    public List<Dept> getAllList();

    //02.按照部门编号检索特定部门
    public Dept getDeptById(int id);

    //03.根据部门编号检索特定部门：：：：返回的是ResultMap
    public Dept getDeptResultMapById(int id);

    //04.添加部门
    public int addDept(Dept dept) throws Exception;

    //01.检索开发部中所有员工信息
    public Dept findEmpsByDeptNo(int deptNo);

    public Dept findEmpsByDeptNoMultipleSQL(int deptNo);
}
