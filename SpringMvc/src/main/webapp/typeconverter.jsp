<%--
  Created by IntelliJ IDEA.
  User: Happy
  Date: 2017-08-20
  Time: 下午 6:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>类型转换</h1>
<form action="${pageContext.request.contextPath }/first" method="post">
    出生日期:<input name="birthday" value="${date}"/><br/><br/>
    年龄:<input name="age" value="${age}"/><br/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
