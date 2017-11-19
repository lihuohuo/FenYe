package cn.happy.servlet;

import cn.happy.dao.IUserDao;
import cn.happy.entity.User;
import cn.happy.util.GetAge;
import cn.happy.util.Page;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by lenovo on 2017/7/16.
 */
public class IUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/xml;utf-8");
        response.setHeader("ContentType", "text/tml;utf-8");

        InputStream is = Resources.getResourceAsStream("myBatis-config.xml");
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sf.openSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        String action = request.getParameter("action");
        if (action != null) {
            if ("login".equals(action)) {
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                User u = new User();
                u.setUserName(username);
                u.setUserPassword(password);
                final User user = dao.Login(u);
                if (user != null) {
                    request.getSession().setAttribute("username", user.getUserName());
                    request.getSession().setAttribute("userid", u.getId());
                    request.getSession().setAttribute("password", user.getUserPassword());
                    System.out.println(user.getUserPassword());
                    request.getRequestDispatcher("/welcome.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("/login.jsp").forward(request, response);
                }
            } else if ("isoldpwd".equals(action)) {
                String pwds = request.getParameter("pwds");
                String pwd = request.getParameter("pwd");
                System.out.println(pwds + pwd);
                if (pwd.equals(pwds)) {
                    response.getWriter().write("原密码正确");
                } else {
                    response.getWriter().write("原密码正确");
                }
            } else if ("updok".equals(action)) {
                String id = request.getParameter("id");
                String pwd = request.getParameter("newpassword");
                User u = new User();
                dao.UpdatePwd(u);
                session.commit();
                request.getRequestDispatcher("/login.jsp").forward(request, response);

            } else if ("list".equals(action)) {
                String userName = request.getParameter("username");
                request.setAttribute("username", userName);
                Page page = new Page();
                //定义每页显示的记录数
                int pageSize = 3;
                page.setPageSize(pageSize);
                //定义当前页数
                int myIndex = 0;
                String pageIndex = request.getParameter("pageIndex");
                if (pageIndex != null) {
                    System.out.println(pageIndex);
                    myIndex = Integer.parseInt(pageIndex);
                } else {
                    myIndex = 1;
                }
                page.setPageIndex(myIndex);
                int totalpage = 0;
                try {
                    int count = dao.getCount(userName);
                    System.out.println(count);
                    if (count % pageSize == 0) {
                        totalpage = count / pageSize;
                    } else {
                        totalpage = count / pageSize + 1;
                    }
                    page.setTotalPages(totalpage);
                    List<User> userList = dao.SelectAll(userName, (page.getPageIndex() - 1) * pageSize, page.getPageSize());
                    for (User u : userList) {
                        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        String s = format.format(u.getBirthday());
                        GetAge a = new GetAge();
                        int getage = a.getage(s);
                        u.setUserAge(getage);
                    }
                    page.setUserList(userList);
                    request.setAttribute("Page", page);
                    request.getRequestDispatcher("/userList.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
