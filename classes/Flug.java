/*
  Dateiname     : Flug.java
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Bean-Klasse für die Arbeit mit einem Flug.
  Version       : 10.02.2011
*/
package va2;

public class Flug {

  private String startort;
  private String zielort;
  private String abflugdatum;
  private String abflugzeit;
  private int platzanzahl;

  public Flug()
  {
  }

  public Flug(String startort, String zielort, String abflugdatum,
              String abflugzeit,int platzanzahl)
  {
    this.startort = startort;
    this.zielort = zielort;
    this.abflugdatum = abflugdatum;
    this.abflugzeit = abflugzeit;
    this.platzanzahl = platzanzahl;
  }


  public void setStartort(String startort)
  {
    this.startort = startort;
  }
  
  public void setZielort(String zielort)
  {
    this.zielort = zielort;
  }
  
  public void setAbflugdatum(String abflugdatum)
  {
    this.abflugdatum = abflugdatum;
  }
  
  public void setAbflugzeit(String abflugzeit)
  {
    this.abflugzeit = abflugzeit;
  }
    
  public void setPlatzanzahl(int platzanzahl)
  {
    this.platzanzahl = platzanzahl;
  }

  public String getStartort()
  {
    return startort;
  }
  
  public String getZielort()
  {
    return zielort;
  }
  
  public String getAbflugdatum()
  {
    return abflugdatum;
  }
  
  public String getAbflugzeit()
  {
    return abflugzeit;
  }
    
  public int getPlatzanzahl()
  {
    return platzanzahl;
  }
   
}
