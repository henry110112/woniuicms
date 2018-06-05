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