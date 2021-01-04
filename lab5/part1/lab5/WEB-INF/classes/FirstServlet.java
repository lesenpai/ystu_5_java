import javax.servlet.*;
import javax.servlet.http.*; 
import java.io.*;
public class FirstServlet extends HttpServlet {
public void doGet(HttpServletRequest request, 
HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
out.println("<HTML>"); 
out.println("<HEAD>");
out.println("<TITLE>Included Request Parameters</TITLE>");
out.println("</HEAD>");
out.println("<BODY>");
out.println("<B>Included Request Parameters</B><BR>"); 
RequestDispatcher rd =
request.getRequestDispatcher("/SecondServlet?name=Gashkov Alexey"); 
rd.include(request, response); 
out.println("</BODY>"); 
out.println("</HTML>");
}
}

