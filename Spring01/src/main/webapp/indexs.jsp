<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>考勤系统</title>
</head>
<body>
<div align="center">
    <h1>欢迎考勤管理系统</h1>
    <div>
        <form method="post" action="">
            根据日期进行查询：<input type="date" name=""/>
            <input type="submit" value="查询"/>
        </form>
    </div>
    <form method="post" action="">
        <table>
            <tr>
                <td>学员姓名</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>guohua</td>
                <td><input type="radio" name="" value="出勤"/></td>
                <td><input type="radio" name="" value="未出勤"/></td>
                <td><input type="radio" name="" value="事假"/></td>
                <td><input type="radio" name="" value="病假"/></td>
            </tr>


        </table>
        <input type="submit" value="提交"/>
    </form>
</div>
</body>
</html>
