package cn.happy.controller12lanjieqi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lenovo on 2017/9/4.
 */
@Controller
public class FirstController {
    @RequestMapping("/first")
    public Object doFirst(){
        System.out.println("handle  ======== ");
        return "/index.jsp";
    }
}
