package cn.tms.dao;

import cn.tms.entity.Content;
import cn.tms.entity.News;
import cn.tms.entity.Status;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by guo on 2017/11/6.
 */
public interface IContentDAO {
    //查询所有的内容
    public List<Content> getAllContent();
    public List<News> getAllNews(String syscode);
    public List<Status> getAllStatus();
    public List<News> selectAllnews(@Param("columnname") String columnname,@Param("status") int status,@Param("title") String title);
    public int addnews(News news);
}
