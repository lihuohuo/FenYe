package cn.happy.StudentExam.service;

import cn.happy.StudentExam.dao.ILoginDAO;
import cn.happy.StudentExam.entity.Teacher;

/**
 * Created by lenovo on 2017/8/9.
 */
public class TeacherServiceImpl implements ITeacherService {
    ILoginDAO dao;



    public ILoginDAO getDao() {
        return dao;
    }

    public void setDao(ILoginDAO dao) {
        this.dao = dao;
    }


    public int login(Teacher teacher) {
        return dao.login(teacher);
    }
}
