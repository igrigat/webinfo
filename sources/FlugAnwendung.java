/*
  Dateiname     : FlugAnwendung.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Main-Methode für die Rückgabe aller Datensätze als 'Flug-Array'.
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
//    DB_Flug.löscheAlleDatensätze();
    System.out.format("Anzahl angelegter Flüge = %d\n", 
                      DB_Flug.holeAnzahlDatensätze());
    DB_Flug.zeigeAlleDatensätzeAn();
    DB_Flug.zeigeAlleDatensätzeAnInTabelle();

  Flug [] alleFlüge = DB_Flug.holeAlleDatensätze();

    System.out.format("Anzeige der Flüge in Tabelle flug08\n\n");  
    System.out.format("Gesamtzahl = %d\n", alleFlüge.length);  
    for (int i=0; i < alleFlüge.length; i++) {
      System.out.format("\nNummer = %d\n", i);
      System.out.format("Startort = %s\n", alleFlüge[i].getStartort());
      System.out.format("Zielort = %s\n", alleFlüge[i].getZielort());
      System.out.format("Abflugdatum = %s\n", alleFlüge[i].getAbflugdatum());
      System.out.format("Abflugzeit = %s\n", alleFlüge[i].getAbflugzeit());
      System.out.format("Platzanzahl = %d\n", alleFlüge[i].getPlatzanzahl());
    }    
  }

}
