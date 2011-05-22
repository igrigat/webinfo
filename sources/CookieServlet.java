/* 
  Dateiname     : CookieServlet.html
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Servlet-Klasse, Cookie über Header-Element setzen.
  Version       : 10.02.2011
*/
package u08;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {  
        response.setContentType("text/html");
        response.addCookie(new Cookie("va2-cookie", "va2-00"));
        
        PrintWriter out = response.getWriter();
        out.format("<html>\n");
        out.format("<body>\n");
        out.format("<head>\n");
        out.format("<title>Cookie setzen</title>\n");
        out.format("</head>\n");
        
        out.format("<body>\n");
        out.format("<h1>Ist das Cookie gesetz?</h1>\n");
        
        out.format("</body>\n");
        out.format("</html>\n");
    }
}
