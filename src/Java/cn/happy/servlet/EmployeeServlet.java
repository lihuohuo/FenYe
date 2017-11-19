package cn.happy.servlet;

import cn.happy.entity.Dept;
import cn.happy.entity.Employee;
import cn.happy.service.impl.EmployeeServiceImpl;
import cn.happy.util.Page;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lenovo on 2017/6/16.
 */

public class EmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建service
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        try {
            List<Dept> selectdept = service.selectdept();
            request.setAttribute("deptlist", selectdept);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String select = request.getParameter("select");
        if (select != null) {
            String selectname = request.getParameter("selectname");
            String deptid = request.getParameter("deptid");
            //创建一个Page对象
            Page page = new Page();
            //定义每页显示的记录数
            int pageSize = 3;
            page.setPagesize(pageSize);
            //定义当前页数
            int myIndex = 0;
            String pageIndex = request.getParameter("pageIndex");
            if (pageIndex != null) {
                myIndex = Integer.parseInt(pageIndex);
            } else {
                myIndex = 1;
            }
            page.setPageindex(myIndex);
            //定义总页数
            int totalpage = 0;
            try {
                int count = service.getlikeCount(selectname, Integer.parseInt(deptid));
                if (count % pageSize == 0) {
                    totalpage = count / pageSize;
                } else {
                    totalpage = count / pageSize + 1;
                }
                page.setPagetotalpages(totalpage);
                List<Employee> emplist = service.likeselect(selectname, Integer.parseInt(deptid), (page.getPageindex() - 1) * pageSize, page.getPagesize());
                page.setList(emplist);
                request.setAttribute("Page", page);
                request.setAttribute("selectname", selectname);
                request.setAttribute("deptid", deptid);
                request.getRequestDispatcher("/EmpList.jsp").forward(request, response);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else
        {
            //创建一个Page对象
            Page page = new Page();
            //定义每页显示的记录数
            int pageSize = 3;
            page.setPagesize(pageSize);
            //定义当前页数
            int myIndex = 0;
            String pageIndex = request.getParameter("pageIndex");
            if (pageIndex != null) {
                myIndex = Integer.parseInt(pageIndex);
            } else {
                myIndex = 1;
            }
            page.setPageindex(myIndex);
            //定义总页数
            int totalpage = 0;
            try {
                int count = service.getCount();
                if (count % pageSize == 0) {
                    totalpage = count / pageSize;
                } else {
                    totalpage = count / pageSize + 1;
                }
                page.setPagetotalpages(totalpage);
                List<Employee> emplist = service.selectempl((page.getPageindex() - 1) * pageSize, page.getPagesize());
                page.setList(emplist);
                request.setAttribute("Page", page);

               request.getRequestDispatcher("/EmpList.jsp").forward(request,response);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
