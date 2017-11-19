package cn.happy.controller;


import cn.happy.entity.Itemtypes;
import cn.happy.service.ItemtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lenovo on
 */
@Controller
public class ItemtypeController {
    @Resource
    private ItemtypeService service;

    @RequestMapping("/select")
    public String add(Itemtypes itemtypes) {
        service.select(itemtypes);
        return "index";
    }
}
