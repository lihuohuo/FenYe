package cn.bdqn.controller;

import cn.bdqn.entity.Classes;
import cn.bdqn.entity.Faqs;
import cn.bdqn.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.nio.ch.SelectorImpl;

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
    @Resource(name="classesService")
    IClassesService iClassesService;

    @ResponseBody
    @RequestMapping("/list")
    public Object getList(String cname){
        System.out.println(cname+"=========");
        List<Classes> classes = iClassesService.SelectAll(cname);
        return classes;
    }


    @RequestMapping("/getid")
    public String  getid(int id, HttpServletRequest request){
        System.out.println(id+"-----");
        Faqs faqs =iClassesService.SelectAllById(id);
        request.setAttribute("faqs",faqs);
        return "info";
    }
    @RequestMapping("/back")
    public String  back(){

        return "question";
    }
    @ResponseBody
    @RequestMapping("/add")
    public Object add(){
        List<Classes> classes = iClassesService.SelectAlls();
        return classes;
    }
    @ResponseBody
    @RequestMapping("/adds")
    public Object adds(Faqs f){
        Date date = new Date();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String format1 = format.format(date);

        f.setCreatedate(format1);
        int i = iClassesService.InsertFaqs(f);
        return i;
    }

}
