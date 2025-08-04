package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.Student;
import com.mysql.cj.protocol.Resultset;

public class DBConnection {

	public static Connection getconnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;

	}

	public static int addstudent(Student student) {
		int result = 0;
		try {
			Connection con = getconnection();
			String query = "INSERT INTO student_data (sname, smobile, sclass, semail,image) VALUES (?,?, ?, ?, ?)";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, student.getSname());
			stmt.setString(2, student.getSmobile());
			stmt.setString(3, student.getSclass());
			stmt.setString(4, student.getSemail());
			stmt.setString(5, student.getSimage());

			result = stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	//update student method
	public static int updatestudent(Student student) {
		int result = 0;
		try {
			Connection con = getconnection();
			String query = "update student_data set sname=?, smobile=?, sclass=?, semail=?  where id=?";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, student.getSname());
			stmt.setString(2, student.getSmobile());
			stmt.setString(3, student.getSclass());
			stmt.setString(4, student.getSemail());

			result = stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	//delete student method
	public static int delete_student(int id) {
		int result = 0;
		try {
			Connection con = getconnection();
			String query = "delete from student_data where id=?";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);

			result = stmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}


	public static ResultSet showstudents() {
		ResultSet rs=null;
		try {
			Connection con = getconnection();
			String query = "select * from student_data";

			Statement stmt= con.createStatement();
			 rs=stmt.executeQuery(query);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;

	}

	public static Student getstudentById(int id) {
		Student student = null;
		try {
			Connection con = getconnection();
			String query = "select * from student_data where id=?";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, id);

			 ResultSet rs=stmt.executeQuery();
			  student=new Student();

			 while(rs.next())
			 {
				 student.setSname(rs.getString("sname"));
				 student.setSmobile(rs.getString("smobile"));
				 student.setSclass(rs.getString("sclass"));
				 student.setSemail(rs.getString("semail"));


			 }


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}
}
