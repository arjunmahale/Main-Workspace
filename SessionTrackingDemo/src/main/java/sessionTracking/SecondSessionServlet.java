package sessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/SecondSessionServlet")
public class SecondSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer= response.getWriter();
HttpSession session=request.getSession(false);

		writer.print("username accessed in another servlet ");
		writer.print("username : "+session.getAttribute("uname")+"\n password : "+session.getAttribute("pass"));


	}




}
