package cn.happy.Spring09AfterAop;

/**
 * Created by lenovo on 2017/7/31.
 */
public class SomeService implements ISomeService {
    public void say1() {
        System.out.println("111111111111");
    }

    public String say2() {
        return "我是你亲爱的返回值";
    }


    public void say3() {
        System.out.println("3333333333333333333333333333333333333");
    }
}
