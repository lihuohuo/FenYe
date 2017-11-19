package cn.happy.controller07annotionexception;


import cn.happy.controller07annotionexception.entity.UserInfo;
import cn.happy.controller07annotionexception.exceptions.AgeException;
import cn.happy.controller07annotionexception.exceptions.NameException;
import cn.happy.controller07annotionexception.exceptions.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Happy on 2017-08-28.
 */
@Controller
public class FirstController {

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView  mv=new ModelAndView();
        if (ex instanceof NameException){
            mv.setViewName("/error/nameerrors.jsp");
        }
        if (ex instanceof AgeException){
            mv.setViewName("/error/ageerrors.jsp");
        }
        return mv;
    }

    @RequestMapping("/annotationException")
    public String doFirst(UserInfo info) throws UserException {

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
