package com.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.bean.Student;
import com.db.DBConnection;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stubas
		res.setContentType("text/html");

  PrintWriter writer= res.getWriter();
		String sname= req.getParameter("sname");
		String smobile= req.getParameter("smobile");
		String sclass= req.getParameter("sclass");
		String semail= req.getParameter("semail");

		Student student=new Student(sname, smobile, sclass, semail);

		int result= DBConnection.addstudent(student);

		if(result>0)
		{
			writer.print("data inserted successfully");
			writer.print("<a href=\"index.jsp\">go to home</a>");

		}
		else
		{
			writer.print("error occured");
			writer.print("<a href=\"index.jsp\">try again</a>");
		}


	}

}
