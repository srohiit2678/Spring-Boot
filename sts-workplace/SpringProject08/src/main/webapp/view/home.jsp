<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.spring_learn.entity.JspUser" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% JspUser user = (JspUser)request.getAttribute("jspUser"); %>
<h1>Welcome <%= user.getName() %>></h1>
</body>
</html>