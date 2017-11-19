package cn.happy.service.impl;


import cn.happy.dao.INewsDAO;
import cn.happy.entity.News;
import cn.happy.service.INewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Happy on 2017-11-09.
 */
@Service("newsService")
public class NewsServiceImpl implements INewsService {
    @Resource(name = "INewsDAO")
    private INewsDAO newsDAO;
    public List<News> findNewsByColumn(String cid) {
        return newsDAO.findNewsByColumn(cid);
    }

    public int addNews(News news) {
        return newsDAO.addNews(news);
    }
    public News findNewsById(String nid) {
        return newsDAO.findNewsById(nid);
    }
}

