package cn.happy.Spring16aspectj;

import org.aspectj.lang.JoinPoint;



/**
 * Created by lenovo on 2017/8/2.
 */

//增强类

public class MyAspect {

    public  void before(){
        System.out.println("===========  before  ===============");
    }
    public  void after(JoinPoint jp){

        System.out.println(" after  ====="+jp);
    }



}
