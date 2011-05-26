/* 
  Dateiname     : DB_Eintrag.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Servlet-Klasse, Eintrag der Formulardaten in Datenbank.
  Version       : 10.02.2011
*/
package u08;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import va2.Flug;

public class DB_Eintrag 
extends HttpServlet {

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
        out.format("<title>DB-Eintrag</title>\n");
        out.format("</head>\n");        
        out.format("<body>\n");
        
        out.format("Startort = %s<br>\n", request.getParameter("startort"));
        out.format("Zielort = %s<br>\n", request.getParameter("zielort"));
        out.format("Abflugdatum = %s<br>\n", request.getParameter("abflugdatum"));
        out.format("Abflugzeit = %s<br>\n", request.getParameter("abflugzeit"));
        out.format("Platzanzahl = %s<br>\n", request.getParameter("platzanzahl"));
        
      Flug flug = new Flug(request.getParameter("startort"), 
                           request.getParameter("zielort"),
                           request.getParameter("abflugdatum"),
                           request.getParameter("abflugzeit"),
                           Integer.parseInt(request.getParameter("platzanzahl")));
        DB_Flug.trageDatensatzEin(flug);
        
        out.format("<p>Datensatz eingetragen!!\n");
        out.format("</body>\n");
        out.format("</html>\n");
    }
}
