<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://www.springsecurity.org/jsp" prefix="security"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>内容发布</title>
    <link href="/static/css/bootstrap.min.css-v=3.3.5.css" type="text/css"  rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        $(function () {
            $('#dlg').dialog('close');
            $('#deleRole').dialog('close');
            var datagrid ;  //定义全局变量
            datagrid = $("#dataGrid").datagrid({
                width:"80%",
                border:true,
                locale:"zh_CN",
                iconCls:'icon-save',
                striped:true,
                fitColumns:true,
                idField:"bid",
                sortOrder:"desc",
                collapsible:"false",
                url:"/doFoundAdmins",
                singleSelect:true,//是否单选
                pagination:true,//分页控件
                pageList: [5,10],//可以设置每页记录条数的列表
                columns: [[
                    { field: 'userid', title: ' ', algin: 'center' },
                    { field: 'username', title: '标题 ',align: 'center' },
                    { field: 'usertype', title: '栏目', align: 'center' },
                    { field: 'usertel', title: '权垂', align: 'center' },
                    { field: 'useremail', title: '点击数', align: 'center' },
                    { field: 'rolename', title: '状态', align: 'center' },
                    { field: 'rolename', title: '创建者', align: 'center' },
                    { field: 'rolename', title: '更新时间', align: 'center' },
                    { field: 'rolename', title: '操作', align: 'center' },
                ]],

            });
        });
    </script>
    <html>
    <head>
        <title>Title</title>
    </head>
<body>


<div class="easyui-layout" style="width:1200px;height:800px;">

    <div region="west" split="true" title="国内咨询">

        <%--顶部搜索框--%>
        <div style="width: 100%;height: 50px;border: 1px red solid;background-color: #FEFEFE">
            <form action="" method="post" style="margin-left: 50px">
                <div style="margin-top:10px">
                    <span style="font-size: 14px">标题：</span>
                    <input class="easyui-textbox"   name="columnname" style="width: 20%;height: 32px">
                    <a class="btn btn-primary btn-rounded" href="buttons.html#" style="height: 32px">查询</a>
                    <a class="btn btn-default btn-rounded" href="buttons.html#" style="height: 32px ">重置</a>
                    <span style="font-size: 14px">状态：</span>
                    <input type="radio" name="state"> <span style="font-size: 14px">发布：</span>
                    <input type="radio" name="state"> <span style="font-size: 14px">审核：</span>
                    <input type="radio" name="state"> <span style="font-size: 14px">驳回：</span>
                    <input type="radio" name="state"> <span style="font-size: 14px">删除：</span>
                    <input type="radio" name="state"> <span style="font-size: 14px">草稿</span>
                </div>
            </form>
        </div>
            <%--中间数据展示--%>
            <div>
                <table  id="dataGrid" style="width:100%"></table>
            </div>
    </div>
</div>
</body>
</html>
