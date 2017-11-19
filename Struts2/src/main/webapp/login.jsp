<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <s:form method="POST" action="userAction">
      <%--性能低--%>
      请输入用户名： <s:textfield  name="userInfo.username"></s:textfield> <br/>
      <s:textfield name="userInfo.password"></s:textfield><br/>
      <s:submit value="登陆"></s:submit>
  </s:form>
</body>
</html>
