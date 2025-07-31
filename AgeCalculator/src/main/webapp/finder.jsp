<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.Period" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Age Result</title>
<style>
body {
    background: #f2f2f2;
    font-family: Arial, sans-serif;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.container {
    background: white;
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0 0 20px rgba(0,0,0,0.1);
    text-align: center;
    width: 400px;
}

.container h2 {
    font-size: 24px;
    color: #333;
    margin-bottom: 20px;
}

.back-btn {
    margin-top: 20px;
    padding: 10px 20px;
    background-color: orange;
    color: white;
    text-decoration: none;
    border-radius: 5px;
    display: inline-block;
    font-weight: bold;
}

.back-btn:hover {
    background-color: darkorange;
}
</style>
</head>
<body>

<div class="container">
<%
try {
    int day = Integer.parseInt(request.getParameter("day"));
    int month = Integer.parseInt(request.getParameter("month"));
    int year = Integer.parseInt(request.getParameter("year"));

    LocalDate birthDate = LocalDate.of(year, month, day);
    LocalDate today = LocalDate.now();
    Period age = Period.between(birthDate, today);
%>
    <h2>Your age is:<br> <%= age.getYears() %> years, <%= age.getMonths() %> months, <%= age.getDays() %> days</h2>
    <a href="index.jsp" class="back-btn">Go Back</a>
<%
} catch(Exception e) {
%>
    <h2 style="color:red;">Invalid input. Please try again.</h2>
    <a href="index.jsp" class="back-btn">Go Back</a>
<%
}
%>
</div>

</body>
</html>
