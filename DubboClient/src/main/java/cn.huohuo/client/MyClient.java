package cn.huohuo.client;


import cn.huohuo.service.ISayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/8/21.
 */
public class MyClient {
    public void say2() {
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("ApplicationContext.xml");


        //获取服务器  那边的bean
        ISayService demoService = (ISayService) cx.getBean("demoService");

        System.out.println(demoService.say("=========================="));


    }
}
