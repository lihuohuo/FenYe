package cn.happy.servlet;

import cn.happy.dao.INewsDao;
import cn.happy.entity.News;
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
import java.util.List;

/**
 * Created by lenovo on 2017/7/21.
 */
public class NewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream stream = Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
        SqlSession session = factory.openSession();

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/xml;utf-8");
        response.setHeader("ContentType", "text/tml;utf-8");


        INewsDao dao = session.getMapper(INewsDao.class);
        String action = request.getParameter("action");
        if (action != null) {
            if ("count".equals(action)) {
                String id = request.getParameter("id");
                int i = dao.UpdateCount(new Integer(id));
                if (i > 0) {
                    session.commit();
                    request.getRequestDispatcher("/NewsServlet?action=list").forward(request, response);
                }
            } else if ("list".equals(action)) {
                //创建一个Page对象
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

                //定义总页数
                int totalpage = 0;
                try {
                    int count = dao.getCount();
                    System.out.println(count);
                    if (count % pageSize == 0) {
                        totalpage = count / pageSize;
                    } else {
                        totalpage = count / pageSize + 1;
                    }
                    page.setTotalPages(totalpage);

                    List<News> list = dao.Select((page.getPageIndex() - 1) * pageSize, page.getPageSize());
                    page.setList(list);
                    request.setAttribute("Page", page);
                    request.getRequestDispatcher("/news.jsp").forward(request, response);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else {
            //创建一个Page对象
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

            //定义总页数
            int totalpage = 0;
            try {
                int count = dao.getCount();
                System.out.println(count);
                if (count % pageSize == 0) {
                    totalpage = count / pageSize;
                } else {
                    totalpage = count / pageSize + 1;
                }
                page.setTotalPages(totalpage);

                List<News> list = dao.Select((page.getPageIndex() - 1) * pageSize, page.getPageSize());
                page.setList(list);
                request.setAttribute("Page", page);
                request.getRequestDispatcher("/news.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
