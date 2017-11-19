package cn.huohuo.controller;


import cn.huohuo.entity.Classes;
import cn.huohuo.entity.Faqs;
import cn.huohuo.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by guo on 2017/9/1.
 */
@Controller
public class ClassesController {
    @Resource(name = "classesService")
    IClassesService iClassesService;

    @ResponseBody
    @RequestMapping("list")
    public Object getlist(String cname) {
        List<Classes> classes = iClassesService.list(cname);
        return classes;
    }


    @RequestMapping("/back")
    public String  back(){

        return "question";
    }

        @RequestMapping("getid")
    public String getid(int id,HttpServletRequest request){
        Faqs faqs = iClassesService.seleectId(id);
        request.setAttribute("faqs",faqs);
        return "info";
}
    @ResponseBody
    @RequestMapping("/add")
    public Object add(){
        List<Classes> ad = iClassesService.selectall();
        return ad;
    }
    @ResponseBody
    @RequestMapping("adds")
    public Object adds(Faqs faqs){
        Date date= new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String format= simpleDateFormat.format(date);

        faqs.setCreatedate(format);
        int i = iClassesService.Insert(faqs);
        return i;

    }

}
