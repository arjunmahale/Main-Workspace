<%@page import="java.time.LocalDateTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Date</title>
<style type="text/css">
body {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    font-family: Arial, sans-serif;
}

.box {
    height: 400px;
    width: 300px;
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: orange;
    margin-top: 30px;
    border-radius: 10px;
    box-shadow: 2px 2px 10px rgba(0,0,0,0.2);
}

form {
    height: 100%;
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
}

form input, form button {
    height: 50px;
    width: 80%;
    margin: 10px 0;
    font-size: 16px;
    padding: 5px;
    border: none;
    border-radius: 5px;
}

form button {
    background-color: #333;
    color: white;
    cursor: pointer;
}

form button:hover {
    background-color: #000;
}
</style>
</head>
<body>

<h2>
<%
    LocalDateTime ld = LocalDateTime.now();
    int currentYear = ld.getYear();

%>
</h2>
<center><h1>Age Calculator</h1></center>
<div class="box">

    <form action="age" method="post">
        <input type="number" name="day" placeholder="Day (dd)" min="1" max="31" required>
        <input type="number" name="month" placeholder="Month (mm)" min="1" max="12" required>
        <input type="number" name="year" placeholder="Year (yyyy)" min="1900" max="<%= currentYear %>" required>
        <button type="submit">Find Age</button>
    </form>
</div>

</body>
</html>
