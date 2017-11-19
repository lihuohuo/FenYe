package cn.happy.controller05exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lenovo on 2017/8/21.
 */

@Controller
public class FirstController {

    @RequestMapping("/first")
    public String list() {
        //构造异常
        int result = 5 / 0;
        return "/WEB-INF/first/.jsp";
    }
}

