<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form name="form1" method="post" action="login2">
    请输入用户名： <s:textfield name="user.uname"></s:textfield> <br/>
    <s:textfield name="user.upwd"></s:textfield><br/>
    <s:submit value="登陆"></s:submit>
</s:form>
</body>
</html>
