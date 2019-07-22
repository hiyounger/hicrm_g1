<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>员工信息表</title>
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="expires" content="0">    
	<%@include file="../../script.html" %>

  </head>
  <style type="text/css">
  body{
  	font-size:14px
  }
  </style>
  <body >
    <div id="toolbar" style="padding:0 30px;">
       	<b>员工姓名: </b><input class="easyui-textbox" id="name" type="text" name="name" style="width:166px;height:35px;line-height:35px;"/>
        <a href="javascript:void(0);" id="searchBtn" class="easyui-linkbutton" iconCls="icon-search" data-options="selected:true" style="background-color:#00aa00;color:white">查询</a>
        <a href="javascript:void(0);" id="setBtn" class="easyui-linkbutton" iconCls="icon-reload" style="background-color:#00aa00;color:white;margin-left:10px">重置</a>
        <a href="javascript:void(0);" onclick="return add('manage/employee/EmployeeAction_add.action')" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" style="background-color:#00aa00;color:white;margin-left:10px">添加</a>
    	<a href="javascript:void(0);" onclick="return remove('manage/employee/EmployeeAction_remove.action')" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" style="background-color:#f00;color:white;margin-left:10px">删除</a>
    	<a href="javascript:void(0);" onclick="return edit('manage/employee/EmployeeAction_edit.action')" id="editBtn" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true" style="background-color:#00aa00;color:white;margin-left:10px">修改</a>
    </div>
    <table id="empList" class="easyui-datagrid" style="font-size:14px"></table>
    <script type="text/javascript">
    	
    	//加载用户数据
    	$(function(){
    		$("#empList").datagrid({
    			url : "manage/employee/EmployeeAction_findByPage.action",
    			pagination : true,
    			toolbar : "#toolbar",
    			fitColumns : true,
    			idField : "empid",
    			rownumbers : true,
    			//singleSelect:true,
    			columns : [[
    				{field:"empid",title:"选择",checkbox:true},
    				{field:"name",title:"员工姓名",sortable:true,width:10},
    				{field:"telephone",title:"联系电话",sortable:true,width:10},
    				{field:"email",title:"邮箱",sortable:true,width:10},
    				{field:"address",title:"地址",width:10},			
    			]],
    			loadFilter:function(data){
    				//data是服务器返回的数据,将服务器端返回的数据转换为datagrid需要的格式
    				return {"total":data.data.totalRows,"rows":data.data.result};
    			}
    		
    		});
    	});
    </script>
  </body>
</html>
