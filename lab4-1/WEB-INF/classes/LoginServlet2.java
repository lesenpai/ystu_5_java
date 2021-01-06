import javax.servlet.*; 
import javax.servlet.http. *; 
import java.io.*; 
import java.util.*;

public class LoginServlet2 extends HttpServlet { 
	private void sendLoginForm(HttpServletResponse response, boolean withErrorMessage) 
	throws ServletException, IOException { 
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.println("<html>"); 
		out.println("<head>"); 
		out.println("<title>Login</title>");
		out.println("</head>");
		out.println("<body>");
		if (withErrorMessage) {
			out.println("Login failed. Please try again.<br>");
		}
		out.println("<br>");
		out.println("<br>Please enter your user name and password."); 
		out.println("<br><form method=POST>");
		out.println("<br>Username: <input type=text name=username>");
		out.println("<br>Password: <input type=password name=password>");
		out.println("<br><input type=submit value=Submit>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException { 
		sendLoginForm(response, false);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		if (userName!=null && password!=null && 
			userName.equals("root") && password.equals("root")) 
		{
			RequestDispatcher rd = request.getRequestDispatcher("welcome6");
			rd.forward(request, response);
		}
		else {
			sendLoginForm(response, true);
		}
	}
}
