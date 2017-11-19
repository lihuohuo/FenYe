package cn.happy.service;


import cn.happy.entity.UserInfo;
import cn.happy.util.PageUtil;

/**
 * Created by Happy on 2017-09-27.
 */
public interface IRoleService {
    //2.获取总记录数
    public int getTotalCount();
    //3.获取单页数据
    public PageUtil getOnePageData(int pageIndex, int pageSize);
    //4.获取带条件的总记录数
    public int getTotalCountByRoleName(String userName);
    //5.模糊查询
    public PageUtil getOnePageData(int pageIndex, int pageSize, UserInfo info);
}
