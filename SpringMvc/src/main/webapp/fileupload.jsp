<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/8/30
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="textml;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  enctype="multipart/form-data" method="post" action="<%=path%>/first">

    <input type="file" name="upload" />
    <input type="file" name="upload" />
    <input type="file" name="upload" />

    <input type="submit" value="提交"/>
</form>

</body>
</html>
