<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Student Information</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
        rel="stylesheet"
        >

</head>
<body>

  <div class="container mt-5">
    <h1 class="text-center mb-4">Student Information</h1>

    <form action="AddServlet" method="post" class="mx-auto w-50">
      <div class="mb-3">
        <label class="form-label">Enter Name:</label>
        <input type="text" name="sname" placeholder="Student name" class="form-control"  required>
      </div>

      <div class="mb-3">
        <label class="form-label">Enter Mobile:</label>
        <input type="text" name="smobile" placeholder="Student mobile" class="form-control"  required>
      </div>

      <div class="mb-3">
        <label class="form-label">Enter Class:</label>
        <input type="text" name="sclass" placeholder="Student class" class="form-control"  required>
      </div>

      <div class="mb-3">
        <label class="form-label">Enter Email:</label>
        <input type="text" name="semail" placeholder="Student email" class="form-control"  required>
      </div>

      <div class="text-center">
        <button type="submit" class="btn btn-primary">Add</button>
      </div>
    </form>
  </div>

</body>
</html>
