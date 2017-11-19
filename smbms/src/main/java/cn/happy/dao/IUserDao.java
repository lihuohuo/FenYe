package cn.happy.dao;

import cn.happy.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/7/12.
 */
public interface IUserDao {
    //登录
    public User Login(User u);
   // 用户列表
    public List<User> SelectAll(@Param("userName") String userName,@Param("pageIndex") int pageIndex,@Param("pageSize") int pageSize);
    public List<User> SelectAllU(@Param("pageIndex") Integer pageIndex, @Param("pageSize") Integer pageSize);
   //id 查询所有用户信息
    public List<User> selectAllUserById(int id);
    // 删除
    public void DeleUserById(int id);
    // 添加
    public void InsertUser(User u);
    //修改密码
    public void UpdatePwd(User u);
    //查询记录数
    public int getCount(@Param("username") String username);
    public int getCount1();
}
