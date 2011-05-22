/* 
  Dateiname     : Servlet02.html
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Servlet-Klasse, Ausgabe einiger Methode von Anfrage-Objekt.
  Version       : 10.02.2011
*/
package u08;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet02 extends HttpServlet {

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
        out.format("<h1>Ausgabe von Servlet02!!</h1>\n");
        out.format("<h1>Methode       = %s </h1>\n", request.getMethod());
        out.format("<h1>Path-Info     = %s </h1>\n", request.getPathInfo());
        out.format("<h1>User-Agent    = %s </h1>\n", request.getHeader("User-Agent"));
        out.format("<h1>QueryString   = %s </h1>\n", request.getQueryString());
        out.format("<h1>ContentLength = %s </h1>\n", request.getContentLength());
        out.format("<h1>ContentType   = %s </h1>\n", request.getContentType());
        out.format("<h1>Remote-Host   = %s </h1>\n", request.getRemoteHost());
        out.format("<h1>Remote-Adresse= %s </h1>\n", request.getRemoteAddr());

        out.format("</body>\n");
        out.format("</html>\n");
    }
}
