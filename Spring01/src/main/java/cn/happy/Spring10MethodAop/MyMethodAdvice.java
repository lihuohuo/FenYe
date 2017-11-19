package cn.happy.Spring10MethodAop;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/31.
 */
public class MyMethodAdvice implements MethodInterceptor {


 /*   public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after");
        if (o!=null){
            System.out.println(o.toString().toUpperCase());
        }
    }*/

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("之前");
        Object result = methodInvocation.proceed();
        String temp = null;
        if (result != null) {
            temp = (String) result;
            temp = temp.toUpperCase();
        }
        System.out.println("之后");
        return temp;

    }
}
