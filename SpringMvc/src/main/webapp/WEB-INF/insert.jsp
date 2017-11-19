<%@ page contentType="textml;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>hello!!!!!!!!!!!!!!!!!,${name}</h2>
<img src="<%=path%>/img/1.png" />
</body>
</html>
