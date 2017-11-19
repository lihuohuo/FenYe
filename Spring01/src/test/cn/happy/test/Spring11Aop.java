package cn.happy.test;


import cn.happy.Spring11ThrowsAop.ISomeService;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring11Aop {

    //07.aop异常增强
    @Test
    public void test07() {

        //01.运行时异常 虚拟机直接down掉
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext11ThrowsAop.xml");
        ISomeService service = (ISomeService) ctx.getBean("someProxy");
        service.say1();
    }
}
