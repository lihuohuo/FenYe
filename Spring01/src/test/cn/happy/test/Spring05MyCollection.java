package cn.happy.test;

import cn.happy.Spring05DIXml.MyCollection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/7/26.
 */
public class Spring05MyCollection {
    @Test
    public void test05array() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05MyCollection.xml");
        MyCollection stu = (MyCollection) ctx.getBean("array");
        System.out.println(stu.getNames());

    }

    @Test
    public void test05list() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05MyCollection.xml");
        MyCollection stu = (MyCollection) ctx.getBean("list");
        System.out.println(stu.getList());

    }


    @Test
    public void test05set() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05MyCollection.xml");
        MyCollection stu = (MyCollection) ctx.getBean("set");
        System.out.println(stu.getSet());

    }

    @Test
    public void test05map() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05MyCollection.xml");
        MyCollection stu = (MyCollection) ctx.getBean("map");
        System.out.println(stu.getMap());

    }

    @Test
    public void test05pr() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext05MyCollection.xml");
        MyCollection stu = (MyCollection) ctx.getBean("properties");
        System.out.println(stu.getProperties());

    }
}
