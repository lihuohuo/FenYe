package cn.happy.dao;

import cn.happy.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/7/10.
 */
public interface StudentDao {
    public List<Student> findStudent(Map<String, Object> map);

    //02 按照索引号查询
    public List<Student> findStudentParameter(String stuname, int stuage);

    //智能标签 if
    public List<Student> findByIf(Student stu);
    //条件查询
    public List<Student> findByChoose(Student stu);
}