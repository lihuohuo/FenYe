package cn.huohuo.controller;

import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;
import cn.huohuo.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2017/9/1.
 */
@Controller
public class ClassesContorller {
    @Resource(name = "classesService")
    IClassesService iClassesService;

    @ResponseBody
    @RequestMapping("/list")
    public Object getlist() {
        List<Classes> list = iClassesService.list();
        return list;
    }

    @RequestMapping("/getid")
    public String getid(int id, HttpServletRequest request) {

        Faqs faqs = iClassesService.listFaqsById(id);
        request.setAttribute("faqs", faqs);
        return "info";
    }
    @RequestMapping("/back")
    public String retu(){
        return  "question";
    }
    @ResponseBody
    @RequestMapping("/add")
    public  Object add(){
            List<Classes> classes = iClassesService.selectAll();
        return  classes;
    }

    @ResponseBody
    @RequestMapping("/adds")
    public  Object insert(Faqs faqs){
    int o = iClassesService.Add(faqs);
        return o;
    }
}
