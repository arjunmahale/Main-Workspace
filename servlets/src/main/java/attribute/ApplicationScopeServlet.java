package attribute;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/ApplicationScopeServlet")
public class ApplicationScopeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer= response.getWriter();

		ServletContext context=getServletContext();
		String database=(String) context.getAttribute("database");
		writer.print(" database name : "+database);

		String name= request.getParameter("name");
		writer.print("name is with request scope : "+name);
	}


}
