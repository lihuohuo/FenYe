<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
    function up() {
        alert("已经是第一页了,请点击下一页查看！");
    }
    function down() {
        alert("已经是最后一页了,请点击上一页查看！");
    }
    function nextPage(pageIndex){
        document.form1.action="/NewsServlet?pageIndex="+pageIndex;
        document.form1.submit();
    }
    function upPage(pageIndex){
        document.form1.action="/NewsServlet?pageIndex="+pageIndex;
        document.form1.submit();
    }

</script>
<body>
<div align="center">
<table>
    <tr>
        <td>编号</td>
        <td>标题</td>
        <td>访问量</td>
        <td>评论次数</td>
    </tr>
    <c:forEach items="${Page.list}" var="item">
        <tr>
            <td>${item.newsid}</td>
            <td><a href="/NewsServlet?action=count&id=${item.newsid}">${item.newstitle}</a></td>
            <td>${item.clickCount}</td>
            <td></td>
        </tr>
    </c:forEach>

</table>
</div>
<div align="center">
    <a href="<%=path%>/NewsServlet?pageIndex=1">首页</a> &nbsp;&nbsp;&nbsp;
    当前页:[${Page.pageIndex} / ${Page.totalPages}] &nbsp;&nbsp;&nbsp;

    <c:if test="${Page.pageIndex<Page.totalPages&&Page.pageIndex==1}">
        <a onclick="up()">上一页</a> &nbsp;&nbsp;&nbsp;
        <a href="javascript:nextPage(${Page.pageIndex+1 })">下一页</a>&nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.totalPages==1}">
        <a onclick="up()">上一页</a> &nbsp;&nbsp;&nbsp;
        <a onclick="down()">下一页</a>&nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.pageIndex>=Page.totalPages&&Page.pageIndex>1}">
        <a href="javascript:upPage(${Page.pageIndex-1})">上一页</a>
        <a onclick="down()">下一页</a> &nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.pageIndex<Page.totalPages&&Page.pageIndex!=1}">
        <a href="javascript:upPage(${Page.pageIndex-1})">上一页</a>
        <a href="javascript:nextPage(${Page.pageIndex+1 })">下一页</a>&nbsp;&nbsp;&nbsp;
    </c:if>
    <a href="<%=path%>/NewsServlet?pageIndex=${Page.totalPages}">尾页</a>
</div>
</body>
</html>
