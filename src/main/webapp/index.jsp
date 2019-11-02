<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
    <link rel="stylesheet" href="WEB-INF/css/body.css" type="text/css">
    <link rel="stylesheet" href="WEB-INF/css/style.css" type="text/css">
  </head>
  
  <body>
<div class="container">
	<section id="content">
		<form action="">
			<h1>会员登录</h1>
			<div>
				<input type="text" placeholder="用户名" required="" id="username" name="username">
			</div>
			<div>
				<input type="password" placeholder="密码" required="" id="password" name="password">
			</div>
			 <div class="">
				<span class="help-block u-errormessage" id="js-server-helpinf">&nbsp;</span>			</div>
			<div>
				<!-- <input type="submit" value="Log in" /> -->
				<input type="submit" value="登录" class="btn btn-primary" id="js-btn-login">
				<a href="">注册</a>
			</div>
		</form>
		 <div class="button">
			<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>
			<a href="https://s2.ax1x.com/2019/09/27/uKlK8f.jpg">进入小程序</a>
		</div>
	</section>
	<p>${conn}</p>
</div>
  </body>
</html>
