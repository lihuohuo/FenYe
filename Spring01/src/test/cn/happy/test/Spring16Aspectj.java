package cn.happy.test;


import cn.happy.Spring16aspectj.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring16Aspectj {

    @Test
    public void Aop08() {


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext16aspectj.xml");
        ISomeService service = (ISomeService) ctx.getBean("someService");
        service.say1();
        service.say2();
        service.say3();

    }

}
