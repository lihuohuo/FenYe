<%--
  Created by IntelliJ IDEA.
  User: linlin
  Date: 2017/10/9
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java"
%>
<%@ page import="main.cn.happy.entity.hqlmapping02.biz.HibernateBiz"%>
<%@ page import="main.cn.happy.entity.hqlmapping02.Emp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    HibernateBiz biz=new HibernateBiz();
    Emp stu=(Emp) biz.get(Emp.class, 1);
    System.out.println(stu.getEmpname());
%>
</body>
</html>
