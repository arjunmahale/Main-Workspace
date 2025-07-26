package sessionTracking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/FirstSessionServlet")
public class FirstSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		session.setAttribute("uname", username);
		session.setAttribute("pass", password);

		writer.print(" username : " + session.getAttribute("uname") + "\n password : " + session.getAttribute("pass"));

		writer.print("<a href='SecondSessionServlet'>use this info in another servlet/request</a>");
	}

}
/*
 * Session Tracking Techniques in Java (Servlets) There are four main ways to
 * track a session in Java:
 *
 * 1. Cookies A cookie is a small piece of information stored on the client’s
 * browser.
 *
 * The server sends a cookie to the client; the client includes it in future
 * requests.
 *
 * java Copy Edit Cookie cookie = new Cookie("username", "Arjun");
 * response.addCookie(cookie); To retrieve:
 *
 * java Copy Edit Cookie[] cookies = request.getCookies(); for (Cookie c :
 * cookies) { if (c.getName().equals("username")) { out.println("Hello " +
 * c.getValue()); } } 2. URL Rewriting Appends session data directly into the
 * URL.
 *
 * java Copy Edit response.sendRedirect("profile.jsp?user=Arjun"); To retrieve:
 *
 * java Copy Edit String user = request.getParameter("user"); 3. Hidden Form
 * Fields Stores data in a hidden input field of a form.
 *
 * html Copy Edit <form action="nextServlet" method="post"> <input type="hidden"
 * name="user" value="Arjun"> <input type="submit" value="Go"> </form> In the
 * servlet:
 *
 * java Copy Edit String user = request.getParameter("user"); 4. HttpSession
 * (Most Common & Secure) Java EE provides HttpSession object to store user data
 * on the server.
 *
 * java Copy Edit //Creating or retrieving the session HttpSession session =
 * request.getSession();
 *
 * //Storing data session.setAttribute("username", "Arjun");
 *
 * //Retrieving data String user = (String) session.getAttribute("username");
 * You can invalidate the session like this:
 *
 * java Copy Edit session.invalidate();
 */