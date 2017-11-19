package cn.happy.StudentExam.servlet;

import cn.happy.Spring21AndMybatis.service.IBookService;
import cn.happy.StudentExam.entity.Grade;
import cn.happy.StudentExam.entity.Teacher;
import cn.happy.StudentExam.service.IGradeService;
import cn.happy.StudentExam.service.ITeacherService;
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
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        //5.调度方法
        ITeacherService service = (ITeacherService) ctx.getBean("teacherService");

        String tname = request.getParameter("tname");
        String tpwd = request.getParameter("tpwd");

        Teacher info = new Teacher();
        info.setTname(tname);
        info.setPassword(tpwd);
       // Teacher info1 = client.login(info);
        int count = service.login(info);
        System.out.println(count);
    /*    if(info1 != null){
        IGradeService service1 =(IGradeService) ctx.getBean("gradeService");
            List<Grade> list = service1.list();
            request.setAttribute("list",list);
            request.setAttribute("gid",0);
            request.getRequestDispatcher("/index.jsp").forward(request, response);*/

        if (count>0) {
            //实现转发
            System.out.println("成功");
          /*  IGradeService service1 =(IGradeService) ctx.getBean("gradeService");
            List<Grade> list = service1.list();
            request.setAttribute("list",list);*/
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else{
            System.out.println("失败");
            request.setAttribute("tname",tname);
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
