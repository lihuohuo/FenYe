package cn.happy.Spring21AndMybatis.service;


import cn.happy.Spring21AndMybatis.entity.Book;
import cn.happy.Spring21AndMybatis.dao.IBookDAO;


import java.util.List;

/**
 * Created by Happy on 2017-08-02.
 */
public class BookServiceImpl implements IBookService {

    //植入dao 对象间的交互
    IBookDAO dao;
    public int addBook(Book book) {
        return dao.addBook(book);
    }




    public IBookDAO getDao() {
        return dao;
    }

    public void setDao(IBookDAO dao) {
        this.dao = dao;
    }



  /*  public List<Book> findAll() {
        return dao.findAll();
    }*/
/*
    public IBookDAO getDao() {
        return dao;
    }

    public void setDao(IBookDAO dao) {
        this.dao = dao;
    }*/
}
