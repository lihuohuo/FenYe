<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>考勤系统</title>
</head>
<body>
<div align="center">
    <h1>欢迎考勤管理系统</h1>
    <div>
        <a href="/GradeServlet">111</a>
       <%-- <form method="post" action="/GradeServlet">--%>
            考勤人员查询：<select name="">
            <option value="0">请选择</option>
            <c:forEach items="${list}" var="item">
                <option value="${item.gid}">${item.gname}</option>
            </c:forEach>
        </select>
            <input type="submit" value="查询"/>
    <%--    </form>--%>
    </div>

</div>
</body>
</html>
