package cn.happy.day04dmi;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by lenovo on 2017/10/23.
 */
public class DmiAction extends ActionSupport {
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
