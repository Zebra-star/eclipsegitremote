<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>登陆界面</title>
	</head>
	<body>
		<div style="width: 400px; margin: 0 auto;">
			<form action="loginPage.do" method="post">
				<table>
					<tr>
						<td><label for="userAccess">账号：</label></td>
						<td><input id="userAccess" type="text" name="userAccess" ></td>
					</tr>
					<tr>
						<td><label for="userPasswd">密码：</label></td>
						<td><input id="userPasswd" type="password" name="userPasswd" ></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="管理员登陆" ></td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
