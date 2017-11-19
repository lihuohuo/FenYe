package cn.happy.StudentExam.servlet;

import cn.happy.StudentExam.entity.Grade;
import cn.happy.StudentExam.service.IGradeService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/8/9.
 */
public class GradeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String action = request.getParameter("action");

        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        IGradeService service = (IGradeService) ctx.getBean("gradeService");
      /*  if (action != null) {
            String gname = request.getParameter("gname");
            //int gid = Integer.parseInt(request.getParameter("gid"));
            Grade grade = new Grade();
            // grade.setGid(3);
            grade.setGname("终极一班");
            client.addGrade(grade);
            request.getRequestDispatcher("/addGrade.jsp").forward(request, response);
        }*/
            System.out.println("========");
            List<Grade> list = service.list();
            for(Grade item:list){
                System.out.println(item.getGname());
            }
      request.setAttribute("list",list);
            request.getRequestDispatcher("/index.jsp").forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
