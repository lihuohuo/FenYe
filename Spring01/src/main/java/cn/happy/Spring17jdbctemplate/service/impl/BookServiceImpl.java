package cn.happy.Spring17jdbctemplate.service.impl;


import cn.happy.Spring17jdbctemplate.dao.IBookDAO;
import cn.happy.Spring17jdbctemplate.entity.Book;
import cn.happy.Spring17jdbctemplate.service.IBookService;

import java.util.List;

/**
 * Created by Happy on 2017-08-02.
 */
public class BookServiceImpl implements IBookService {
    private IBookDAO dao;

    public List<Book> findAll() {
        return dao.findAll();
    }

    public IBookDAO getDao() {
        return dao;
    }

    public void setDao(IBookDAO dao) {
        this.dao = dao;
    }
}
