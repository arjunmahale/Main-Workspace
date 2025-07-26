<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.bean.Stud" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Info</title>
</head>
<body>

<h1>Student Information</h1>

<%
    Stud s1 = new Stud("Vaibhav", "vaibhav@gmail.com", "MCA");
    Stud s2 = new Stud("mahesh", "mahesh@gmail.com", "MCS");
%>

<p>
    Student name : <%= s1.getName() %><br>
    Student email : <%= s1.getEmail() %><br>
    Student class : <%= s1.getClassname() %>
</p>
<p>
    Student name : <%= s2.getName() %><br>
    Student email : <%= s2.getEmail() %><br>
    Student class : <%= s2.getClassname() %>
</p>

</body>
</html>
