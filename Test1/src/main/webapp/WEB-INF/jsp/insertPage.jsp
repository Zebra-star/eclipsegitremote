<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<div style="width: 400px; margin: 0 auto;">
			<form action="insertSubmit.do" method="post">
			<table>
				<tr>
					<td><label for="custName">客户姓名</label></td>
					<td><input id="custName" type="text" name="custName" ></td>
					<td></td>
				</tr>
				<tr>
					<td><label for="custSource">客户来源</label></td>
					<td>
						<select id="custSource" name="custSource">
							<c:forEach items="${sources}" var="s">
								<option value="${s.dictItemCode}" >${s.dictItemName}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td><label for="custIndustry">客户所在行业</label></td>
					<td>
						<select id="custIndustry" name="custIndustry">
							<c:forEach items="${industries}" var="i">
								<option value="${i.dictItemCode}" >${i.dictItemName}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td><label for="custMobile">移动电话</label></td>
					<td><input id="custMobile" type="text" name="custMobile" ></td>
					<td></td>
				</tr>
				
				<tr>
					<td><label for="custAddress">地址</label></td>
					<td>
						<textarea id="custAddress" name="custAddress"></textarea>
					</td>
					<td></td>
				</tr>
				<tr>
					<td>
					<input type="submit" value="提交">
					</td>
					<td></td>
				</tr>
			</table>
			
		</form>
			
		</div>
		
	</body>
</html>

</html>
