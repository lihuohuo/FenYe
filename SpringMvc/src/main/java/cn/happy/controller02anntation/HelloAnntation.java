package cn.happy.controller02anntation;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by lenovo on 2017/8/18.
 */
@Controller
@RequestMapping("")
public class HelloAnntation {
    @RequestMapping("/first")
    public String doFirst(){

        return "/WEB-INF/insert.jsp";
    }

    @RequestMapping("/second")
    public String doSecond(){

        return  "/WEB-INF/insert.jsp";
    }

}
