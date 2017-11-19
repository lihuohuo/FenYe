package cn.happy.test;


import cn.happy.Spring21AndMybatis.entity.Book;
import cn.happy.Spring21AndMybatis.service.IBookService;
import cn.happy.StudentExam.entity.Grade;
import cn.happy.StudentExam.entity.Teacher;
import cn.happy.StudentExam.service.IGradeService;
import cn.happy.StudentExam.service.ITeacherService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring21AndMyBatis {

    @Test
    public void test01() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext21.xml");
     /*   SomeService client = (SomeService) ctx.getBean("someService");
        client.setInfo("Spring04and05");
        client.work();*/
        IBookService service = (IBookService) ctx.getBean("bookService");
        Book book = new Book();
       book.setBookname("11");
       book.setBookprice(12);
        service.addBook(book);
    }
    @Test
public void test0() {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextStudentExam.xml");
     /*   SomeService client = (SomeService) ctx.getBean("someService");
        client.setInfo("Spring04and05");
        client.work();*/
    ITeacherService service = (ITeacherService) ctx.getBean("teacherService");
    Teacher book = new Teacher();
    book.setTid(11);
    book.setTname("11");
    service.login(book);
}
    @Test
    public void tes() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextStudentExam.xml");

        IGradeService service = (IGradeService) ctx.getBean("gradeService");
        List<Grade> list=service.list();
        for(Grade item:list){
            System.out.println(item.getGname());

        }
    }

}
