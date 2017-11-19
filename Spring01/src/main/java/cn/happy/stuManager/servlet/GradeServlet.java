package cn.happy.stuManager.servlet;


import cn.happy.stuManager.entity.Grade;
import cn.happy.stuManager.service.IGradeService;
import com.google.gson.Gson;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Happy on 2017-08-09.
 */
public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String action=request.getParameter("action");

        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        IGradeService service = (IGradeService) ctx.getBean("gradeService");
        //访问年级列表
        if("list".equals(action)){

            System.out.println("ctx=" + ctx);
            List<Grade> list = service.findAll();
            Gson tool=new Gson();
            String result = tool.toJson(list);
            response.getWriter().write(result);
        }else if ("add".equals(action)){
            Grade grade=new Grade();
            grade.setGname(request.getParameter("gname"));
            int count = service.addGrade(grade);
            response.getWriter().write(count);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
