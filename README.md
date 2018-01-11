# trinat-bloch-texteditor

Das Projekt wurde durch EyHoCk, felixleitlein, G3r0m3, mzbinden und Flip87 erstellt.


## Inhaltsverzeichnis
- [Einleitung](#einleitung)
	* [Ziele](#ziele)
	* [Randbedingungen](#randbedingungen)
- [Build-Anleitung](#build-anleitung)
	* [Vorausetzungen](#vorausetzungen)
	* [Build](#build)
- [Kurze Bedienungsanleitung ](#kurze-bedienungsanleitung)
- [User Stories](#user-stories)
	* [Ausbaustufe 1](#ausbaustufe-1)
	* [Ausbaustufe 2](#ausbaustufe-2)
	* [Ausbaustufe 3](#ausbaustufe-3)
- [Releaseplan mit den Ausbaustufen](#releaseplan-mit-den-ausbaustufen)
- [Dokumentation Sprint 1](#dokumentation-sprint-1)
  	* [Taskliste für die Umsetzung der User Stories _US1_](#taskliste-für-die-umsetzung-der-user-stories-us1)
  	* [Anreicherung der User Stories für die Umsetzung _US1_](#anreicherung-der-user-stories-für-die-umsetzung-us1)
  	* [UML Package und Klassen und Sequenzdiagramm _US1_](#uml-package-und-klassen-und-sequenzdiagramm-us1)
  	* [Dokumentation wichtiger Code Snippets _US1_](#dokumentation-wichtiger-code-snippets-us1)
  	* [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories _US1_](#herleitung-der-testfälle-aus-den-akzeptanzkriterien-der-user-stories-us1)
- [Dokumentation Sprint 2](#dokumentation-sprint-2)
  	* [Taskliste für die Umsetzung der User Stories US2](#taskliste-für-die-umsetzung-der-user-stories-us2)
  	* [Anreicherung der User Stories für die Umsetzung US2](#anreicherung-der-user-stories-für-die-umsetzung-us2)
  	* [UML Package und Klassen und Sequenzdiagramm US2](#uml-package-und-klassen-und-sequenzdiagramm-us2)
  	* [Dokumentation wichtiger Code Snippets US2](#dokumentation-wichtiger-code-snippets-us2)
  	* [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories US2](#herleitung-der-testfälle-aus-den-akzeptanzkriterien-der-user-stories-us2)
- [Dokumentation Sprint 3](#dokumentation-sprint-3)
  	* [Taskliste für die Umsetzung der User Stories US3](#taskliste-für-die-umsetzung-der-user-stories-us3)
  	* [Anreicherung der User Stories für die Umsetzung US3](#anreicherung-der-user-stories-für-die-umsetzung-us3)
  	* [UML Package und Klassen und Sequenzdiagramm US3](#uml-package-und-klassen-und-sequenzdiagramm-us3)
  	* [Dokumentation wichtiger Code Snippets US3](#dokumentation-wichtiger-code-snippets-us3)
  	* [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories US3](#herleitung-der-testfälle-aus-den-akzeptanzkriterien-der-user-stories-us3)
	
	
## Einleitung

Hierbei handelt es sich um eine Gruppenarbeit, welche im Rahmen der Kurse Programmieren II – JAVA und Software Engineering unseres Studiengangs Mechatronik Trinational, im dritten Semester anzufertigen war.

Zweck dieses Projekts ist es, die erlernten Programmierkenntnisse und Prinzipien des Software Engineerings anzuwenden.

### Ziele
Es soll eine einfaches Programm erstellt werden, mit welchem eine einfache Textverarbeitung möglich ist. Das Programm soll auf dem Desktop eines MAC, Windows oder Linux Computer ausgeführt werden können. 
### Randbedingungen
 * Die Programmierung der Anwendung soll in JAVA erfolgen.
 * Das Projekt soll auf GitHub veröffentlich werden.
 * Die Buildautomatisierung soll mit MAVEN erfolgen.
 * Das Programm soll mittels einer dafür erstellten JAR-Datei und dem Befehl java-jar xxxxx.jar ausgeführt werden können.

 
## Build-Anleitung 
### Vorausetzungen
* Korrekte Installation von Eclipse.
* Richtig gesetztes Java Home Verzeichnis.
* Korrekte Installation von Maven.
* Korrekte Installation von Git.
### Build
Build Anleitung für alle Betriebssysteme
•	Datei von GitHub Trinat-Bloch-Texteditor-Master herunterladen.
•	Im gewünschten Ordner entpacken.
•	Den Pfad der gewünschten Versionsdatei (.jar) kopieren.
•	Die Eingabeaufforderung (Konsole) öffnen.
•	java -jar in die Eingabeaufforderung eingeben, gefolgt von dem kopierten Pfad der .jar Datei. Mit Enter bestätigen.

Beispiel:
java -jar C:\Users\Max Mustermann\trinat-bloch-texteditor-master\Ausbaustufe01.jar

Besonders für Windows Betriebssystem - Erstellen eines Desktop Icon zum Starten des Programms durch einen Doppelklick.
•	Den Pfad der gewünschten Versionsdatei (.jar) kopieren.
•	Auf dem Desktop mit Rechtsklick eine neue Verknüpfung erstellen.
•	Den Pfad zuvor kopierten Pfad dort eingeben.
•	Die Verknüpfung benennen und mit OK bestätigen.
•	Die Eigenschaften der Verknüpfung aufrufen, dort im Reiter "Verknüpfung" "Anderes Symbol..." auswählen dort Symbol auswählen und mit OK bestätigen
•	Im Reiter "Allgemein" die Option "öffnen mit" ändern auf "Java(TM) Plattform..." und mit OK bestätigen.



## Kurze Bedienungsanleitung 




## User Stories 

### Ausbaustufe 1
| User Story 1 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 2 	|  	|
| Der Benutzer möchte, dass sich beim Starten des Programms ein Fenster öffnet 	|  	|  	| Das Starten der Anwendung öffnet ein JFrame auf dem Desktop des Anwenders. 	|

| User Story 2 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 5 	|  	|
| Der Benutzer möchte einen Text über die Tastatur eingeben können. 	|  	|  	| Beim Tippen auf der Tastatur wird der eingegebene Text auf dem Bildschirm (im JFrame) angezeigt.|

| User Story 3 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 3 	|  	|
| Der Benutzer möchte über ein Menu mit der Maus die Buttons für Schließen, Speichern, Laden angezeigt bekommen. 	|  	|  	| Nach dem Klicken auf den entsprechenden Reiter werden die Buttons "Schließen", "Speichern" und "Laden" angezeigt.	|


| User Story 4 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 3	|  	|
| Der Benutzer möchte das Programm durch klicken mit der Maus schließen können.	|  	|  	| Nach Betätigung des entsprechenden Buttons wird das Programm beendet und das JFrame schliesst sich automatisch. 	|



### Ausbaustufe 2

| User Story 1 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 8 	|  	|
| Der Benutzer möchte, dass durch das Klicken auf den Button "Speichern" der eingegebene Text gespeichert wird.	|  	|  	| Nach dem Klicken auf den Button "Speichern", soll der bisher eingegebene Text lokal gesichert werden. 	|

| User Story 2 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 8	|  	|
| Der Benutzer möchte durch klicken auf den Button "Laden" eine zuvor gespeicherte Datei aufrufen können.	|  	|  	| Durch klicken auf den Button "Laden" Button soll eine zuvor gespeicherte Datei geöffnet und angezeigt werden.|

| User Story 3 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Niedrig	| 2	|  	|
| Der Benutzer möchte, dass im Frame der Titel des Programms angezeigt wird.	|  	|  	| Sobald das Hauptfenster des Programms geöffnet wird, soll im oberen Rahmen der Programmtitel angezeigt werden.	|





### Ausbaustufe 3

| User Story 1 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 3 	|  	|
| Der Benutzer möchte, dass durch das Klicken auf den Button "Neu" eine neue Datei geöfnet wird.	|  	|  	| Nach dem Klicken auf den Button "Neu" öffnet sich ein Neues Textfeld. 	|

| User Story 2 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 8	|  	|
| Der Benutzer möchte durch klicken auf "Laden" eine zuvor gespeicherte Datei aufrufen können.	|  	|  	| Nach dem Klicken auf den Button "Löschen" wird die ausgewählte Datei gelöscht.|

| User Story 3 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Mittel	| 2	|  	|
| Der Benutzer möchte mittel Hotkeys das Menu öffnen können.	|  	|  	| Durch betätigen eines Hotkeys wir das Menu geöffnet.	|

| User Story 4 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Mittel	| 2	|  	|
| Der Benutzer möchte mittel Hotkeys die Befehle "Öffnen", "Speichern", "Neu" und "Löschen" ausführen können.	|  	|  	| Durch betätigen von Hotkeys können die Befehle "Öffnen", "Speichern", "Neu" und "Löschen" ausführen werden.	|

| User Story 5 	| Priorisierung 	| Story Point 	| Akzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Niedrig	| 2	|  	|
| Der Benutzer möchte mittels einer Desktopverknüpfung das Programm direkt öffen können.	|  	|  	| Durch betätigen einer Desktopverknüpfung wird das Programm ausgeführt.	|


## Releaseplan mit den Ausbaustufen

## Dokumentation Sprint 1
### Taskliste für die Umsetzung der User Stories _US1_
| User Story 1 |                             | Aufwandschätzung | 
|--------------|-----------------------------|------------------|
| Task 1       | Erstellen einer Klasse      | 5  min           |
| Task 2       | Erstellen New Jframe        | 5  min           |
| Task 3       | Erstellen Main Methode      | 5  min           |
| Task 4       | Create and show GUI Methode | 10 min           |
|              |                        Summe| 0,42 h           |

| User Story 2 |                              | Aufwandschätzung |
|--------------|------------------------------|------------------|
| Task 1       | JTextPan erstellen           | 10 min           |
| Task 2       | In creatAndShowGui einbinden | 5  min           |
| Task 3       | In Jframe einbinden          | 5  min           |
|              |                         Summe| 0,33  h           |

| User Story 3 |                                                     | Aufwandschätzung |
|--------------|-----------------------------------------------------|------------------|
| Task 1       | In createAndShowGui erstellen von neuen JMenu Items | 10 min           |
| Task 2       | JMenuBar erstellen                                  | 5  min           |
| Task 3       | JMenuItems einbinden in JMenuBar                    | 5  min           |
| Task 4       | JMenuBar hinzufügen zu JFrame                       | 5  min           |
|              |                                                Summe| 0,42 h           |

| User Story 4 |                                                     | Aufwandschätzung |
|--------------|-----------------------------------------------------|------------------|
| Task 1       | addActionListener erstellen                         | 7 min            |
| Task 2       | Im ActionListener ActionPerfomred Methode erstellen | 5 min            |
|              |                                               Summe | 0,2 h            |
### Anreicherung der User Stories für die Umsetzung _US1_
### UML Package und Klassen und Sequenzdiagramm _US1_
### Dokumentation wichtiger Code Snippets _US1_


### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories _US1_

## Dokumentation Sprint 2 
### Taskliste für die Umsetzung der User Stories US2

| User Story 1 |                                                               | Aufwandschätzung |
|--------------|---------------------------------------------------------------|------------------|
| Task 1       | Variablendeklaration in der File Klasse                       | 5  min           |
| Task 2       | Im ActionListener ActionPerfomred Methode erstellen           | 5  min           |
| Task 3       | Action performed in SafeFileListerner erstellen               | 7  min           |
| Task 4       | DefaultStylDocument in ActionPerformed Methode erstellen      | 5  min           |
| Task 5       | StyleDocument getter erstellen                                | 5  min           |
| Task 6       | Trycatch mit fileoutputstream in ActionPerformed erstellen    | 5  min           |
| Task 7       | Erstellen neuer Methode chooseFile in Methode safeFilListener | 10 min           |
| Task 8       | Implementierung JFileChooser in Methode chooseFile            | 15 min           |
|              |                                                         Summe | 0,95 h           |

| User Story 2 |                                                           | Aufwandschätzung |
|--------------|-----------------------------------------------------------|------------------|
| Task 1       | Klasse openFileListener erstellen                         | 5  min           |
| Task 2       | Im ActionListener ActionPerfomred Methode erstellen       | 5  min           |
| Task 3       | Action performed in openFileListerner erstellen           | 7  min           |
| Task 4       | DefaultStylDocument in ActionPerformed Methode erstellen  | 5  min           |
| Task 6       | Trycatch mit fileinputstream in ActionPerformed erstellen | 5  min           |
| Task 7       | Erstellen neuer Methode chooseFile im openFileListener    | 10 min           |
| Task 8       | Implementierung JFileChooser in Methode chooseFile        | 15 min           |
|              |                                                     Summe | 0,86 h           |

| User Story 3 |                                              | Aufwandschätzung |
|--------------|----------------------------------------------|------------------|
| Task 1       | Deklaration String Name                      | 5  min           |
| Task 2       | setFrameTitle Methode erstellen              | 5  min           |
| Task 3       | setFrameStitle in createAndShowGui auffrufen | 5  min           |
| Task 5       | Title_Bar zu JFrame hinzufügen               | 5  min           |
|              |                                        Summe | 0,33 h           |
### Anreicherung der User Stories für die Umsetzung US2
### UML Package und Klassen und Sequenzdiagramm US2
### Dokumentation wichtiger Code Snippets US2
### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories US2

## Dokumentation Sprint 3 
### Taskliste für die Umsetzung der User Stories US3
| User Story 1 |                                                               | Aufwandschätzung |
|--------------|---------------------------------------------------------------|------------------|
| Task 1       | Erstellen newItem                                             | 5  min           |
| Task 2       | actionListener erstellen                                      | 5  min           |
| Task 3       |  In Classe newFileListener actiionPerformed Methode erstellen | 7  min           |
| Task 4       | Getter für NewStyleDocument erstllen                          | 5  min           |
|              |                                                         Summe | 0,36 h           |

| User Story 2 |                                                            | Aufwandschätzung |
|--------------|------------------------------------------------------------|------------------|
| Task 1       | Einstellen der readFile Methode in Classe openFileListener | 10 min           |
| Task 2       | In readFile erstellen eines Try catch                      | 5  min           |
|              |                                                      Summe | 0,25 h           |

| User Story 3 |                                   | Aufwandschätzung |
|--------------|-----------------------------------|------------------|
| Task 1       | setMnemonic in fileMenu erstellen | 10 min           |
|              |                             Summe | 0,3  h           |
### Anreicherung der User Stories für die Umsetzung US3
### UML Package und Klassen und Sequenzdiagramm US3
### Dokumentation wichtiger Code Snippets US3
### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories US3 





 

