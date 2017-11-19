package cn.happy.controller;



import cn.happy.entity.Peitems;

import cn.happy.service.PeitemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on
 */
@Controller
public class PeitemsController {
    @Resource(name = "PeitemsService")
    private PeitemsService service;
    @RequestMapping("/selectp")
    public String Selectp(HttpServletRequest request) {
        String id =request.getParameter("items");
      /*  List<Peitems> peitems = service.s()
        service.select(peitems);*/
        return "index";
    }



    public PeitemsService getService() {
        return service;
    }

    public void setService(PeitemsService service) {
        this.service = service;
    }
}
