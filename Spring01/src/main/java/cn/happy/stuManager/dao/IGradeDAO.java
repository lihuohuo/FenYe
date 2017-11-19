package cn.happy.stuManager.dao;



import cn.happy.stuManager.entity.Grade;

import java.util.List;

/**
 * Created by Happy on 2017-08-09.
 */
public interface IGradeDAO {
    //1.获取所有年级
    public List<Grade> findAll();
    //2.写一个添加年级的方法
    public int addGrade(Grade grade);
}
