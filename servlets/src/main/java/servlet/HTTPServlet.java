package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HTTPServlet
 *
 * servlet collabouration
 * 1]sendRedirect
 * 2]RequestDispatcher
 */

public class HTTPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().print("<h1>welcome to HTTPServlet</h1>");
		response.getWriter().print("<form action='FormServlet' method='get'>");
		response.getWriter().print("<input type='text' name='uname'>");
		response.getWriter().print("<button type='submit' >submit</button>");
		response.getWriter().print("</form>");



	}


}
