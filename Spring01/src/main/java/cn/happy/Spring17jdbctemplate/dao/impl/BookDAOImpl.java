package cn.happy.Spring17jdbctemplate.dao.impl;


import cn.happy.Spring17jdbctemplate.dao.IBookDAO;
import cn.happy.Spring17jdbctemplate.entity.Book;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Happy on 2017-08-02.
 */
public class BookDAOImpl extends JdbcDaoSupport implements IBookDAO {


    public List<Book> findAll() {
        String sql = "select * from book";
        List<Book> list = this.getJdbcTemplate().query(sql, new RowMapper<Book>() {
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book book = new Book();
                book.setBookid(resultSet.getInt("bookid"));
                book.setBookname(resultSet.getString("bookname"));
                book.setBookprice(resultSet.getInt("bookprice"));


                return book;
            }


        });
        return list;
    }
}
