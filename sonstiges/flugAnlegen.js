/*
  Dateiname     : flugAnlegen.js
  Veranstaltung : Webbasierte Informationssysteme
  Fragestellung : Textdatei mit JavaScript-Elementen zum Formular FlugAnlegen.html,
                  komplette Funktionalität für unser Formular.
  Version       : 01.02.2011
*/

/* hinweis() wird beim Laden der Seite aufgerufen */
  function hinweis()
  {
    alert('Mit diesem Formular kann ein Flug angelegt werden');
  }
  

/* senden() wird beim Anklicken des Button Senden aufgerufen */  
  function senden()
  {
  var formular = document.forms[0];
  var element  = document.forms[0].platzanzahl;
  var index    = element.selectedIndex;
  var text     = element.options[index].text;
    alert("Startort = " + formular.startort.value          + 
          "\n Zielort = " + formular.zielort.value         + 
          "\n Abflugdatum = " + formular.abflugdatum.value + 
          "\n Abflugzeit = " + formular.abflugzeit.value   + 
          "\n Typ = " + text                               + 
          "\n Platzanzahl = " + element.value);
  }
  

/* testeEingaben() wird vor dem Versenden der Formulareingaben aufgerufen.
*/  
  function testeEingaben()
  {
  var formular = document.forms[0];
    
    if ( formular.startort.value == formular.zielort.value ) {
      alert("Startort und Zielort müssen verschieden sein!!!");
      return false;
    } 
    
  }
