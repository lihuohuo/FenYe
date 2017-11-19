package cn.happy.service;

import cn.happy.bean.Dept;
import cn.happy.dao.IDeptDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 */

public class DeptServiceImpl implements IDeptService {
    private IDeptDAO dao;

    @Transactional
    public void addDept(Dept dept) {
        dao.addDept(dept);
    }


    public IDeptDAO getDao() {
        return dao;
    }

    public void setDao(IDeptDAO dao) {
        this.dao = dao;
    }
}
