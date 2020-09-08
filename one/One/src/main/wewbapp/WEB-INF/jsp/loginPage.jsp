<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<h1>登录界面</h1>
		<form action="loginSubmit.do" method="post">
			<table>
				<tr>
					<td><label for="userAccess">账号：</label></td>
					<td><input id="userAccess" type="text" name="userAccess"></td>
				</tr>
				<tr>
					<td><label for="userPasswd">密码：</label></td>
					<td><input id="userPasswd" type="password" name="userPasswd"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录"></td>
					<td><a href="registerPage.do">注册</a></td>
				</tr>
			</table>
		</form>
	</body>
</html>