package cn.happy.Spring15aspectj;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by lenovo on 2017/8/2.
 */

//增强类
@Aspect
public class MyAspect {
  /*  @Before("execution(* *..Spring15aspectj.*.*(..))")
    public  void before(){
        System.out.println("===========  before  ===============");
    }
    public  void after(){

        System.out.println(" after  =====");
    }*/


    @Pointcut("execution(* *..Spring15aspectj.*.insert(..))")
    private void insert(){}

    @Pointcut("execution(* *..Spring15aspectj.*.update(..))")
    private void update(){}

    @Pointcut("execution(* *..Spring15aspectj.*.delete(..))")
    private void delete(){}



    /*@Before("insert()||update()||delete()")
    public void before(){
        System.out.println("==========before=============");
    }*/


    //后置增强
   /* @AfterReturning("execution(* *..Spring15aspectj.*.*(..))")
    public void after(){
        System.out.println("==========after=============");
    }*/



    //环绕增强
    /*@Around("execution(* *..Spring15aspectj.*.*(..))")
    public void around(ProceedingJoinPoint pjp){
        System.out.println("========before===============");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("========after===============");
    }*/


    //异常增强
    /* @AfterThrowing("execution(* *..Spring15aspectj.*.*(..))")
    public void throwing(){
        System.out.println("==========出错了=============");
    }*/

    //最终增强
    @After("execution(* *..Spring15aspectj.*.*(..))")
    public void after(){
        System.out.println("==========最终增强=============");
    }
}
