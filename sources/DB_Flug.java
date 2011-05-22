/*
  Dateiname     : DB_Flug.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Anlegen der Tabelle.
                  Eintrag eines Datensatzes.
                  Löschen eines Datensatzes.
                  Ermittlung 'Anzahl der Datensätze'.
                  Anzeige der Datensätze mit zwei Anzeigemethoden.
                  Anpassungen an eigene Nutzernummer 
                  (bei package u00; und 5x flug00) !!
  Version       : 09.02.2011
*/
package u08;

import va2.DBI;
import va2.Flug;
import java.sql.*;

public class DB_Flug
implements DBI {

  private static final String CREATE_STRING = 
                                "create table if not exists flug08 ("     +
                                "  startort    varchar(40),"            +
                                "  zielort     varchar(40),"            +
                                "  abflugdatum varchar(10),"            +
                                "  abflugzeit  varchar(5),"             +
                                "  platzanzahl smallint"                +
                                ")";   

  static public Connection baueVerbindungAuf()
  {
  Connection dbc = null;
  
    try {
      Class.forName(TREIBER_NAME);  // Treiber-Klasse laden      
      dbc = DriverManager.getConnection(DB_ADRESSE, NUTZER, KENNWORT);
    }
    catch (ClassNotFoundException cnfe) {
      System.out.format("%s\n", cnfe);
    }
    catch (SQLException sqle) {
      System.out.format("%s\n", sqle);
    }
    
    return dbc;
  }
 
  static public void beendeVerbindung(Connection dbc)
  {
    try {
      dbc.close();
    } catch (SQLException sqle) {
      System.out.format("Fehler in beendeVerbindung(): %s\n", sqle);
    } 
  }
 
  static public boolean legeTabelleAn()
  {
  boolean result = false;
  Connection dbc = baueVerbindungAuf();

// Tabelle in Datenbank anlegen   
    try {
      Statement s = dbc.createStatement();
      s.executeUpdate(CREATE_STRING);
      result = true;
    }
    catch (SQLException sqle) {
      System.out.format("Fehler in legeTabelleAn(): %s\n", sqle);
    } 
    finally {
      beendeVerbindung(dbc);
    }
    
    return result;
  }
 
  static public boolean trageDatensatzEin(Flug flug)
  {
  boolean result = false;
  Connection dbc = baueVerbindungAuf();
  
  String insertString = "insert into flug08 values ( '"       +
                        flug.getStartort()       +   "', '"   +
                        flug.getZielort()        +   "', '"   +
                        flug.getAbflugdatum()    +   "', '"   +
                        flug.getAbflugzeit()     +   "', "    +
                        flug.getPlatzanzahl()    + ")";
                        
    try {
      Statement s = dbc.createStatement();
      s.executeUpdate(insertString);
      result = true;
    }
    catch (SQLException sqle) {
      System.out.format("Fehler in trageDatensatzEin(): %s\n", sqle);
    } 
    finally {
      beendeVerbindung(dbc);
    }
    
    return result;
  }

  static public boolean löscheAlleDatensätze()
  {
  boolean result = false;
  Connection dbc = baueVerbindungAuf();

// Alle Datensätze in Tabelle löschen              
    try {
      Statement s = dbc.createStatement();
      s.executeUpdate("delete from flug08");
      result = true;
    }
    catch (SQLException sqle) {
      System.out.format("Fehler in löscheAlleDatensätze(): %s\n", sqle);
    } 
    finally {
      beendeVerbindung(dbc);
    }

    
    return result;
  }                      

// Anzahl der Datensätze in Tabelle holen
  static public int holeAnzahlDatensätze()
  {
  Connection dbc = baueVerbindungAuf();
  int anzahl = -1;
  String selectString = "select count(*) as anzahl from flug08";
  
    try {
      Statement s = dbc.createStatement();
      ResultSet rs = s.executeQuery(selectString);
      rs.next();
      anzahl = rs.getInt("anzahl");
    }
    catch (SQLException sqle) {
      System.out.format("Fehler in holeAnzahlDatensätze(): %s\n", sqle);
    } 
    finally {
      beendeVerbindung(dbc);
    }

    return anzahl;
  }

// Alle Datensätze aus Tabelle anzeigen
  static public void zeigeAlleDatensätzeAn()
  {
  Connection dbc = baueVerbindungAuf();
  String selectString = "select * from flug08";
  
    try {
      Statement s = dbc.createStatement();
      ResultSet rs = s.executeQuery(selectString);
      while (rs.next()) {
        System.out.format("\nStartort = %s\n", rs.getString("startort"));
        System.out.format("Zielort = %s\n", rs.getString("zielort"));
        System.out.format("Abflugdatum = %s\n", rs.getString("abflugdatum"));
        System.out.format("Abflugzeit = %s\n", rs.getString("abflugzeit"));
        System.out.format("Platzanzahl = %d\n", rs.getInt("platzanzahl"));
      }
    }
    catch (SQLException sqle) {
      System.out.format("Fehler in zeigeAlleDatensätzeAn(): %s\n", sqle);
    } 
    finally {
      beendeVerbindung(dbc);
    }

  }                        

// Alle Datensätze aus Tabelle anzeigen
  static public void zeigeAlleDatensätzeAnInTabelle()
  {
  Connection dbc = baueVerbindungAuf();
  String selectString = "select * from flug08";
  
    try {
      Statement s = dbc.createStatement();
      ResultSet rs = s.executeQuery(selectString);
      System.out.format("\n\nStartort          Zielort           Abflugdatum Abflugzeit Platzanzahl\n");
      System.out.format("======================================================================\n");
      while (rs.next()) {
        System.out.format("%-17s %-17s %11s %9s %9d\n", rs.getString("startort")
                          , rs.getString("zielort"), rs.getString("abflugdatum")
                          , rs.getString("abflugzeit"), rs.getInt("platzanzahl"));
      }
    }
    catch (SQLException sqle) {
      System.out.format("Fehler in zeigeAlleDatensätzeAnInTabelle(): %s\n", sqle);
    } 
    finally {
      beendeVerbindung(dbc);
    }

  }                          
                          
}
                      