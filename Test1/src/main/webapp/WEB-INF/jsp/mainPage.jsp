<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="deleteSubmit.do" method="post" id="deleteForm">
		<input type="submit" value="删除">
	</form>
	<form action="insertPage.do" method="post">
		<input type="submit" value="添加">
	</form>
	<form action="mainPage.do" method="post">
		<input type="text" name="custName">
		<select id="custSource" name="custSource">
			<option value="">请选择。。。</option>
			<c:forEach items="${sources}" var="s">
				<option value="${s.dictItemCode}">${s.dictItemName}</option>
			</c:forEach>
		</select>
		<select id="custIndustry" name="custIndustry">
			<option value="">请选择。。。</option>
			<c:forEach items="${industries}" var="i">
				<option value="${i.dictItemCode}">${i.dictItemName}</option>
			</c:forEach>
		</select> <input type="submit" value="提交">
	</form>
	<table>
		<tr>
			<th><input type="checkbox" id="allCheckedBox"></th>
			<th>编号</th>
			<th>姓名</th>
			<th>责任人</th>
			<th>创建人</th>
			<th>客户来源</th>
			<th>所在行业</th>
			<th>固定电话</th>
			<th>移动电话</th>
			<th>地址</th>
			<th>创建时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${list}" var="c">
			<tr>
				<td><input type="checkbox" name="id" class="itemcheckbox"
					value="${c.custId}" form="deleteForm"></td>
				<td>${c.custId}</td>
				<td>${c.custName}</td>
				<td>${c.custUserId}</td>
				<td>${c.custCreateId}</td>
				<td>${c.source.dictItemName}</td>
				<%-- <td>
					<c:forEach items="${sources}" var="s">
						<c:if test="${s.dictItemCode == c.custSource}">
							${s.dictItemName}
						</c:if> 
					</c:forEach>
				</td> --%>
				<td><c:forEach items="${industries}" var="i">
						<c:if test="${i.dictItemCode == c.custIndustry}">
							${i.dictItemName}
						</c:if>
					</c:forEach></td>
				<td>${c.custPhone}</td>
				<td>${c.custMobile}</td>
				<td>${c.custAddress}</td>
				<td>${c.custCreateDate}</td>
				<td><a href="updatePage.do?id=${c.custId}">修改</a></td>
			</tr>
		</c:forEach>
	</table>

	<c:if test="${!pageInfo.isFirstPage}">
		<a href="mainPage.do?pageNum=${pageInfo.prePage}">上一页</a>
	</c:if>
	第${pageInfo.pageNum}页/共${pageInfo.pages}
	<c:if test="${!pageInfo.isLastPage}">
		<a href="mainPage.do?pageNum=${pageInfo.nextPage}">下一页</a>
	</c:if>

</body>

<script type="text/javascript">
	var all = document.getElementById("allCheckedBox");
	all.onchange = function() {
		console.log(all.checked)
		var items = document.getElementsByClassName("itemcheckbox");
		for (var i = 0; i < items.length; i++) {
			items[i].checked = all.checked;
		}
	}
</script>
</html>