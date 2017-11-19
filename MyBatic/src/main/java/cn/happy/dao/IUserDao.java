package cn.happy.dao;

import cn.happy.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/6/30.
 */


public interface IUserDao {
    //01.查询所有
    public List<UserInfo> getAllList();

    //02.按照部门编号检索特定部门
    public UserInfo getIdList(int id);

    //03.根据部门编号检索特定部门：：：：返回的是ResultMap
    public UserInfo getgetDeptResultMapById(int id);

    //04.添加
    public int addlist(UserInfo userInfo);


    /*05.  修改*/
    public int modify(UserInfo userInfo);

    //06.  删除
    public void deleteUser(int id);
    //if判断
    public List<UserInfo> ifselectList(@Param("name") String name);
    // where
    public List<UserInfo> whereselectList(@Param("name") String name);
    // if   trim
    public List<UserInfo> trimselectList(@Param("name") String name);

    /*05.  修改*/
    public int setmodify(UserInfo userInfo);

    public int iftrimmodify(UserInfo userInfo);

    public List<UserInfo> ForEachs(String[] names);

    public List<UserInfo> ForEachsList(List<String> name);
}