import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
 response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  out.println("<HTML>");
   out.println("<HEAD>");
    out.println("<TITLE>The GET method</TITLE>");
out.println("</HEAD>"); 
out.println("<BODY>");
out.println("The servlet has received a GET. " +"Now, click the button below."); 
out.println("<BR>");
 out.println("<FORM METHOD=POST>"); 
out.println("<INPUT TYPE=SUBMIT VALUE=Submit>"); 
out.println("</FORM>");
 out.println("</BODY>");
 out.println("</HTML>");
}
public void doPost( HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException {
 response.setContentType("text/html");
 PrintWriter out = response.getWriter(); 
out.println("<HTML>");
 out.println("<HEAD>");
out.println("<TITLE>The POST method</TITLE>");
out.println("</HEAD>");
out.println("<BODY>");
out.println("The servlet has received a POST. Thank you.");
out.println("</BODY>");
out.println("</HTML>");
}
}
