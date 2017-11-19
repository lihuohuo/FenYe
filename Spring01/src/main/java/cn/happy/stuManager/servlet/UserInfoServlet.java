package cn.happy.stuManager.servlet;

import cn.happy.stuManager.entity.UserInfo;
import cn.happy.stuManager.service.IUserInfoService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Happy on 2017-08-09.
 */
public class UserInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.解决乱码
        request.setCharacterEncoding("utf-8");
        //2.接收用户从网线中打过来的data
        //3.拼接成一个用户对象
        String temp=request.getParameter("uname");
        String upwd=request.getParameter("upwd");
        if (temp!=null&&upwd!=null) {
            int uname=Integer.parseInt(temp);
            UserInfo info = new UserInfo();
            info.setUid(uname);
            info.setUpwd(upwd);

            //4.从Spring容器中寻址Service

            WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
            System.out.println("ctx=" + ctx);

            //5.调度方法
            IUserInfoService service = (IUserInfoService) ctx.getBean("userInfoService");
            int count = service.isLogin(info);
            if (count > 0) {
                //6.实现转发
                response.sendRedirect("/pages/index.jsp");
            } else {
                    request.getRequestDispatcher("/pages/login.jsp").forward(request, response);
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
