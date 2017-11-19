package cn.happy.Spring17jdbctemplate.dao;


import cn.happy.Spring17jdbctemplate.entity.Book;

import java.util.List;

/**
 * Created by Happy on 2017-08-02.
 */
public interface IBookDAO {
    public List<Book> findAll();
}
