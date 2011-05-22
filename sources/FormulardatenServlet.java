/* 
  Dateiname     : FormulardatenServlet.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Servlet-Klasse, Anzeige der Formulardaten.
  Version       : 10.02.2011
*/
package u00;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FormulardatenServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {  
      doPost(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {  
      response.setContentType("text/html");
      
      PrintWriter out = response.getWriter();
      out.format("<html>\n");
      out.format("<body>\n");
      out.format("<head>\n");
      out.format("<title>Alle Formulardaten anzeigen</title>\n");
      out.format("</head>\n");        
      out.format("<body>\n");
      
      out.format("Startort = %s<br>\n", request.getParameter("startort"));
      out.format("Zielort = %s<br>\n", request.getParameter("zielort"));
      out.format("Abflugdatum = %s<br>\n", request.getParameter("abflugdatum"));
      out.format("Abflugzeit = %s<br>\n", request.getParameter("abflugzeit"));
      out.format("Platzanzahl = %s<br>\n", request.getParameter("platzanzahl"));
      
      out.format("</body>\n");
      out.format("</html>\n");
    }
}
