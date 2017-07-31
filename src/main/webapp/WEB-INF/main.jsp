<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>主页面</title>
<link rel="stylesheet" href="${ctx}/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>当前用户:${sessionScope.user.id}</h1>
		<hr />
		<h1>当前身份:${sessionScope.group.id}</h1>
		<c:if test="${sessionScope.group.id eq '程序员' }">
			<li><a href="${ctx}/leave/leaveAdd">发起请假</a></li>
		</c:if>
		<c:if test="${sessionScope.group.id ne '程序员' }">
			<li><a href="${ctx}/leave/leaveList">查看请假申请</a></li>
		</c:if>
		<!-- 		<form action="userManage" method="get"> -->
		<!-- 			<div class="form-group"> -->
		<!-- 				<label for="id">UserId:</label> <input type="text" -->
		<%-- 					class="form-control" id="id" value="${user.id }" /> --%>
		<!-- 			</div> -->
		<!-- 			<div class="form-group"> -->
		<!-- 				<label for="userName">UserName:</label> <input type="text" -->
		<%-- 					class="form-control" id="userName" value="${user.userName }" /> --%>
		<!-- 			</div> -->
		<!-- 			<div class="form-group"> -->
		<!-- 				<label for="password">Password:</label> <input type="text" -->
		<%-- 					class="form-control" id="password" value="${user.passWord }" /> --%>
		<!-- 			</div> -->

		<!-- 			<div class="form-group"> -->
		<!-- 				<button type="submit" class="btn btn-sm btn-success">Return</button> -->
		<!-- 			</div> -->
		<!-- 		</form> -->
	</div>
</body>
<script src="${ctx}/js/jquery.min.js"></script>
<script src="${ctx}/js/bootstrap.min.js"></script>
</html>