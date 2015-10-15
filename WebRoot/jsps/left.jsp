<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 
  </head>
  
  <body>
  
  <table  border="0" align="left" cellpadding="4" cellspacing="1" bgcolor="#FFFFFF" >
  <tr>
    <td bgcolor="#FFFFFF">学习视频</td>
 
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">学习笔记</td>

  </tr>
  <tr>
    <td bgcolor="#FFFFFF">测试平台</td>
  
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">下载平台</td>
  
  </tr>
  <tr>
    <td bgcolor="#FFFFFF">签到系统</td>

  </tr>
  
 </table>
  </body>
</html>
