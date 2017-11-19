package cn.happy.test;



import cn.happy.Spring18.cn.happy.entity.StockException;
import cn.happy.Spring18.cn.happy.service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by lenovo on 2017/7/24.
 */
public class Spring20 {

    @Test
    public void Aop08() {

        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext20.xml");
        AccountServiceImpl i=(AccountServiceImpl)ctx.getBean("accountService");
        try {
           i.buyStock(1,2,1,2000);
        } catch (StockException stockExection) {

        }

    }

}
