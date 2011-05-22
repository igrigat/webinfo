@echo off
REM Zuerst Anzeige ausschalten

REM Dateiname: jcomultra.bat
REM
REM Aufgabe  : �bersetzt Java-Sourcecode in Bytecode und f�hrt ihn aus.
REM Datum    : 24.09.2010
REM Aufruf   : jcomdev "Dateiname ohne Endung"

REM Diesen Teil evtl. anpassen!!
set jdk=c:\programme\java\jdk1.5.0_01
set wirt=K:\java\awp
set wirtclasses=%wirt%\classes
set wirtclasspath=%wirtclasses%;%wirt%\lib\sapjco.jar;%wirt%\lib\servlet-api.jar;K:\java\awp\lib\mysql-connector-java-5.1.7-bin.jar

REM cls                                               REM Bildschirm l�schen                                              

REM Mitteilung ausgeben
echo �bersetze Datei %2%.java in Bytecode ...     

REM �bersetzung starten, Aufruf des Java-Compilers   
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
echo " "
echo " "

echo %2%.class wird ausgef�hrt ...
echo ----------------------------------------------------------------

REM Bytecode ausf�hren
%jdk%\bin\java -cp %wirtclasspath% %2%
echo ----------------------------------------------------------------

if NOT errorlevel 1 goto ERFOLGEXE

:FEHLEREXE
echo Bei der Ausf�hrung von %2%.class sind Fehler aufgetreten!
goto ENDE

:ERFOLGEXE
echo %2%.class wurde erfolgreich durchgef�hrt!

:ENDE                                             REM Ende der Batchdatei
REM Anzeige einschalten
@echo on                                        
