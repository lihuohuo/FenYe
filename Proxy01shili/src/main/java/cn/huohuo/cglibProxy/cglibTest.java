package cn.huohuo.cglibProxy;


import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by lenovo on 2017/7/30.
 */
public class cglibTest {
    @Test
    public void cglibTest() {
        final UserDaoImpl dao = new UserDaoImpl();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(dao.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("brfore");
                method.invoke(dao, objects);
                System.out.println("after");
                return null;
            }
        });

        //02.用方法
        UserDaoImpl proxy= (UserDaoImpl)enhancer.create();
        //03.
        proxy.add();
    }
}
