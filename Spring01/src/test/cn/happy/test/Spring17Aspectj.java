package cn.happy.test;



import cn.happy.Spring17jdbctemplate.entity.Book;
import cn.happy.Spring17jdbctemplate.service.IBookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring17Aspectj {

    @Test
    public void Aop08() {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext17.xml");
        IBookService service = (IBookService) ctx.getBean("bookService");
        List<Book> list = service.findAll();
        for (Book item: list ){
            System.out.println(item.getBookname());
        }

    }

}
