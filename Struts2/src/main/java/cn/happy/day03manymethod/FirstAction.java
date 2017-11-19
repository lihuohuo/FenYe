package cn.happy.day03manymethod;

import cn.happy.entity.UserInfo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by lenovo on 2017/10/23.
 */
public class FirstAction extends ActionSupport {
    //自己定义
    public String update() {
        return "update";
    }

    public String list() {
        System.out.println("list");
        return "list";
    }
    public String del(){
        System.out.println("del");
        return "del";
    }
}
