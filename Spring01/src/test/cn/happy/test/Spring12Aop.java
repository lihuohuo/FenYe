package cn.happy.test;


import cn.happy.Spring12Aop.ISomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring12Aop {

   @Test
    public void Aop08(){


       ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext12Aop.xml");
       ISomeService service = (ISomeService) ctx.getBean("someProxy");
        service.say1();
        service.say2();
        service.say3();

   }

}
