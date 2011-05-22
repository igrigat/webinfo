/*
  Dateiname     : Verbindungstest.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Programm zum Test der Verbindung mit Datenbank.
  Version       : 03.02.2011
*/
import va2.DBI;
import java.sql.*;

public class Verbindungstest
implements DBI {

  static public void main(String [] argumente)
  {

// Verbindung aufbauen  	
    try {
      Class.forName(TREIBER_NAME);  // Treiber-Klasse laden      
      Connection dbc = DriverManager.getConnection(DB_ADRESSE, NUTZER, KENNWORT);
    }
    catch (ClassNotFoundException cnfe) {
      System.out.format("%s\n", cnfe);
    }
    catch (SQLException sqle) {
      System.out.format("%s\n", sqle);
    }
    
  }

}
