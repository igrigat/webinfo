/* 
  Dateiname     : Servlet01.html
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Servlet-Klasse, einfache HTML-Seite aufbauen.
  Version       : 10.02.2011
*/
package u08;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet01 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.format("<html>\n");
        out.format("<body>\n");
        out.format("<head>\n");
        out.format("<title>Einfache Textausgabe</title>\n");
        out.format("</head>\n");
        
        out.format("<body>\n");
        out.format("<h1>Ausgabe von Servlet01</h1>\n");

        out.format("</body>\n");
        out.format("</html>\n");
    }
}
