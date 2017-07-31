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
  <title>User Add</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h1>Add User</h1>
  <hr/>

  <form action="addUser" method="post" >
    <div class="form-group">
      <label for="userName">UserName:</label>
      <input type="text" class="form-control" id="userName" name="userName" placeholder="Enter UserName"/>
    </div>
    <div class="form-group">
      <label for="password">Password:</label>
      <input type="text" class="form-control" id="password" name="passWord" placeholder="Enter Password:"/>
    </div>
 
    <div class="form-group">
      <button type="submit" class="btn btn-sm btn-success">Sign up</button>
    </div>
  </form>
</div>

</body>

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</html>