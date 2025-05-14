<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.learn_spring.entity.JspUser" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>

<% JspUser user = (JspUser)request.getAttribute("jspUser"); %>
<h1>Welcome <%= user.getName() %></h1>
<h1>userName: <%= user.getUserName() %></h1>

</center>
</body>
</html>