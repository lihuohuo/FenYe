<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="security" uri="http://www.springsecurity.org/jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>添加新闻</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/apply.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/icon.css">

    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>

    <script type="text/javascript">
        $("#")
        function inser() {
            $.ajax({
                url: "/con/addnews",
                type: "post",
                data: $("#fm").serialize(),
                success: function (data) {
                    if (data > 0) {
                        alert('添加成功');
                    } else {
                        alert('添加失败');
                    }
                }
            })

        }
        function selectp() {
            $('#dlg3').dialog('open').dialog('center').dialog('setTitle','选择栏目');
            $("#tt").tree({
                url: '${pageContext.request.contextPath}/con/getAllContent',
                animate: true,
                cascadeCheck: false,
                loadFilter: function (data) {
                    change(data);
                    //图标的设定
                    $.each(data, function (i, v) {
                        v.iconCls = "icon-folder";
                    });
                    return data;
                },
                onDblClick: function (checkNode) {
                    $("#columnname").val(checkNode.text)

                    showcontent(checkNode.text);
                }
            });

        }

    </script>
</head>
<div id="container" style="margin-top: 10px;">
    <div class="server">
        <h3 class="apply_title">基本信息</h3>

        <table class="table">
            <form id="fm" method="post">


                <tr>


                    <td class="first" >所属栏目：</td>

                    <%--<div id="addprivlg" class="easyui-dialog" title="所属栏目" data-options="iconCls:'icon-save'" style="width:350px;height:300px;padding:10px" >
                        <label><h3 style="margin-left: 130px">栏目选择</h3></label>
                        <input type="text" id="myroleid" style="display: none">
                            分配栏目：<a href="#" class="easyui-linkbutton" onclick="selectp()"></a>
                        <ul id="tt"></ul>
                    </div>--%>
                    <td class="input"><input type="text" name="columnname" value=""/></td>



                    <td class="first">会员限制：</td>
                    <td class="input"><input type="text" name="name" value=""/></td>
                </tr>

                <tr>
                    <td class="first">文章标题<span class="xing">*</span>：</td>
                    <td class="input" colspan="3"><input class="addr" type="text" name="title" value=""/></td>
                </tr>

                <tr>
                    <td class="first">标题颜色<span class="xing">*</span>：</td>
                    <td class="input">
                        <select class="apply_range">
                            <option value="value">请选择</option>
                            <option class="apply_civil">红色</option>
                            <option class="apply_abroad">蓝色</option>
                        </select>
                    </td>
                    <td class="first">权重/排序<span class="xing">*</span>：</td>
                    <td class="input"><input type="text" name="name" value=""/></td>

                </tr>
                <tr>
                    <td class="first">文章图片<span class="xing">*</span>：</td>
                    <td class="input"><input type="text" name="name" value=""/></td>
                    <td class="first">关键词<span class="xing">*</span>：</td>
                    <td class="input"><input class="addr" type="text" name="tag" value=""/></td>

                </tr>
                <tr>
                    <td colspan="6" class="head">摘要</td>
                </tr>
                <tr>
                    <td class="secend" style="height:60px;" colspan="6">
                        <textarea name="abstras" rows="4" cols="131" style="resize:none;"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="6" class="head">正文</td>
                </tr>
                <tr>
                    <td class="secend" style="height:60px;" colspan="6">
                        <textarea name ="conents" rows="4" cols="131" style="resize:none;"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="6" style="height:40px;">
                        <a href="javascript:;" class="easyui-linkbutton">暂存草稿</a>
                        <a href="javascript:inser();" class="easyui-linkbutton">发布</a>
                        <a href="javascript:;" class="easyui-linkbutton">关闭</a>
                    </td>
                </tr>
            </form>
        </table>

    </div>

</div>
<div >

</div>
</body>
</html>