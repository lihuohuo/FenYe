package cn.happy.day06result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Result;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import java.util.Map;

/**
 * Created by Happy on 2017-10-22.
 */
public class UserAction extends ActionSupport {
    public  String del(){
        return "del";
    }

    public  String list(){
        Map<String,Object> request = (Map<String,Object>)ActionContext.getContext().get("request");
        request.put("uname","张三");
        return  "list";
    }

    public String add(){

        Map<String,Object> request = (Map<String,Object>)ActionContext.getContext().get("request");
        Object uname = request.get("uname");
        System.out.println(uname+"================");
        request.put("info","数据");
        return "add";
    }
}
