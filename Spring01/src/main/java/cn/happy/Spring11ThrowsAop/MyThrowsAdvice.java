package cn.happy.Spring11ThrowsAop;



import org.omg.CORBA.UserException;
import org.springframework.aop.ThrowsAdvice;

/**
 * Created by lenovo on 2017/7/31.
 */
public class MyThrowsAdvice implements ThrowsAdvice {
        public void afterThrowing(UserException ex){
            System.out.println("我是增强的错误提示："+ex.getMessage());
        }
}
