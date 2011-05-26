/*
  Dateiname     : FlugAnwendung.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Main-Methode f�r die Anzeige der Datens�tze.
                  Mit zweiter Anzeigemethode.
                  Anpassungen an eigene Nutzernummer 
                  (bei package u00;) !!
  Version       : 09.02.2011
*/
// import va2.Flug;
import u08.DB_Flug; // Eigenes Package unn!!!

public class FlugAnwendung {

  static public void main(String [] argumente)
  {
//  Flug flug = new Flug("Hannover", "Montpellier", "01.09.2011", "14:15", 115);

//    DB_Flug.legeTabelleAn();
//    DB_Flug.trageDatensatzEin(flug);
//    DB_Flug.l�scheAlleDatens�tze();
    System.out.format("Anzahl angelegter Fl�ge = %d\n", 
                      DB_Flug.holeAnzahlDatens�tze());
    DB_Flug.zeigeAlleDatens�tzeAn();
    DB_Flug.zeigeAlleDatens�tzeAnInTabelle();
  }

}
