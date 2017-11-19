<%@ page contentType="textml;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h2>Login</h2>
        <form action="<%=path%>/ListAttribute" method="post">
         用户名：   <input name="uname"/>
            图书1名称：<input name="books[0].bookname"/>
            图书2名称：<input name="books[1].bookname"/>
            <input type="submit"/>


        </form>


    </body>
</html>
