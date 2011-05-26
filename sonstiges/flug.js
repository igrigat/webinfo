/*
  Dateiname     : flug.js
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Textdatei mit JavaScript-Elementen zur Übung mit Datentyp Flug.
  Version       : 03.02.2011
*/
 
      function Flug(startort, zielort, platzanzahl)
      {      
        this.getStartort = function() { return startort;}
        this.getZielort = function() { return zielort;}
        this.getPlatzanzahl = function() { return platzanzahl;}
        this.zeigeAn = function() {
          var text = "Startort = " + startort + "\nZielort = " + zielort +
                     "\nPlatzanzahl = " + platzanzahl;
          alert(text);
        }
      }
 
     function test()
      {
      var s = new Flug("Frankfurt", "Vancouver", 110);
         alert(s.getStartort() + " - " + s.getZielort() + " - " +  s.getPlatzanzahl());
      }
    
