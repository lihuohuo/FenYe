<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/9
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="/LoginServlet" method="post">
    用户名： <input name="tname" />
    用户密码： <input name="tpwd" />
    <input type="submit" value="登录"/>
    <input type="submit" value="重置"/>
</form>


</body>
</html>
