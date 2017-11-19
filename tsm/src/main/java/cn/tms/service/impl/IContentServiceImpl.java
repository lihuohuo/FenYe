package cn.tms.service.impl;

import cn.tms.dao.IContentDAO;
import cn.tms.entity.Content;
import cn.tms.entity.News;
import cn.tms.entity.Status;
import cn.tms.service.IContentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/11/6.
 */
@Service("contentService")
public class IContentServiceImpl implements IContentService{
    @Resource(name = "IContentDAO")
    IContentDAO IContentDao;
    public List<Content> getAllContent() {
        return IContentDao.getAllContent();
    }

    public List<News> getAllNews(String columnname) {
        return IContentDao.getAllNews(columnname);
    }

    public List<Status> getAllStatus() {
        return IContentDao.getAllStatus();
    }

    public List<News> selectAllnews(String columnname,int status,String title) {
        return IContentDao.selectAllnews(columnname,status,title);
    }

    public int addnews(News news) {
        return IContentDao.addnews(news);
    }
}
