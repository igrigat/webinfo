@echo off
REM Zuerst Anzeige ausschalten

REM Dateiname: jcomultra.bat
REM
REM Aufgabe  : �bersetzt Java-Sourcecode in Bytecode.
REM Datum    : 24.09.2010
REM Aufruf   : jcomultra "Dateiname ohne Endung"

REM Diesen Teil evtl. anpassen!!
set jdk=c:\programme\java\jdk1.5.0_01
set wirt=K:\java\awp
set wirtclasses=%wirt%\classes
set wirtclasspath=%wirtclasses%;%wirt%\lib\sapjco.jar;%wirt%\lib\servlet-api.jar;K:\java\awp\lib\mysql-connector-java-5.1.7-bin.jar

REM cls                                               REM Bildschirm l�schen                                              

REM Mitteilung ausgeben
echo �bersetze Datei %1%.java in Bytecode ...  
   
REM �bersetzung starten, Aufruf Java-Compiler 
%jdk%\bin\javac -g -d %wirtclasses% -classpath %wirtclasspath% %1%.java    

if NOT errorlevel 1 goto ERFOLG                   REM �bersetzung fehlerlos?

:FEHLER                                           REM Fehlerfall behandeln
REM Fehlermeldung ausgeben
echo Bei der �bersetzung sind Fehler aufgetreten!
goto ENDE                                         REM Sprung zum Dateiende

:ERFOLG                                           REM Erfolgsfall behandeln
REM Meldung �ber erfolgreiche �bersetzung und
REM der Erzeugung einer Bytecode-Datei ausgeben
echo �bersetzung wurde erfolgreich abgeschlossen! 
echo Die Bytecode-Datei %2%.class wurde erzeugt!

:ENDE                                             REM Ende der Batchdatei
REM Anzeige einschalten
@echo on                                        
