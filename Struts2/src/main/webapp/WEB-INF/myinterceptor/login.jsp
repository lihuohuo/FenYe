<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>登录22222</h2>
<s:form method="POST" action="login">
    请输入用户名： <s:textfield  name="userInfo.username"></s:textfield> <br/>
    <s:textfield name="userInfo.password"></s:textfield><br/>
    <s:submit value="登陆"></s:submit>
</s:form>
</body>
</html>
