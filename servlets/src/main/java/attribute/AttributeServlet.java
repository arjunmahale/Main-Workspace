package attribute;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/AttributeServlet")
public class AttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	//attribute is a object used to store and remove the data->object that stores data
//scopes in attributes:(accessibility)
	//1]application scope-> we can access attribute in whole application
	//2]request scope->limites for the request like servlet config
	//3]session scope->



	//setattibute() and getattribute()
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		ServletContext context=getServletContext();
		context.setAttribute("database", "mysql");
	  PrintWriter writer=response.getWriter();

	  writer.print("<h1>Working</h1>");
	  writer.print("<a href='ApplicationScopeServlet'>go to Application scope servlet</a>");

	}


}
