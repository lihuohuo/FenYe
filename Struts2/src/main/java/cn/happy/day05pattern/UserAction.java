package cn.happy.day05pattern;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Happy on 2017-10-22.
 */
public class UserAction extends ActionSupport {
    public  String del(){
        return "del";
    }

    public  String list(){
        return  "list";
    }

    public String add(){
        return "add";
    }
}
