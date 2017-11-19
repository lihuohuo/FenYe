package cn.happy.controller01;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Happy on 2017-08-14.
 * 所有的控制器必须以Controller结尾
 *
 *
 */
public class SecondController extends AbstractController{
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();
        //设置数据
        mv.addObject("name","Y2164班毕业薪资平均每人8k");
        //设置视图
        mv.setViewName("index");
        return mv;
    }
}











