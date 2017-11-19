package cn.huohuo.jdkProxy;


import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lenovo on 2017/7/30.
 */
public class jdkTest {
    @Test
    public void jdkTest() {
      /*   final IUserDao dao = new UserDaoImpl();
        IUserDao proxy = (IUserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("before");
                Object invoke = method.invoke(dao, args);
                System.out.println("after");

                    return invoke;
            }
        });
            proxy.add();*/
        final IUserDao dao = new UserDaoImpl();
        IUserDao o = (IUserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before============");

                Object invoke = method.invoke(dao, args);


                return invoke;
            }
        });
        o.add();
    }
}
