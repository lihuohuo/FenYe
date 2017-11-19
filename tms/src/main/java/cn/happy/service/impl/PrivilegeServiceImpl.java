package cn.happy.service.impl;


import cn.happy.dao.IPrivilegeDAO;
import cn.happy.entity.Privilege;
import cn.happy.service.IPrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2017-10-16.
 */
@Service("privilegeService")
public class PrivilegeServiceImpl implements IPrivilegeService {
    //植入DAO
    @Resource(name = "IPrivilegeDAO")
    private IPrivilegeDAO privilegeDAO;
    public List<Privilege> getAllPrivilegesByEmpId(String id) {
        return privilegeDAO.getAllPrivilegesByEmpId(id);
    }

    public List<Privilege> getAllPrivileges() {
        return privilegeDAO.getAllPrivileges();
    }

    public List<Privilege> getAllPrivilegesByRoldId(String rid) {
        return privilegeDAO.getAllPrivilegesByRoldId(rid);
    }

    public int delPrivilegeByRoldId(String rid) {
        return privilegeDAO.delPrivilegeByRoldId(rid);
    }

    public int addDataToRolePrivilege(Map<String,Object> map) {
        return privilegeDAO.addDataToRolePrivilege(map);
    }
}
