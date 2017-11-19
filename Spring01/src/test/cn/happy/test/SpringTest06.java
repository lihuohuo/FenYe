package cn.happy.test;


import cn.happy.Spring06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lenovo on 2017/7/24.
 */
public class SpringTest06 {


    /*01    */
    @Test
    public void test01() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext06zhujie.xml");
        Student service = (Student) ctx.getBean("stu");
        System.out.println(service);


    }

}
