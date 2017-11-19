package cn.huohuo.servlet;

import cn.huohuo.dao.IUserDao;
import cn.smbms.UserInfo;
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

/**
 * Created by guo on 2017/7/5.
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        InputStream stream= Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
        //软
        SqlSession session = factory.openSession();
        IUserDao dao = session.getMapper(IUserDao.class);
        String action=request.getParameter("action");
        if(action!=null){
            if("login".equals(action)){
                UserInfo u=new UserInfo();
                String usercode=request.getParameter("usercode");
                String userpwd=request.getParameter("userpwd");
                u.setUsercode(new Integer(usercode));
                u.setUserpwd(userpwd);
                boolean flag = dao.Login(u);
                if(flag){
                    UserInfo uu = dao.SelectAll(u);
                    System.out.println(uu.getUsername());
                    request.setAttribute("userCode",uu.getUsername());
                    request.getRequestDispatcher("/Blog/html/main.jsp").forward(request,response);
                }
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
