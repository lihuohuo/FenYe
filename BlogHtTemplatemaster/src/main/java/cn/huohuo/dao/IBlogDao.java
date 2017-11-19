package cn.huohuo.dao;

import cn.smbms.BlogInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guo on 2017/7/5.
 */
public interface IBlogDao {



    public List<BlogInfo> SelectAll(@Param("pageIndex") Integer pageIndex,@Param("pageSize") Integer pageSize);

    //查询记录数
    public int getCount();

    //删除
    public void DeleteById(int id);

    //修改
    public void UpdateById(BlogInfo b);

    //添加
    public void InsertBlog(BlogInfo b);

    //查询
    public List<BlogInfo> SelectById(int id);

}
