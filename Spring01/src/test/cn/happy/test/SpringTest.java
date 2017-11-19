package cn.happy.test;

import cn.happy.Spring01.SomeService;

import cn.happy.Spring02.Student;
import cn.happy.Spring03.printer.print;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lenovo on 2017/7/24.
 */
public class SpringTest {

    /*03  墨盒测试 */
    @Test
    public void test03() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        print p= (print) ctx.getBean("pp");
        System.out.println(p.getInk().inkColor());
        System.out.println(p.getP().Apaper());
        System.out.println(p);


    }


    /*02  域属性测试*/
    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ctx.getBean("stu");
        System.out.println(stu);
    }


    /*01    */
    @Test
    public void test01() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService service = (SomeService) ctx.getBean("someService");
        service.setInfo("Spring04and05");
        service.work();


    }

}
