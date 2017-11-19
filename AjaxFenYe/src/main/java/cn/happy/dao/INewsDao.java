package cn.happy.dao;

import cn.happy.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lenovo on 2017/7/21.
 */
public interface INewsDao {
    public List<News> Select(@Param("pageIndex") int pageIndex, @Param("pageSize") int pageSize);
    public int getCount();
    public News ClickCount (int id);
    public int UpdateCount(int id);
}
