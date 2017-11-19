<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/28
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>

<h1>异常提升</h1>
<form action="${pageContext.request.contextPath }/first" method="post">
    姓名:<input name="name"/><br/><br/>
    年龄:<input name="age"/><br/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
