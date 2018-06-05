<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登陆界面</title>
<script type="text/javascript"
	src="js/jquery.1.9.1.js"></script>
</head>
<body>
	用户名：
	<input id="account" type="text"> 密码 ：
	<input id="pass" type="password">
	<div id="logindiv" onclick="LoginAjax()">SIGN IN</div>
	<div id="mesdiv"></div>
</body>
<script type="text/javascript" src="js/login.js"></script>
</html>