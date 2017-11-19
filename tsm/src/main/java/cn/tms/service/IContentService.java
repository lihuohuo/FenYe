package cn.tms.service;

import cn.tms.entity.Content;
import cn.tms.entity.News;
import cn.tms.entity.Status;


import java.util.List;

/**
 * Created by lenovo on 2017/11/6.
 */
public interface IContentService {
    //查询所有的内容
    public List<Content> getAllContent();
    public List<News> getAllNews(String columnname);
    public List<Status> getAllStatus();
    public List<News> selectAllnews(String columnname,int status,String title);
    public int addnews(News news);

}
