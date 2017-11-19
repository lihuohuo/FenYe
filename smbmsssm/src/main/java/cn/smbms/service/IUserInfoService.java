package cn.smbms.service;

import cn.smbms.entity.UserInfo;
import cn.smbms.util.PageUtil;

/**
 * Created by lenovo on 2017/8/21.
 */
public interface IUserInfoService {
 public UserInfo isLogin(UserInfo info);
 // 获取总记录数
 public  int getTotalCount();
 // 单页数据
 public PageUtil getOnePageData(int pageIndex,int pageSize);
 public int userAdd(UserInfo userInfo);
 public int updateUser(UserInfo userInfo);
 public int deleteUser(int  id);
 public UserInfo UpdateList(int id);
}
