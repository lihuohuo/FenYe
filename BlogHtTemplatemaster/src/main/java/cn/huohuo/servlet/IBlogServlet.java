package cn.huohuo.servlet;

import cn.huohuo.dao.IBlogDao;
import cn.smbms.BlogInfo;
import cn.huohuo.util.Page;
import com.alibaba.fastjson.JSON;
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
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by guo on 2017/7/5.
 */
public class IBlogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InputStream stream= Resources.getResourceAsStream("MyBatis-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(stream);
        //软
        SqlSession session = factory.openSession();
        IBlogDao dao = session.getMapper(IBlogDao.class);

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/xml;utf-8");
        response.setHeader("ContentType", "text/tml;utf-8");

        String action = request.getParameter("action");
        if(action!=null){
            if("list".equals(action)){
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
                    List<BlogInfo> list = dao.SelectAll((page.getPageIndex() - 1) * pageSize, page.getPageSize());
                    page.setList(list);
                    request.setAttribute("Page", page);
                    request.getRequestDispatcher("/Blog/html/bloglist.jsp").forward(request,response);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }else if("insert".equals(action)){
                String author=request.getParameter("blogAuthor");
                String address=request.getParameter("blogAdderss");

                BlogInfo b=new BlogInfo();
                b.setBlogauthor(author);
                b.setBlogaddress(address);
                dao.InsertBlog(b);
                session.commit();
                request.getRequestDispatcher("IBlogServlet?action=list").forward(request,response);

            }else if("updcc".equals(action)){

                String id=request.getParameter("id");
                System.out.println(id);
                List<BlogInfo> list = dao.SelectById(new Integer(id));

                String list1 = JSON.toJSONString(list);
                PrintWriter writer = response.getWriter();
                writer.print(list1);
                System.out.println(list1);
                writer.close();


            }else if("upd".equals(action)){

                String id=request.getParameter("blogId");

                String author=request.getParameter("blogAuthor");
                String address=request.getParameter("blogAddress");

                BlogInfo b=new BlogInfo();
                b.setBlogaddress(address);
                b.setBlogid(new Integer(id));
                b.setBlogauthor(author);
                dao.UpdateById(b);
                String pageIndex=request.getParameter("pageIndex");
                session.commit();
                request.getRequestDispatcher("IBlogServlet?action=list&pageIndex="+pageIndex).forward(request,response);
            }else if("del".equals(action)){
                System.out.println("12312312");
                String id=request.getParameter("blogId");
                System.out.println(id);
                dao.DeleteById(new Integer(id));
                String pageIndex=request.getParameter("pageIndex");
                session.commit();
                request.getRequestDispatcher("IBlogServlet?action=list&pageIndex"+pageIndex).forward(request,response);
            }
        }else{
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
                List<BlogInfo> list = dao.SelectAll((page.getPageIndex() - 1) * pageSize, page.getPageSize());
                page.setList(list);
                request.setAttribute("Page", page);
                request.getRequestDispatcher("/Blog/html/bloglist.jsp").forward(request,response);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
