<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>问题查询</title>
    <style type="text/css">
        tr:nth-child(odd){
            background:palegreen;
        }
    </style>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        function load() {
            var cname = $("#cname").val();
           alert(cname);
            $.ajax({
                url: "/list",
                type: "post",
                datatype:"JSON",
                data:{"cname":cname},
                success: function (data) {

                    if(data.length>0){
                        $("#h").html('');
                        $("#tb").show();
                    }
                    else{
                        $("#tb").hide();
                       $("#h").html('对不起找不到'+$("#cname").val());
                    }
                    $("#table").empty();

                    $.each(data, function (i, item) {
                        $("#table").append(
                            "<tr><td>" + item.id + "</td><td><a href='/getid?id="+item.id+"'>" + item.title + "</a></td><td>"
                            + item.classes.cname + "</td><td>" + item.createdate + "</td></tr>"
                        );
                    })
                }
            });
        }
        $(function () {
            load();
        });

    </script>
</head>
<body>
<div align="center">
    <h2>常见问题搜索</h2>
    <form id="form">
        请输入查询关键字：<input name="cname"  id="cname" type="text"/>
        <input type="button" id="btn" onclick="load()"  value="查询"/>
        <a href="/add.jsp">添加常见问题</a><br/>

        <table id="tb">
            <tr>
                <td>编号</td>
                <td>标题</td>
                <td>分类</td>
                <td>创建时间</td>
            </tr>
            <tbody id="table"></tbody>

        </table>
        <h2 id="h"></h2>
    </form>
</div>
</body>
</html>
