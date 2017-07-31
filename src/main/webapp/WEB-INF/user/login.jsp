<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>UserManage Login</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<div class="container">
		<h1>UserManage Login</h1>
		<hr />
		<form action="${ctx}/login" method="post">
			<div class="form-group">
				<label for="userName">UserName:</label> 
				<input type="text" class="form-control" id="userId" name="userId" placeholder="Enter UserName" />
			</div>
			<div class="form-group">
				<label for="password">Password:</label> 
				<input type="text" class="form-control" id="password" name="passWord" placeholder="Enter Password:" />
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-sm btn-success">Sign in</button>
			</div>
			New to Here? <a href="addUser">Create</a> an account.
		</form>
	</div>

	<c:if test="${flag}">
		<div class="alert alert-danger alert-dismissable" role="alert">
			<button class="close" type="button" data-dismiss="alert">&times;</button>
			error userName or passWord . Please try again.
			<% session.removeAttribute("flag"); %>
		</div>
	</c:if>
</body>

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>