package cn.happy.controller04ReturObject;



import java.util.List;

/**
 * Created by lenovo on 2017/8/18.
 */
public class UserInfo {
    private String uname;
    private  String book;
 /*   List<Book> books;*/

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

   /* public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
*/
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
