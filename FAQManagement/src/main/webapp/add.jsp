<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>添加问题</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(function () {


            $.ajax({
                url: "/add",
                type: "post",
                success: function (data) {
                    $.each(data, function (i, item) {
                        $("#list").append(
                            "<option value=" + item.id + ">" + item.cname + "</option>"
                        );
                    });
                }
            });


        });

        function aa() {
            if ($("#list").val() == 0) {
                alert('请填写分类！');
            }
            else if ($("#biaoti").val() == null) {
                alert('请填写标题！');
            } else if ($("#neirong").val() == null) {
                alert('请填写内容！');
            } else {

                $.ajax({
                    url: "/adds",
                    type: "post",
                    data: $("#form").serialize(),
                    success: function (data) {
                        if (data > 0) {
                            alert('添加成功！');
                        }
                    }
                });

            }
        }

    </script>
</head>
<body>
<div align="center">
    <form id="form">
        分类：<select name="classid" id="list">
        <option value="0">请选择</option>
    </select><br/>
        标题：<input type="text" id="biaoti" name="title"/><span id="span1"></span><br/>
        内容：<input type="text" id="neirong" name="content"/><span id="span2"></span><br/>
        <input type="button" onclick="aa()" value="添加"/>
    </form>
</div>
</body>
</html>
