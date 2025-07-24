package servletconfigdemo;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ConfigServlet
 */

public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//both are objects
//servlet configs are limited for the perticular servlet
		//servlet contextis global->any servlet can access the context
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		String websitename=context.getInitParameter("websitename");
		String name=config.getInitParameter("name");
		String id=config.getInitParameter("id");
		response.getWriter().println("developer name : "+name);
		response.getWriter().println("developer id : "+id);
		response.getWriter().println("website name : "+websitename);
	}


}
