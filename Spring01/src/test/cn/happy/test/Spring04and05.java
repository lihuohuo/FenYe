package cn.happy.test;

import cn.happy.Spring04.entity.User;
import cn.happy.Spring04.service.IUserService;
import cn.happy.Spring05DIXml.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring04and05 {
    /* 04    aop 测试 */
    @Test
    public void test04() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContextspring01aop.xml");
        IUserService stu = (IUserService) ctx.getBean("userService");
        User user = new User();
        user.setUsername("123");
        stu.save2(user);

    }

    @Test
    public void test05DIXML() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXml.xml");
        Student s = (Student) ctx.getBean("stu");
        System.out.println(s);

    }

    @Test
    public void test05DIXMLp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05DIXml.xml");
        Student s = (Student) ctx.getBean("stu2");
        System.out.println(s);

    }
}
