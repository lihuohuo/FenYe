package cn.happy.controller01;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.PropertiesMethodNameResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Happy on 2017-08-14.
 * 所有的控制器必须以Controller结尾
 */
public class MyPropertiesMethodNameResolver extends PropertiesMethodNameResolver{
    public ModelAndView insert(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("insert");
        return mv;
    }

    public ModelAndView delete(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("delete");
        return mv;
    }
}











