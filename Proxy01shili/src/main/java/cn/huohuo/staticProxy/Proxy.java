package cn.huohuo.staticProxy;

/**
 * Created by lenovo on 2017/7/30.
 */
public class Proxy implements Subject {
    private RealSubject rs;

    public void say() {
        if (rs == null) {
            rs = new RealSubject();

        }
        System.out.println(" 你好");
        rs.say();
        System.out.println("再见");
    }
}
