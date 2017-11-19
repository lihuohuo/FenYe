package cn.happy.dao;

import cn.happy.bean.Dept;
import org.hibernate.Session;

/**
 * Created by Happy on 2017-10-11.
 */
public interface IDeptDAO {
    // 添加部门方法
    public int addDept(Dept dept);


}
