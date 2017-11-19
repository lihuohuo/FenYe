<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/css/public.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/jsp/css/style.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.min.css">
  <%--  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}js/jquery.pagination.js"></script>
    <script type="text/javascript">

        /*  jQuery(function ($) {
         $.ajax({
         url:"/getUserInfo",
         type:"post",
         success:function (data) {
         alert(data.pageIndex);
         //数据 data：PageUtil对象
         //data.pageIndex  data.pageSize data.totalRecords  data.totalPages data.list
         $('#list-content').html('');//清除区域原有的数据
         $.each(data.list,function (i,dom) {  //i:索引  dom当前迭代到的用户对象
         $('#list-content').append('<tr><td>' + dom.userCode + '</td><td>' + dom.userName + '</td></tr>');
         })
         }
         });


         });*/


        jQuery.noConflict();
        jQuery(function ($) {
            //加载数据
            load(0);

            function load(index) {
                $.ajax({
                    url: "/getUserInfo",
                    type: "post",
                    data: {"pageIndex": index},
                    success: function (data) {

                        //模拟ajax去后端读取页数，获取数据并渲染列表的过程
                        $('#list-content').html('');
                        $.each(data.list, function (i, dom) {
                            $('#list-content').append('<tr><td>' + dom.userCode + '</td><td>' + dom.userName + '</td></tr>');
                        });
                        //渲染分页
                        /*   if (data.totalPages > 0) {*/


                        /*   $('#pagination').pagination({
                             total:data.totalRecords,//总记录数
                             pageSize:pageSize,//页面大小
                             pageNumber:index+1,//当前页码
                             pageList: [2, 5, 15, 20], //5表示页显示5条数据。10条是每页显示10条数据  15表示每页显示15条数据，20表示每页显示20条数据
                             onSelectPage:function(pageNumber,pageSize){
                             load(pageNumber-1,pageSize);
                             }
                             });
                             }else {
                             $('#pagination').html("<span style='color:red;font-size: 18px'>没有检索到结果~~~~~！！！！！！</span>");
                             }*/


                            $('#pagination').pagination(
                                data.totalRecords, {
                                    current_page: index,
                                //当前页索引
                                items_per_page: data.pageSize, //每页记录数
                                num_display_entries: 10,
                                    //显示页码块数量
                                callback: load,
                                load_first_page: true,
                                prev_text: 'Previous',


                                next_text: 'Next'


                            });
                        }
                    });

            }
        });

        function xiugai() {

            var i = $("#zcheckboxs:checked").length;
            alert(i);
            if (i > 1) {
                alert("只能选择一项")
            } else if (i < 1) {
                alert("请选择一项")
            } else {
                location.href = "/UpdateList?id=" + $("#zcheckboxs:checked").val();
            }
        }
        function del() {
            var ck = $("#zcheckboxs:checked");
            var str = "";
            for (var i = 0; i < ck.length; i++) {
                if (ck.eq(i).prop("checked")) {
                    str += ck.eq(i).val() + ",";
                }
            }
            alert(str);
            $.ajax({
                url: "/deleteUser",
                type: "post",
                data: {"str": str},
                success: function (data) {
                    if (data != 1) {
                        alert("删除失败！")
                    } else {
                        load(0);
                        alert("删除成功！")
                    }
                }
            });
        }
    </script>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>
    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> 火火</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
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
                <li><a href="billList.html">账单管理</a></li>
                <li><a href="${pageContext.request.contextPath}/jsp/providerList.jsp">供应商管理</a></li>
                <li id="active"><a href="${pageContext.request.contextPath}/jsp/userList.jsp">用户管理</a></li>
                <li><a href="password.html">密码修改</a></li>
                <li><a href="${pageContext.request.contextPath}/Esc">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>用户管理页面</span>
        </div>
        <div class="search">
            <span>用户名：</span>
            <input type="text" id="names" placeholder="请输入用户名"/>
            <input type="button" id="btn" value="查询"/>
            <a href="${pageContext.request.contextPath}/jsp/userAdd.jsp">添加用户</a>
            <a onclick="xiugai()">修改用户</a>
            <a onclick="del()">删除用户</a>
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
            <tbody id="list-content"></tbody>
            <%--<tr>
                <td>hanlu</td>
                <td>韩露</td>
                <td>女</td>
                <td>20</td>
                <td>15918230478</td>
                <td>经理</td>
                <td>
                    <a href="userView.html"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="#" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                </td>
            </tr>
            <tr>
                <td>PRO-CODE—001</td>
                <td>测试供应商001</td>
                <td>韩露</td>
                <td>15918230478</td>
                <td>15918230478</td>
                <td>2015-11-12</td>
                <td>
                    <a href="userView.html"><img src="img/read.png" alt="查看" title="查看"/></a>
                    <a href="userUpdate.jsp"><img src="img/xiugai.png" alt="修改" title="修改"/></a>
                    <a href="#" class="removeUser"><img src="img/schu.png" alt="删除" title="删除"/></a>
                </td>
            </tr>--%>
            <tr>
        </table>

        <div class="pagination" id="pagination" style="margin:4px 0 0 0"></div>

    </div>
</section>

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

<footer class="footer">
    版权归北大青鸟
</footer>

<script src="${pageContext.request.contextPath}/jsp/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/jsp/js/js.js"></script>
<script src="${pageContext.request.contextPath}/jsp/js/time.js"></script>

</body>
</html>