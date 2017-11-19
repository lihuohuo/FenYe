<%--
  Created by IntelliJ IDEA.
  User: Happy
  Date: 2017-08-21
  Time: 下午 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
   <h2>添加图书</h2>
  <form action="${pageContext.request.contextPath}/addBook" method="post">
       <input type="submit"/>
  </form>
</body>
</html>
