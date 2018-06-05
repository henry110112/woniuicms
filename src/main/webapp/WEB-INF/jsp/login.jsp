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
	src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
</head>

<body>

	用户名：
	<input id="account" type="text"> 密码 ：
	<input id="pass" type="password">
	<div id="logindiv" onclick="LoginAjax()">SIGN IN</div>
	<div id="mesdiv"></div>
</body>
<script type="text/javascript">
	function LoginAjax()//注册的方法，接收的lOGINSERVLET的信息
	{
		var parm = {};
		parm.login = $("#account").val();
		parm.password = $("#pass").val();
		$.ajax({
			url : "jsontest",
			type : "post",
			async : true,
			contentType : "application/json",
			data : JSON.stringify(parm),
			success : function(data) {
			if(data=="登陆成功"){			
			window.location.href="success";
			}
			else{
				$("#mesdiv").html(data);
			}
			}
		});
	}
</script>
</html>
