package cn.happy.controller;

import cn.happy.bean.Dept;
import cn.happy.service.IDeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;

/**
 * Created by lenovo on 2017/10/13.
 */
@Controller
public class DeptController {
    @Resource
    private IDeptService service;

    @RequestMapping("/addDept")
    public String add(Dept dept) {
        service.addDept(dept);
        return "index";
    }
}
