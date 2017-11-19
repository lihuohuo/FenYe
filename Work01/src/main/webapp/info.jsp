
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>问题详情</title>
</head>
<body>
<div align="center">

    <h2>常见问题检索</h2>

    分类：<span>${faqs.classes.cname}</span><br/>
    添加时间：<span>${faqs.createdate}</span><br/>
    标题：<span>${faqs.title}</span><br/>
    分类：<span>${faqs.content}</span><br/>
    <a href="/back">返回</a>

</div>
</body>
</html>
