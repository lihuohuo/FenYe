package cn.happy.Spring21AndMybatis.servlet;

import cn.happy.Spring21AndMybatis.entity.Book;
import cn.happy.Spring21AndMybatis.service.IBookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2017/8/7.
 */
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // 1   解决乱码
                request.setCharacterEncoding("utf-8");
                // 2   接收用户 从网线打来的 data  数据
        String bookName= request.getParameter("bookname");

        int bookPrice= Integer.parseInt(request.getParameter("bookprice"));
        Book book= new Book();
        book.setBookname(bookName);
        book.setBookprice(bookPrice);
        // 4 从Spring 容器中寻址Service
    /*    ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext21.xml");*/
        WebApplicationContext ctx= WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        IBookService service = (IBookService)ctx.getBean("bookService");
        //5 调度方法
        service.addBook(book);
        //6  实现转发
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
