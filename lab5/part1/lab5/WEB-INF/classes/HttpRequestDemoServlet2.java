import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
 
public class HttpRequestDemoServlet2 extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
out.println("<HTML>"); 
out.println("<HEAD>");
out.println("<TITLE>Obtaining the Parameter</TITLE>");
out.println("</HEAD>");
out.println("<BODY>");
out.println("The request's parameters are:<BR>");

Enumeration enumeration = request.getParameterNames(); 
while (enumeration.hasMoreElements()){
String parameterName = (String)enumeration.nextElement();
out.println(parameterName +":."+ request.getParameter(parameterName) + "<BR>" );
}
out.println("<FORM METHOD=GET>");
out.println("<BR>First Name: <INPUT TYPE=TEXT NAME=FirstName>");
out.println("<BR>Last Name: <INPUT TYPE=TEXT NAME=LastName>");
out.println("<BR><INPUT TYPE=SUBMIT VALUE=Submit>");
out.println("</FORM>");
out.println("</BODY>");
out.println("</HTML>");
}
}

