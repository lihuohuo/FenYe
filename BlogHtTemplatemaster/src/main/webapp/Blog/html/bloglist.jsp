<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
    <title>博客列表</title>
    <link rel="stylesheet" href="/Blog/bootstrap/css/bootstrap.css"></link>
    <link rel="stylesheet" href="/Blog/css/myCSS.css"></link>
    <link rel="stylesheet" href="/Blog/css/Add.css"></link>
    <script type="text/javascript" src="/Blog/js/jquery-1.11.1.js"></script>
    <%-- <script type="text/javascript" src="/Blog/bootstrap/js/jquery-1.18.8.min.js"></script>--%>
    <script type="text/javascript" src="/Blog/bootstrap/js/jquery-1.12.4.js"></script>

    <script type="text/javascript" src="/Blog/bootstrap/js/bootstrap.js"></script>


    <style>

        #myimg {
            width: 319px;
            height: 319px;
        }


    </style>


    <script type="text/javascript">

        function editBlog(id,blogauthor,blogaddress, obj) {
            $("#rid").val(id);
            $("[name='blogAuthor']").val(blogauthor);
            $("[name='blogAddress']").val(blogaddress);
           /* $.ajax({
                type: "post",
                url: "IBlogServlet?action=updcc&id=" + id,
                success: function (data) {
                    var objs = eval("(" + data + ")");
                    alert("123");
                    $("[name='blogAuthor']").val(objs.blogauthor);
                    $("[name='blogAddress']").val(objs.blogaddress);
                },
                error: function (data) {
                    alert("1231231");

                }
            })*/

        }


        function up() {
            alert("已经是第一页了,请点击下一页查看！");
        }
        function down() {
            alert("已经是最后一页了,请点击上一页查看！");
        }
        function del() {

            var result = confirm('确认删除吗？');
            if (result == true) {

                return true;
            } else {
                return false;
            }
        }


        $(function () {
            $("form").submit(function () {
                var name = $("[name=blogAuthor]").val();
                var address = $("[name=blogAddress]").val();
                if (!$.trim(name)) {
                    alert("修改用户名不能为空");
                    return false;
                }
                if (!$.trim(address)) {
                    alert("修改地址不能为空");
                    return false;
                }

            })
        })


    </script>
</head>
<body>
<!-- 学伴 -->
<div class="clearfix" id="home_partner">
    <div class="container">
        <h2 class="btitle">
            有伴有爱有力量，再也不怕学习没动力
        </h2>
        <h4 class="subtitle">
            <span>
                学习从来不是轻松事，与其孤身奋战，不如找到志同道合小伙伴一起坚持到底，微冷的宇
            </span>
        </h4>
        <br>
        <div class="row text-center">
            <c:forEach items="${Page.list}" var="item">
                <div class="col-sm-4">
                    <div class="partneritem" style="position:relative;">
                        <div>

                            <a id="" class="img-responsive" src="${item.blogauthor}" alt=""></a>

                        </div>

                        <h4>
                                ${item.blogauthor}
                        </h4>
                        <p>
                            <a target="_blank" href="${item.blogaddress}">${item.blogaddress}</a>
                        </p>
                    </div>
                    <a class="a1" href="#mymodal" data-toggle="modal" onclick=" editBlog(${item.blogid},${item.blogauthor},${item.blogaddress},this) ">
                        <button>修改</button>
                    </a>
                    <a class="a2"
                       href="<%=path %>/IBlogServlet?action=del&blogId=${item.blogid}&pageIndex=${Page.pageIndex}"
                       onclick="return del()">
                        <button>删除</button>
                    </a>
                </div>

            </c:forEach>


        </div>
    </div>
</div>
<div style="text-align: center">
    <br/><br/><br/><br/>
    <a href="<%=path%>/IBlogServlet?pageIndex=1">首页</a> &nbsp;&nbsp;&nbsp;
    当前页:[${Page.pageIndex} / ${Page.totalPages}] &nbsp;&nbsp;&nbsp;
    <%-- <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.pageIndex-1}">上一页</a> &nbsp;&nbsp;&nbsp;
     <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.pageIndex+1}">下一页</a> &nbsp;&nbsp;&nbsp;--%>
    <c:if test="${Page.pageIndex<Page.totalPages&&Page.pageIndex==1}">
        <a onclick="up()">上一页</a> &nbsp;&nbsp;&nbsp;
        <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.pageIndex+1}">下一页</a> &nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.pageIndex==Page.totalPages}">
        <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.pageIndex-1}">上一页</a> &nbsp;&nbsp;&nbsp;
        <a onclick="down()">下一页</a> &nbsp;&nbsp;&nbsp;
    </c:if>
    <c:if test="${Page.pageIndex<Page.totalPages&&Page.pageIndex!=1}">
        <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.pageIndex-1}">上一页</a> &nbsp;&nbsp;&nbsp;
        <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.pageIndex+1}">下一页</a> &nbsp;&nbsp;&nbsp;
    </c:if>
    <a href="<%=path%>/IBlogServlet?action=list&pageIndex=${Page.totalPages}">尾页</a>
</div>

<%--=============================================================--%>

<!--弹出的模态框-->
<div id="mymodal" class="modal fade bs-examlpe-modal-sm"><!-- modal固定布局，上下左右都是0表示充满全屏，支持移动设备上使用触摸方式进行滚动。。-->
    <div class="modal-dialog modal-sm"><!-- modal-dialog默认相对定位，自适应宽度，大于768px时宽度600，居中-->
        <div class="modal-content"><!-- modal-content模态框的边框、边距、背景色、阴影效果。-->
            <div class="modal-header">
                <button class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">
                    修改
                    <small>微冷的雨</small>
                </h4>
            </div>
            <div class="media-body">
                <form action="/IBlogServlet?action=upd&pageIndex=${Page.pageIndex}" method="post">

                    <input type="hidden" name="blogId" value="" id="rid"/>

                    <div class="col-md-10 col-md-offset-1 myMP">
                        博客作者：<input name="blogAuthor" class="form-control" type="text" placeholder="博客作者"/>
                    </div>
                    <div class="col-md-10 col-md-offset-1 myMP">
                        博客地址： <input name="blogAddress" class="form-control" type="text" placeholder="博客地址"/>
                    </div>

                    <div class="col-md-12 myB">
                        <input class="btn btn-danger form-control" type="submit" value="修改"/>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
            </div>
        </div>
    </div>

</div>
</body>
</html>