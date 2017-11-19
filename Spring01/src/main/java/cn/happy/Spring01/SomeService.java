package cn.happy.Spring01;

/**
 * Created by lenovo on 2017/7/24.
 */
public class SomeService {
    public  String info;
    public  void work(){
        System.out.println("hello"+info);

    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
