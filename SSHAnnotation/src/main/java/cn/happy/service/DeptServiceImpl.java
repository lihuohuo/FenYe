package cn.happy.service;

import cn.happy.bean.Dept;
import cn.happy.dao.IDeptDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 *
 */
@Service("deptService")
public class DeptServiceImpl implements IDeptService {
    @Resource(name = "deptDAO")
    private IDeptDAO deptDAO;

    @Transactional
    public void addDept(Dept dept) {
        deptDAO.addDept(dept);
    }


    public IDeptDAO getDao() {
        return deptDAO;
    }

    public void setDao(IDeptDAO dao) {
        this.deptDAO = dao;
    }
}
