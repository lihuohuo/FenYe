<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/9
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加年级</title>
</head>
<body>
<h2>添加年级</h2>
<form action="/GradeServlet" method="post">
   班级名称：<input name="gname"/>
    <%--图书价格：<input name="bookprice"/>--%>
    <input name="添加" type="submit"/>
</form>

</body>
</html>
