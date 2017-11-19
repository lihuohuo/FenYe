<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://www.springsecurity.org/jsp" prefix="security" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>内容发布</title>
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
        $(function () {

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
                    showcontent(checkNode.text);
                }
            });
            //状态
            selectstatus();
        });


        function change(data) {
            if (!data.length) {
                data.text = data.columnname;
                if (data.children) {
                    change(data.children);
                }
            } else {
                $.each(data, function (i, v) {
                    change(v);
                });
            }
        }
        function showcontent(columnname) {
            alert(columnname)
            $("#tb").datagrid({
                url: '${pageContext.request.contextPath}/con/getNewsByName?columnname=' + columnname,
                columns: [[
                    {field: 'id', title: '编号', width: 140},
                    {field: 'title', title: '标题', width: 140},
                    {field: 'columnname', title: '栏目', width: 140, align: 'right'},
                    {field: 'clicks', title: '点击数', width: 140, align: 'right'},
                    {field: 'status', title: '状态', width: 140, align: 'right'},
                    {field: 'creator', title: '创建者', width: 140, align: 'right'},
                    {field: 'updatetime', title: '更新时间', width: 140, align: 'right'}
                ]]
            });
        }


        //查询状态
        function selectstatus() {
            $.ajax({
                url: "/con/getAllStatus",
                datatype: "josn",
                type: "post",
                success: function (data) {
                    $.each(data, function (i, dom) {
                        $("#statuss").append('<option value="' + dom.id + '">' + dom.status + '</option>');
                    });
                }
            });
        }
        //多条件查询
        function muchselect() {
            var statuss = $("#statuss").val();
            var titles = $("#titles").val();

            $("#tb").datagrid({
                url: '${pageContext.request.contextPath}/con/selectAllnews?status=' + statuss + '&title=' + titles,
                columns: [[
                    {field: 'id', title: '编号', width: 140},
                    {field: 'title', title: '标题', width: 140},
                    {field: 'columnname', title: '栏目', width: 140, align: 'right'},
                    {field: 'clicks', title: '点击数', width: 140, align: 'right'},
                    {field: 'status', title: '状态', width: 140, align: 'right'},
                    {field: 'creator', title: '创建者', width: 140, align: 'right'},
                    {field: 'updatetime', title: '更新时间', width: 140, align: 'right'}
                ]]
            });
        }
    </script>
    <html>
    <head>
        <title>Title</title>
    </head>
<body>
<div class="easyui-layout" style="width:1200px;height:800px;">
    <div region="west" split="true" title="默认站点" style="width:150px;">


        <ul id="tt">
        </ul>
    </div>
    <div id="content" region="center" title="${colimnames}" style="padding:5px;">
        <div>
                状态:
                <select id="statuss">
                    <option value="0">请选择</option>
                </select>
                标题:
                <input type="text" id="titles"/>
                <button id="btn" onclick="muchselect()">查询</button>

        </div>
        <table id="tb" align="center"></table>
        <a href="articleForm.jsp">添加</a>
    </div>
</div>
</body>
</html>
