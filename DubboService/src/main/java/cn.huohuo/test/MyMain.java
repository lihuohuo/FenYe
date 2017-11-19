package cn.huohuo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lenovo on 2017/8/21.
 */
public class MyMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        cx.start();
        System.out.println("任意键退出");
        //拦截
        System.in.read();
    }
}
