package cn.happy.controller06selfexception;

import cn.happy.controller06selfexception.entity.UserInfo;
import cn.happy.controller06selfexception.exceptions.AgeException;
import cn.happy.controller06selfexception.exceptions.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by lenovo on 2017/8/21.
 */

@Controller
public class FirstController {

    @RequestMapping("/selfException")
    public String doFirst(UserInfo info) throws Exception{
        if (!info.getName().equals("admin")) {
            //不是admin，抛出一个Name出错异常
            throw new NameException("用户名异常");
        }

        if (info.getAge()>60) {
            throw new AgeException("年龄异常");
        }

        return "/index.jsp";
    }
}

