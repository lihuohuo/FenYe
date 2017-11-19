package cn.happy.StudentExam.service;

import cn.happy.StudentExam.dao.IGradeDAO;
import cn.happy.StudentExam.entity.Grade;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class GradeServiceImpl implements IGradeService {

    IGradeDAO dao;

    public IGradeDAO getDao() {
        return dao;
    }

    public void setDao(IGradeDAO dao) {
        this.dao = dao;
    }


    public List<Grade> list() {
        return dao.list();
    }

    public int addGrade(Grade grade) {
        return dao.addGrade(grade);
    }

    public void updateGrade(Grade grade) {
        dao.updateGrade(grade);
    }

    public void deleteGrade(int gid) {
        dao.deleteGrade(gid);
    }


}
