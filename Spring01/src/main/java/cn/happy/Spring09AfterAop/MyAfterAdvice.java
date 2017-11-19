package cn.happy.Spring09AfterAop;


import org.springframework.aop.AfterReturningAdvice;


import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/31.
 */
public class MyAfterAdvice implements AfterReturningAdvice{


    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after");
        if (o!=null){
            System.out.println(o.toString().toUpperCase());
        }
    }
}
