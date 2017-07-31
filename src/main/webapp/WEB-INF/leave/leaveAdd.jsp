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
  <title>Leave Add</title>
<link rel="stylesheet" href="${ctx}/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h1>Leave Add</h1>
  <hr/>
  <form action="${ctx}/leave/leaveAdd" method="post" >
    <div class="form-group">
      <label for="userName">请假理由:</label>
      <input type="text" class="form-control" id="reason" name="reason" placeholder="请假理由"/>
    </div>
    <div class="form-group">
      <label for="password">请假天数:</label>
      <input type="text" class="form-control" id="dayNumber" name="dayNumber" placeholder="请假天数"/>
    </div>
    <div class="form-group">
      <label for="password">备注:</label>
      <input type="text" class="form-control" id="remark" name="remark" placeholder="备注"/>
    </div>
    <div class="form-group">
      <button type="submit" class="btn btn-sm btn-success">发起请假</button>
    </div>
  </form>
</div>
</body>
<script src="${ctx}/js/jquery.min.js"></script>
<script src="${ctx}/js/bootstrap.min.js"></script>
</html>