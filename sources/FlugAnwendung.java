/*
  Dateiname     : FlugAnwendung.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Main-Methode f�r die R�ckgabe aller Datens�tze als 'Flug-Array'.
                  Anpassungen an eigene Nutzernummer 
                  (bei package u00; und 1x flug00) !!
  Version       : 09.02.2011
*/
import va2.Flug;
import u08.DB_Flug; // Eigenes Package unn!!!

public class FlugAnwendung {

  static public void main(String [] argumente)
  {
//  Flug flug = new Flug("Frankfurt", "Hannover", "10.02.2008", "08:00", 115);

//    DB_Flug.legeTabelleAn();
//    DB_Flug.trageDatensatzEin(flug);
//    DB_Flug.l�scheAlleDatens�tze();
    System.out.format("Anzahl angelegter Fl�ge = %d\n", 
                      DB_Flug.holeAnzahlDatens�tze());
    DB_Flug.zeigeAlleDatens�tzeAn();
    DB_Flug.zeigeAlleDatens�tzeAnInTabelle();

  Flug [] alleFl�ge = DB_Flug.holeAlleDatens�tze();

    System.out.format("Anzeige der Fl�ge in Tabelle flug08\n\n");  
    System.out.format("Gesamtzahl = %d\n", alleFl�ge.length);  
    for (int i=0; i < alleFl�ge.length; i++) {
      System.out.format("\nNummer = %d\n", i);
      System.out.format("Startort = %s\n", alleFl�ge[i].getStartort());
      System.out.format("Zielort = %s\n", alleFl�ge[i].getZielort());
      System.out.format("Abflugdatum = %s\n", alleFl�ge[i].getAbflugdatum());
      System.out.format("Abflugzeit = %s\n", alleFl�ge[i].getAbflugzeit());
      System.out.format("Platzanzahl = %d\n", alleFl�ge[i].getPlatzanzahl());
    }    
  }

}
