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
        <th>image</th>
        <th>Actions</th>
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
        <td><img alt="" src="images/<%=rs.getString(6)%>" style="height:50px;width:100px"></td>
      <td>
  <a class="btn btn-primary btn-sm" href="edit_student.jsp?id=<%= rs.getInt(1) %>">Edit</a>

  <a class="btn btn-danger btn-sm" href="Delete_stud?id=<%= rs.getInt(1) %>"
     onclick="return confirm('Are you sure you want to delete this student?');">
     Delete
  </a>
</td>


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
