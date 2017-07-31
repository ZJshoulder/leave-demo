<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Leave Show</title>
<link rel="stylesheet" href="${ctx}/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>Leave Show</h1>
		<hr />
			<table class="table table-bordered table-striped table-hover">
				<tr>
					<th>id</th>
					<th>请假人</th>
					<th>请假理由</th>
					<th>请假天数</th>
					<th>备注</th>
					<th>进程id</th>
					<th>同意请假</th>
				</tr>
 				<c:forEach items="${leaves}" var="leave">
					<tr>
						<td>${leave.id}</td>
						<td>${leave.user}</td>
						<td>${leave.reason}</td>
						<td>${leave.dayNumber}</td>
						<td>${leave.remark}</td>
						<td>${leave.pId}</td>
						<td>
							<a href="${ctx}/leave/agreeLeave?pId=${leave.pId}" type="button" class="btn btn-sm btn-danger">${sessionScope.user.id}同意</a>
						</td>
					</tr>
				</c:forEach> 						
			</table>
	</div>

</body>

<script src="${ctx}/js/jquery.min.js"></script>
<script src="${ctx}/js/bootstrap.min.js"></script>
</html>