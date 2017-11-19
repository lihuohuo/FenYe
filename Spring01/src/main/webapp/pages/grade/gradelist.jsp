<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jQuery EasyUI</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/site/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/site/easyui/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/site/easyui/jquery-1.6.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/site/easyui/jquery.easyui.min.js"></script>
	<script>
		function init() {
            $('#test').datagrid({
                title:'年级管理',
                iconCls:'icon-save',
                width:'100%',
                height:450,
                nowrap: true,
                striped: true,
                url:'/GradeServlet?action=list',
                sortName: 'code',
                sortOrder: 'desc',
                idField:'code',
                frozenColumns:[[
					/*{field:'ck',checkbox:true},*/
                    {title:'班级编号',field:'gid',width:80,sortable:true}
                ]],
                columns:[[
                    {field:'gname',title:'班级名称',width:200}
                ]],
                pagination:true,
                rownumbers:true,
                singleSelect:true,
                toolbar:[{
                    text:'添加年级',
                    iconCls:'icon-add',
                    handler:function(){
                        open1();
                    }
                },{
                    text:'Cut',
                    iconCls:'icon-cut',
                    disabled:true,
                    handler:function(){
                        alert('cut')
                    }
                },'-',{
                    text:'Save',
                    iconCls:'icon-save',
                    handler:function(){

                    }
                }]
            });
        }
        $(function(){
           init();
            var p = $('#test').datagrid('getPager');
            if (p){
                $(p).pagination({
                    onBeforeRefresh:function(){
                        alert('before refresh');
                    }
                });
            }
        });
        function resize(){
            $('#test').datagrid({
                title: 'New Title',
                striped: true,
                width: 650,
                queryParams:{
                    p:'param test',
                    name:'My Name'
                }
            });
        }
        function getSelected(){
            var selected = $('#test').datagrid('getSelected');
            alert(selected.code+":"+selected.name);
        }
        function getSelections(){
            var ids = [];
            var rows = $('#test').datagrid('getSelections');
            for(var i=0;i<rows.length;i++){
                ids.push(rows[i].code);
            }
            alert(ids.join(':'))
        }

	</script>

	<script>
        $(function(){
            $('#dd').dialog({
                title:'添加年级',
                collapsible:true,
               /* minimizable:true,
                maximizable:true,*/
                resizable:true,
				//小弹层的OK
                buttons:[{
                    text:'Ok',
                    iconCls:'icon-ok',
                    handler:function(){
                        $.ajax({
                            url:"/GradeServlet?action=add",
                            type:"post",
                            data:{"gname":$('[name=gname]').val()},
                            dataType:"text", //server响应回来的数据类型
                            success:function (data) {
                                init();
                                $('#dd').dialog('close');
                            }
                        });

                    }
                },{
                    text:'Cancel',
                    handler:function(){
                        $('#dd').dialog('close');
                    }
                }]
            });
            $('#dd').dialog('close');
        });
        function open1(){
            $('#dd').dialog('open');
        }
        function close1(){
            $('#dd').dialog('close');
        }
	</script>
</head>
<body>
	<table id="test">

	</table>
	<form id="form1" action="/GradeServlet?action=add" method="post">
		<div  id="dd" style="width:400px;padding:30px 60px">
			年级名称:<input class="easyui-textbox" name="gname" style="width:70%;height:22px">
		</div>
	</form>

</body>
</html>