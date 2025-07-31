<%@ page import="com.db.DBConnection" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="height: 200px; width: 100%; background-color: red">


  <%
  Connection con=DBConnection.connect();
  if(con!=null)
  {
	  %>
	  <h1>connection established !</h1>
	  <%
  }else
  {

	  %>
	  <h1>connection error!</h1>
	  <%
  }

  %>
</div>

</body>
</html>
