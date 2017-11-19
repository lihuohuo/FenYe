<%@ page import="java.util.List" %>
<%@ page import="cn.happy.entity.User" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="smbms/css/public.css"/>
    <link rel="stylesheet" href="smbms/css/style.css"/>
    <script type="text/javascript"  src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        function up() {
            alert("已经是第一页了,请点击下一页查看！");
        }
        function down() {
            alert("已经是最后一页了,请点击上一页查看！");
        }
        function nextPage(pageIndex){
            document.form1.action="/IUserServlet?action=list&pageIndex="+pageIndex;
            document.form1.submit();
        }
        function upPage(pageIndex){
            document.form1.action="/IUserServlet?action=list&pageIndex="+pageIndex;
            document.form1.submit();
        }
        function del(){

            var result=confirm('确认删除吗？');
            if(result==true){

                return true;
            }else{
                return false;
            }
        }
    </script>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>
    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="login.jsp">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li><a href="billList.jsp">账单管理</a></li>
                <li><a href="providerList.jsp">供应商管理</a></li>
                <li  id="active"><a href="userList.jsp">用户管理</a></li>
                <li><a href="password.jsp">密码修改</a></li>
                <li><a href="login.jsp">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面</span>
        </div>
        <div class="search">
            <form method="post" action="/IUserServlet?action=list" name="form1">


            <span>用户名：</span>
            <input type="text" value="${username}" name="username" placeholder="请输入用户名"/>
            <input type="submit" value="查询"/>
            </form>
            <a href="userAdd.jsp">添加用户</a>
        </div>
        <!--用户-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
                <th width="10%">用户编码</th>
                <th width="20%">用户名称</th>
                <th width="10%">性别</th>
                <th width="10%">年龄</th>
                <th width="10%">电话</th>
                <th width="10%">用户类型</th>
                <th width="30%">操作</th>
            </tr>
            <c:forEach items="${Page.userList}" var="item">
                <tr>
                    <td>${item.userCode}</td>
                    <td>${item.userName}</td>
                    <c:if test="${item.gender==1}">
                        <td>男</td>
                    </c:if>
                    <td>${item.userAge}</td>
                    <td>${item.phone}</td>
                    <td>${item.userRole}</td>
                    <td>
                        <a href="<%=path%>/IUserServlet?action=addc&id=${item.id}"><img src="img/read.png" alt="查看" title="查看"/></a>
                        <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                        <a href="/IUserServlet?action=del&id=${item.id}"  onclick="del()"><img src="img/schu.png" alt="删除" title="删除"/></a>
                    </td>
                </tr>

            </c:forEach>


        </table>

    </div>
</section>
<div align="center">
    <a href="<%=path%>/IUserServlet?pageIndex=1">首页</a> &nbsp;&nbsp;&nbsp;
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
    <a href="<%=path%>/IUserServlet?action=list&pageIndex=${Page.totalPages}">尾页</a>
</div>
<%--
<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeUse">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该用户吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>
--%>

<footer class="footer">
    版权归北大青鸟
</footer>

<script src="smbms/js/jquery.js"></script>
<script src="smbms/js/js.js"></script>
<script src="smbms/js/time.js"></script>

</body>
</html>