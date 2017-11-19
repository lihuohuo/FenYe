package cn.smbms.dao;

import cn.smbms.entity.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface IUserInfoDAO {
    public UserInfo isLogin(UserInfo info);

    //2.获取总记录数
    public int getTotalCount();

    //3.获取单页数据
    public List<UserInfo> getOnePageData(Map<String, Object> map);

    public int userAdd(UserInfo userInfo);

    public int updateUser(UserInfo userInfo);
    public int deleteUser(int  id);
    public UserInfo UpdateList(int id);


}
