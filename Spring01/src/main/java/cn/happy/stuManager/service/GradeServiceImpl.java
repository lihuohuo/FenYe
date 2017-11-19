package cn.happy.stuManager.service;




import cn.happy.stuManager.dao.IGradeDAO;
import cn.happy.stuManager.entity.Grade;

import java.util.List;

/**
 * Created by Happy on 2017-08-09.
 */
public class GradeServiceImpl implements  IGradeService {
    private IGradeDAO dao;
    public List<Grade> findAll() {
        return dao.findAll();
    }

    public int addGrade(Grade grade) {
        return dao.addGrade(grade);
    }

    public IGradeDAO getDao() {
        return dao;
    }

    public void setDao(IGradeDAO dao) {
        this.dao = dao;
    }
}
