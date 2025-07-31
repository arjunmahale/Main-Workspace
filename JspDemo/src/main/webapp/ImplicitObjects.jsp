<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Implicit Objects</h1>
<h2><% out.print("sdf"); %></h2>
<h2><% int n=request.getServerPort(); %></h2>
<h3><%=n %>
<%response.sendRedirect("ind"); %>
<%application.setAttribute("dbname", "postgres"); %>
</h3>
</body>
</html>