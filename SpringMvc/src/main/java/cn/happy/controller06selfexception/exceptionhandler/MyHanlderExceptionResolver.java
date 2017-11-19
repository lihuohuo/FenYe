package cn.happy.controller06selfexception.exceptionhandler;

import cn.happy.controller06selfexception.exceptions.AgeException;
import cn.happy.controller06selfexception.exceptions.NameException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lenovo on 2017/8/28.
 */
public class MyHanlderExceptionResolver implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
     ModelAndView mv=new ModelAndView();
     if(e instanceof NameException){
mv.setViewName("/error/nameerrors.jsp");
     }
     if(e instanceof AgeException){
         mv.setViewName("/error/ageerrors.jsp");
     }


        return mv;
    }
}
