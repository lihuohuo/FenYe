package cn.happy.controller04ReturObject;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2017/8/21.
 */

@Controller
public class FirstController {
    //  返回数值
    @ResponseBody
    @RequestMapping("/first")
    public Object doFirst() {
        return 1;
    }

    //  返回字符串
    @ResponseBody
    @RequestMapping(value = "/seconed", produces = "text/html;charset=UTF-8")
    public Object doSeconed() {
        return "科比";
    }

    //  返回自定义对象
    @ResponseBody
    @RequestMapping("/third")
    public Object doThird() {
        UserInfo info=new UserInfo();
        info.setUname("詹姆斯");
        info.setBook("33");
        return info;
    }


    //  返回 Map
    @ResponseBody
    @RequestMapping("/four")
    public Object doFour (){
        Map<String,UserInfo> map = new HashMap<String, UserInfo>();


        UserInfo info=new UserInfo();
        info.setUname("科比");

        UserInfo info1 = new UserInfo();
        info1.setUname("dog ");
        map.put(info.getUname(),info);
        map.put(info1.getUname(),info1);
        return map;
    }


    //  返回  List
    @ResponseBody
    @RequestMapping("/five")
    public Object doFive (){
        List<UserInfo> list  =new ArrayList<UserInfo>();

        UserInfo info=new UserInfo();
        info.setUname("詹姆斯");
        info.setBook("33");
        UserInfo u2= new UserInfo();
        u2.setUname("666666");
        u2.setBook("555555");

        list.add(u2);
        list.add(info);
        return list;
    }
}
