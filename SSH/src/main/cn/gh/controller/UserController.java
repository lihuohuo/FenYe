package cn.happy.controller;

import cn.happy.entity.User;
import cn.happy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guo on 2017/10/10.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("addUser")
    public String addUser(){
        User user=new User();
        user.setName("guohua");
        user.setPassword("231123");
        userService.addUser(user);
        return "1";
    }
}
