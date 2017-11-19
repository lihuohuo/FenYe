package cn.happy.Spring04.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/24.
 */
public class LoggerBeforeAdvice implements MethodBeforeAdvice {
    //交叉业务//通知
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("=======write log==============");
    }


}
