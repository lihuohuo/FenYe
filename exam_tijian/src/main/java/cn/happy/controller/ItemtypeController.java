package cn.happy.controller;


import cn.happy.entity.Itemtypes;
import cn.happy.service.ItemtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 */
@Controller
public class ItemtypeController {
    @Resource(name = "ItemtypeService")
    private ItemtypeService service;


    @RequestMapping("/select")
    public String Select(HttpServletRequest request) {
        List<Itemtypes> itemtypes1 = service.selectitem();
        request.setAttribute("list", itemtypes1);
        return "list";
    }

    public ItemtypeService getService() {
        return service;
    }

    public void setService(ItemtypeService service) {
        this.service = service;
    }

}
