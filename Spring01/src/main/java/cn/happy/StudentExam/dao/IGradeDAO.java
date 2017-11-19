package cn.happy.StudentExam.dao;

import cn.happy.StudentExam.entity.Grade;

import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public interface IGradeDAO {

    public  List<Grade> list();
    public int addGrade(Grade grade);
    public void updateGrade(Grade grade);
    public  void deleteGrade(int  gid);
}
