<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
	</head>
	<body>
		<h1>注册界面</h1>
		<form action="registerSubmit.do" method="post">
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
					<td><label for="userRealname">真实姓名：</label></td>
					<td><input id="userRealname" type="text" name="userRealname"></td>
				</tr>
				<tr>
					<td><label for="userFlag">是否是管理员：</label></td>
					<td><input id="userFlag" type="text" name="userFlag"></td>
				</tr>
				<tr>
					<td></td>
					<td><input id="btn" type="submit" value="注册"></td>
				</tr>
			</table>
		</form>
	</body>
</html>