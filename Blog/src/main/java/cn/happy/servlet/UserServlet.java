package cn.happy.servlet;

import cn.happy.dao.UserDao;
import cn.happy.entity.User;
import cn.happy.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by lenovo on 2017/7/5.
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("textml;utf-8");
        response.setHeader("ContentType","textml;utf-8");

        String   uname=request.getParameter("UserCode");
        String   upwd=request.getParameter("UserPwd");
        try {
            SqlSession session = MyBatisUtil.getSqlSession();
            UserDao bl = session.getMapper(UserDao.class);
            boolean flag = bl.Login(new User(new Integer(uname),upwd));
            System.out.println(flag);
            if (flag){
                request.getRequestDispatcher("/Blog/html/main.html").forward(request,response);
            }
            session.commit();
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
