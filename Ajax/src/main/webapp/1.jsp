<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/7/14
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.11.1.js"></script>
    <script type="text/javascript">
        $(function () {
            //3、定义JSON格式的user对象数组，并使用<table>输出
            var userArray = [ {
                "id" : 2,
                "name" : "admin",
                "pwd" : "123"
            }, {
                "id" : 3,
                "name" : "詹姆斯",
                "pwd" : "11111"
            }, {
                "id" : 4,
                "name" : "梅西",
                "pwd" : "6666"
            } ];
            var $table = $("<table border='1'></table>").append(
                "<tr><td>ID</td><td>用户名</td><td>密码</td></tr>");
            $.each(userArray,function(i,dom) {
                $table.append("<tr><td>" + dom.id + "</td><td>"
                    + dom.name + "</td><td>"
                    + dom.pwd + "</td></tr>");
            });
            $("#objectArrayDiv").append($table);

            $("[name=uname]").blur(function () {
                // oldAjax();
                /* $.ajax({
                 url:"/FirstServlet",
                 type:"post",
                 data:{"uname":$('[name=uname]').val()},
                 dataType:"text", //server响应回来的数据类型
                 success:function (data) {
                 //alert(typeof data);
                 }
                 });*/

                $.post("/FirstServlet",
                    {"uname":$('[name=uname]').val()},
                    function (data) {
                        alert(data);
                    });

                /*$.getJSON(
                 "/FirstServlet",{"uname":$('[name=uname]').val()},
                 function (data) {
                 alert(typeof data);
                 }
                 );*/

                /* $("#msg").load(
                 "/FirstServlet","uname="+$('[name=uname]').val()
                 );*/

                //var data1 = $.param($("#form1").serializeArray()); //自动将form表单封装成json
                /* var data1=$("#form1").serialize();
                 alert(data1);*/
            });
        });








        (function oldAjax() {
            $function("[name=uname]").blur(function () {
                var xhr = null;
                if (window.XMLHttpRequest) {//非IE浏览器
                    xhr = new XMLHttpRequest();
                } else {
                    xhr = new ActiveXObject("Microsoft.XMLHTTP");
                }
                //open 准备请求地址  open(method,url,async)
                xhr.open("Get", "FirstServlet?uname=" + $("[name=uname]").val(), true);
                xhr.onreadystatechange = function () {
                    if (xhr.readyStates == 4 && xhr.status == 200) {
                        //成功响应
                        var data = xhr.responseText;
                        var dom = document.getElementById("msg");
                        dom.innerText = data;


                    }
                }
                xhr.setRequestHeader("Content-Type","application/json");
                xhr.send("uname="+$('[name=uname]').val()+"&pwd=123");
         /*       xhr.send(null);*/


            });
        });
    </script>

</head>
<body>
<input name="uname"/><span id="msg"></span>
</body>
</html>
