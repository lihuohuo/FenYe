package cn.happy.Servlet;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by lenovo on 2017/7/14.
 */

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String uname = request.getParameter("uname");
        if (uname.equals("admin")) {
            response.getWriter().write("true1");
        } else {
            response.getWriter().write("false");
        }


/*  String str = readJsonString(request);
        System.out.println(str + "=========888888888888888");
        try {


        }*/
    }


    /*
    *   ----------    request -------------- 作为入参   服务器通过IO 读取 客户端  传入的数据
    *
    *
    * */
    public String readJsonString(HttpServletRequest request) {
        StringBuffer json = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                json.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return json.toString();


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
