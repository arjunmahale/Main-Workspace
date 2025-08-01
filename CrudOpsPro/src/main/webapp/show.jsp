<%@page import="java.sql.ResultSet"%>
<%@page import="com.db.DBConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Student Information</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>

<div class="container mt-5">
  <h2 class="text-center mb-4">Student Records</h2>
  <table class="table table-bordered table-striped">
    <thead>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Mobile</th>
        <th>Class</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
      <%
        ResultSet rs = DBConnection.showstudents();
        while (rs.next()) {
      %>
      <tr>
        <td><%= rs.getInt(1) %></td>
        <td><%= rs.getString(2) %></td>
        <td><%= rs.getString(3) %></td>
        <td><%= rs.getString(4) %></td>
        <td><%= rs.getString(5) %></td>
      </tr>
      <%
        }
      %>
    </tbody>
  </table>
  <a href="index.jsp">go to home</a>
</div>

</body>
</html>
