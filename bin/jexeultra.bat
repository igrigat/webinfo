@echo off
REM Zuerst die Anzeige ausschalten

REM Dateiname: jexeultra.bat
REM
REM Aufgabe  : F�hrt Java-Bytecode aus.
REM Datum    : 24.09.2010
REM Aufruf   : jexeultra "Klassenname ohne Endung class"

REM Diesen Teil evtl. anpassen!
set jdk=c:\programme\java\jdk1.5.0_01
set wirt=K:\java\awp
set wirtclasses=%wirt%\classes
set wirtclasspath=%wirtclasses%;%wirt%\lib\sapjco.jar;%wirt%\lib\servlet-api.jar;K:\java\awp\lib\mysql-connector-java-5.1.7-bin.jar

REM cls                REM Bildschirm l�schen

REM Java-Bytecode ausf�hren
echo %1%.class wird ausgef�hrt ...
echo ----------------------------------------------------------------
%jdk%\bin\java -cp %wirtclasspath% %1%
echo ----------------------------------------------------------------

if NOT errorlevel 1 goto ERFOLG

:FEHLER
echo Bei der Ausf�hrung von %1%.class sind Fehler aufgetreten!
goto ENDE

:ERFOLG
echo %1%.class wurde erfolgreich durchgef�hrt!

:ENDE
REM Anzeige wieder einschalten
@echo on

