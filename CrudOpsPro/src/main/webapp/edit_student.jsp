<%@page import="com.db.DBConnection"%>
<%@page import="com.bean.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="UTF-8">
  <title>Student Information update</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        >
</head>
<body>

<%
   String id1= request.getParameter("id");
	 Student student=DBConnection.getstudentById(Integer.parseInt(id1));
%>
 <div class="container mt-5">
    <h1 class="text-center mb-4">Student Information</h1>

    <form action="EditStudentServlet" method="post" class="mx-auto w-50" enctype="multipart/form-data">
      <div class="mb-3">
        <label class="form-label">Enter Name:</label>
        <input type="text" name="sname" class="form-control" value=<%=student.getSname() %>  required>
      </div>

      <div class="mb-3">
        <label class="form-label">Enter Mobile:</label>
        <input type="text" name="smobile" class="form-control" value=<%=student.getSmobile()%>   required>
      </div>

      <div class="mb-3">
        <label class="form-label">Enter Class:</label>
        <input type="text" name="sclass"class="form-control" value=<%=student.getClass()%>   required>
      </div>

      <div class="mb-3">
        <label class="form-label">Enter Email:</label>
        <input type="text" name="semail"  class="form-control"value=<%=student.getSemail() %>   required>
      </div>
<div class="mb-3">
        <label class="form-label">upload image:</label>
        <input type="file" name="simage" placeholder="Student image" class="form-control"  required>
      </div>
      <div class="text-center">
        <button type="submit" class="btn btn-primary">update</button>
      </div>
    </form>
  </div>
</body>
</html>