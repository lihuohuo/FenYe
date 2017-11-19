package cn.happy.controller02anntation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/8/18.
 */
@Controller

public class ParameterController {


    @RequestMapping("/singleParameterArg")
    public String doFirst(String uname){
        System.out.println(uname);
        return "/WEB-INF/insert.jsp";
    }

    @RequestMapping("/ParameterObject")
        public String doSecond(UserInfo info){
        System.out.println(info.getUname());
        return  "/WEB-INF/insert.jsp";
    }

    @RequestMapping("/ListAttribute")
    public String doThird(UserInfo info){
        System.out.println(info.getUname()+"\t"+info.getBooks().get(0).getBookname());
        return  "/WEB-INF/insert.jsp";
    }

}
