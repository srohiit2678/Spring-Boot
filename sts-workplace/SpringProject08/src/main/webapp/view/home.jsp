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
		<h2>Welcome TO Home Page</h2>
<% JspUser user = (JspUser)request.getAttribute("jspUser"); %>
<table>
<tr>
<td>name: </td> <td><%= user.getName() %></td>
</tr>
<tr>
<td>userName:</td> <td> <%= user.getUserName() %></td>
</tr>
</table>
</body>
</html>