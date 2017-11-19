package cn.happy.Spring17jdbctemplate.service;



import cn.happy.Spring17jdbctemplate.entity.Book;

import java.util.List;

/**
 * Created by Happy on 2017-08-02.
 */
public interface IBookService {
    public List<Book> findAll();
}
