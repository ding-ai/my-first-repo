<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>登录页面</title> <!-- 为页面添加标题 -->
</head>
<body>
	<form action="show" method="get"> <!-- 表单提交方式为GET -->
		<label for="username">登录</label> <!-- 用户名标签 -->
		<input type="text" name="username" id="username" required> <!-- 用户名输入框，必填 -->

		<br>

		<label for="password">密码</label> <!-- 密码标签 -->
		<input type="password" name="password" id="password" required> <!-- 密码输入框，必填 -->

		<br>

		<input type="submit" value="提交"> <!-- 提交按钮 -->
	</form>
</body>
</html>
