import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*; 
import java.util.*;

public class HttpRequestDemoServlet3 extends HttpServlet {
public void doGet(HttpServletRequest request, 
HttpServletResponse response) 
throws ServletException, IOException {
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
out.println("<HTML>"); 
out.println("<HEAD>");
out.println("<TITLE>Obtaining Multi-Value Parameters</TITLE>");
out.println("</HEAD>");
out.println("<BODY>");
out.println("<BR>");
out.println("<BR>Select your favorite music:"); 
out.println( "<BR><FORM METHOD=POST>"); 
out.println("<BR><INPUT TYPE=CHECKBOX " + "NAME=favoriteMusic VALUE=Rock>Rock"); 
out.println("<BR><INPUT TYPE=CHECKBOX " + "NAME=favoriteMusic VALUE=Jazz>Jazz"); 
out.println("<BR><INPUT TYPE=CHECKBOX " + "NAME=favoriteMusic VALUE=Classical>Classical"); 
out.println("<BR><INPUT TYPE=CHECKBOX " + "NAME=favoriteMusic VALUE=Country>Country"); 
out.println("<BR><INPUT TYPE=SUBMIT VALUE=Submit>"); 
out.println("</FORM>"); 
out.println("</BODY>"); 
out.println("</HTML>");
}
 
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

String[] values = request.getParameterValues("favoriteMusic");
 response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
if (values != null ) {
int length = values.length;
out.println("You have selected: ");
for (int i=0; i<length; i++) { 
out.println("<BR>" + values[i]);
}
}
}
}
