<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp page</title>
</head>
<body>
<h1>first jsp page</h1>

<h2>scriptlet tag</h2>
<p><% int a=10;
	out.println(a);

%></p>


<h2>declaration tag-<br></h2>
<%!
 public String show()
 {
	return "Declaration tag from method";
 }
%>

<h2>expression tag</h2>

<h6><%=a %></h6>
<h6><%=show() %></h6>



</body>
</html>