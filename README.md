# trinat-bloch-texteditor

Das Projekt wurde durch EyHoCk, felixleitlein, G3r0m3, mzbinden und Flip87 erstellt.


## Inhaltsverzeichnis
- [Einleitung](#einleitung)
  * [Ziele](#ziele)
  * [Randbedingungen](#randbedingungen)
- [Build-Anleitung](#build-anleitung)
  * [Vorausgesetzungen](#vorausgesetzungen)
- [Kurze Bedienungsanleitung ](#kurze-bedienungsanleitung)
- [User Stories](#user-stories)
  * [Ausbaustufe 1](#ausbaustufe-1)
  * [Ausbaustufe 2](#ausbaustufe-2)
  * [Ausbaustufe 3](#ausbaustufe-3)
- [Release plan mit den Ausbaustufen](#release-plan-mit-den-ausbaustufen)
- [Dokumentation Sprint 1](#dokumentation-sprint-1)
  * [Taskliste für die Umsetzung der User Story](#taskliste-für-die-umsetzung-der-user-story)
  * [Anreicherung der User Stories für die Umsetzung](#anreicherung-der-user-stories-für-die-umsetzung)
  * [UML Package und Klassen und Sequenzdiagramm](#uml-package-und-klassen-und-sequenzdiagramm)
  * [Dokumentation wichtiger Code Snippets](#dokumentation-wichtiger-code-snippets)
  * [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories](#herleitung-der-testfälle-aus-den-azeptanzkriterien-der-user-stories)
- [Dokumentation Sprint 2](#dokumentation-sprint-2)
  * [Taskliste für die Umsetzung der User Story](#tasklistetfür-die-Umsetzun-der-User-Story)
  * [Anreicherung der User Stories für die Umsetzung](#anreicherung-der-user-stories-für-die-umsetzung)
  * [UML Package, Klassen und Sequenzdiagramm](#uml-package,-klassen-und-sequenzdiagramm)
  * [Dokumentation wichtiger Code Snippets](#dokumentation-wichtiger-code-snippets)
  * [Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories](#herleitung-der-testfälle-aus-den-azeptanzkriterien-der-user-stories)
## Einleitung

Hierbei handelt es sich um eine Gruppenarbeit welche im Rahmen der Kurse Programmieren II – JAVA und Software Engineering unseres Studiengangs Mechatronik Trinational, im dritten Semester anzufertigen war.

Zweck dieses Projekts ist es die erlernten Programmierkenntnisse und die Prinzipien des Software Engineering anzuwenden.

### Ziele
Es soll eine kleines Programm erstellt werden mit welchem eine einfache Textverarbeitung möglich ist. Die Verwendung des Programms soll auf dem Desktop eines MAC, Windows oder Linux Computer ausgeführt werden können. 
### Randbedingungen
 * Die Programmierung der Anwendung soll in JAVA erfolgen.
 * Die Klassen des Programms sollen über die entsprechenden Unit-Tests verfügen.
 * Das Projekt soll auf GitHub veröffentlich werden.
 * Die Buildautomatisierung soll mit MAVEN erfolgen.
 * Das Programm soll mittels einer dafür erstellten JAR-Datei und dem Befehl java-jar xxxxx.jar ausgeführt werden können.

 
## Build-Anleitung 
### Vorausgesetzungen
* Korrekte Installation von Eclipse.
* Richtig gesetztes Java Home Verzeichnis.
* Korrekte Installation von Maven.
* Korrekte Installation von Git.

Build Anleitung für alle Betriebssysteme
•	Datei von GitHub Trinat-Bloch-Texteditor-Master herunterladen.
•	Im gewünschten Ordner entpacken.
•	Den Pfad der gewünschten Versionsdatei (.jar) kopieren.
•	Die Eingabeaufforderung (Konsole) öffnen.
•	java -jar in die Eingabeaufforderung eingeben gefolgt von dem kopiertem Pfad der .jar Datei. Mit Enter bestätigen.

Beispiel:
java -jar C:\Users\Max Mustermann\trinat-bloch-texteditor-master\Ausbaustufe01.jar

Besonders für Windows Betriebssystem - Erstellen eines Desktop Icons zum Starten des Programms durch Doppelklick.
•	Den Pfad der gewünschten Versionsdatei (.jar) kopieren.
•	Auf dem Desktop mit Rechtsklick eine neue Verknüpfung erstellen.
•	Den Pfad zuvor kopierten Pfad dort eingeben.
•	Die Verknüpfung benennen mit OK bestätigen.
•	Die Eigenschaften der Verknüpfung aufrufen dort im Reiter "Verknüpfung" "Anderes Symbol..." auswählen dort Symbol auswählen und mit OK bestätigen
•	Im Reiter "Allgemein" die Option "öffnen mit" ändern auf "Java(TM) Plattform..." und mit ok bestätigen.



## Kurze Bedienungsanleitung 

## User Stories 
### Ausbaustufe 1
| User Story 1 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 2 	|  	|
| Der Benutzer möchte das sich beim starten des Programms ein Fenster öffnet 	|  	|  	| Nach dem Starten des Programms öffnet sich ein JFrame 	|

| User Story 2 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 5 	|  	|
| Der Benutzer möchte einen Text über die Tatstatur eingeben können 	|  	|  	| Beim Betätigen der Tastatur wird der eingegebene Text im Fenster angezeigt|

| User Story 3 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 3 	|  	|
| Der Benutzer möchte über einen Reiter, mit der Maus die Buttons für Schließen, Speichern, Laden angezeigt bekommen 	|  	|  Nach dem Klicken auf den entsprechenden Reiter werden die Buttons Schließen, Speichern und Laden angezeigt	| 	|


| User Story 4 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 3	|  	|
| Der Benutzer möchte das Programm durch klicken mit der Maus schließen können	|  	|  	| Nach dem Klicken auf den richtigen Butten wird das Programm geschloßen 	|



### Ausbaustufe 2

| User Story 1 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 8 	|  	|
| Der Benutzer möchte dass durch das Klicken auf den Button Speicher der eingegebene Text gespeichert wird	|  	|  	| Nach dem Klicken auf dem Speicher Button soll der eingegebene Text gespeichert werden 	|

| User Story 2 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 8	|  	|
| Der Benutzer möchte durch Klichen aud Laden eine zuvor gespeicherte Datei aufrufen können	|  	|  	| Beim Klicken auf den Lade Button soll eine zuvor gespeicherte Datei aufgerufen werden|

| User Story 3 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Niedrig	| 2	|  	|
| Der Benutzer möchte Das im Frame der Titel des Programms angezeigt wird	|  	|  	| Sobald das Hauptfenster des Programms geöffnet wird soll im oberen Rahmen der Titel des Programms angezeigt werden	|

### Ausbaustufe 3

| User Story 1 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 3 	|  	|
| Der Benutzer möchte dass durch das Klicken auf den Button 'Neu' eine neue Datei geöfnet wird	|  	|  	| Nach dem Klicken auf den 'Neu' Button öffnet sich ein Neues Textfeld. 	|

| User Story 2 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| HOCH 	| 8	|  	|
| Der Benutzer möchte durch Klichen aud Laden eine zuvor gespeicherte Datei aufrufen können	|  	|  	| Nach dem Klicken auf den 'Löschen' Button wird die ausgewählte Datei gelöscht|

| User Story 3 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Mittel	| 2	|  	|
| Der Benutzer möchte mittel Hotkeys das Menu öffnen können	|  	|  	| Durch betätigen eines Hotkeys wir das Menu geöfnet	|

| User Story 4 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Mittel	| 2	|  	|
| Der Benutzer möchte mittel Hotkeys die Befehle 'Öffnen', 'Speichern', 'Neu' und 'Löschen' ausführen können.	|  	|  	| Durch betätigen von Hotkeys können die Befehle 'Öffnen', 'Speichern', 'Neu' und 'Löschen' ausführen werden	|

| User Story 5 	| Priorisierung 	| Story Point 	| Aktzeptanzkriterium 	|
|----------------------------------------------------------------------------	|:-------------:	|------------:	|-------------------------------------------------------	|
|  	| Niedrig	| 2	|  	|
| Der Benutzer möchte mittels einer Desktopverknüpfung das Programm direkt öffen können	|  	|  	| Durch betätigen einer Desktopverknüpfung wir das Programm direkt aufgerufen	|

### Ausbaustufe 4


## Release plan mit den Ausbaustufen

## Dokumentation Sprint 1
### Taskliste für die Umsetzung der User Story
| User Story 1 |                             | Aufwandschätzung | 
|--------------|-----------------------------|------------------|
| Task 1       | Erstellen einer Classe      | 5 min            |
| Task 2       | Erstellen New Jframe        | 5 min            |
| Task 3       | Erstellen Main Methode      | 5 min            |
| Task 4       | Create and show GUI mehtode | 10 min           |
|              |                        Summe| 0,31 St          |

| User Story 2 |                              | Aufwandschätzung |
|--------------|------------------------------|------------------|
| Task 1       | JTextPan erstellen           | 10 min           |
| Task 2       | In creatAndShowGui einbinden | 5 min            |
| Task 3       | In Jframe einbinden          | 5 min            |
|              |                         Summe| 0,3 st           |

| User Story 3 |                                                     | Aufwandschätzung |
|--------------|-----------------------------------------------------|------------------|
| Task 1       | In createAndShowGui erstellen von neuen JMenu Items | 10 min           |
| Task 2       | JMenuBar erstellen                                  | 5 min            |
| Task 3       | JMenuItems einbinden in JMenuBar                    | 5 min            |
| Task 4       | JMenuBar hinzufügen zu JFrame                       | 5 min            |
|              |                                                Summe| 0,3 st           |

| User Story 4 |                                                     | Aufwandschätzung |
|--------------|-----------------------------------------------------|------------------|
| Task 1       | addActionListener erstellen                         | 7 min            |
| Task 2       | Im ActionListener ActionPerfomred Methode erstellen | 5 min            |
|              |                                               Summe | 0,3 st           |
### Anreicherung der User Stories für die Umsetzung
### UML Package und Klassen und Sequenzdiagramm
### Dokumentation wichtiger Code Snippets
#### Main Klasse :-)
##### Bibliotheken Imports
```
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
```
#### Erstellen des Textfields, Action und ButtonListener
```
public class Sprint {

	JTextField textField;
	JTextArea textArea;
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
	IllegalAccessException, UnsupportedLookAndFeelException {
		// TODO Auto-generated method stub

		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		new Sprint().creatFrame();
	}



	private class OpenActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Oeffnen wurde ausgewählt.");

		}
	};

	private class ExitActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Beenden wurde ausgewählt.");
			System.exit(0);
		}
	};

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Button wurde betaetigt.");
		}

	}
```

### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories

## Dokumentation Sprint 2 
### Taskliste für die Umsetzung der User Story

| User Story 1 |                                                               | Aufwandschätzung |
|--------------|---------------------------------------------------------------|------------------|
| Task 1       | Variablen deklaration in der File Classe                      | 5 min            |
| Task 2       | Im ActionListener ActionPerfomred Methode erstellen           | 5 min            |
| Task 3       | Action performed in SafeFileListerner erstellen               | 7 min            |
| Task 4       | DefaultStylDocument in ActionPerformed Methode erstellen      | 5 min            |
| Task 5       | StyleDocument getter erstellen                                | 5 min            |
| Task 6       | Trycatch mit fileoutputstream in ActionPerformed erstellen    | 5 min            |
| Task 7       | Erstellen neuer Methode chooseFile in Methode safeFilListener | 10 min           |
| Task 8       | Implementierung JFileChooser in Methode chooseFile            | 15 min           |
|              |                                                         Summe | 0,3 st           |

| User Story 2 |                                                           | Aufwandschätzung |
|--------------|-----------------------------------------------------------|------------------|
| Task 1       | Classe openFileListener erstllen                          | 5 min            |
| Task 2       | Im ActionListener ActionPerfomred Methode erstellen       | 5 min            |
| Task 3       | Action performed in openFileListerner erstellen           | 7 min            |
| Task 4       | DefaultStylDocument in ActionPerformed Methode erstellen  | 5 min            |
| Task 6       | Trycatch mit fileinputstream in ActionPerformed erstellen | 5 min            |
| Task 7       | Erstellen neuer Methode chooseFile im openFileListener    | 10 min           |
| Task 8       | Implementierung JFileChooser in Methode chooseFile        | 15 min           |
|              |                                                     Summe | 0,3 st           |

| User Story 3 |                                              | Aufwandschätzung |
|--------------|----------------------------------------------|------------------|
| Task 1       | Deklaration String Name                      | 5 min            |
| Task 2       | setFrameTitle Methode erstellen              | 5 min            |
| Task 3       | setFrameStitle in createAndShowGui auffrufen | 5 min            |
| Task 5       | Title_Bar zu JFrame hinzufügen               | 5 min            |
|              |                                        Summe | 0,3 st           |
### Anreicherung der User Stories für die Umsetzung
### UML PackageKlassen- und Sequenzdiagramm
### Dokumentation wichtiger Code Snippets
### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories

## Dokumentation Sprint 3 
### Taskliste für die Umsetzung der User Story
| User Story 1 |                                                               | Aufwandschätzung |
|--------------|---------------------------------------------------------------|------------------|
| Task 1       | Erstellen newItem                                             | 5 min            |
| Task 2       | actionListener erstellen                                      | 5 min            |
| Task 3       |  In Classe newFileListener actiionPerformed Methode erstellen | 7 min            |
| Task 4       | Getter für NewStyleDocument erstllen                          | 5 min            |
|              |                                                         Summe | 0,3 st           |

| User Story 2 |                                                            | Aufwandschätzung |
|--------------|------------------------------------------------------------|------------------|
| Task 1       | Einstellen der readFile Methode in Classe openFileListener | 10 min           |
| Task 2       | In readFile erstellen eines Try catch                      | 5 min            |
|              |                                                      Summe | 0,3 st           |

| User Story 3 |                                   | Aufwandschätzung |
|--------------|-----------------------------------|------------------|
| Task 1       | setMnemonic in fileMenu erstellen | 10 min           |
|              |                             Summe | 0,3 st           |
### Anreicherung der User Stories für die Umsetzung
### UML Package, Klassen- und Sequenzdiagramm
### Dokumentation wichtiger Code Snippets
### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories

## Optional: Dokumentation Sprint 4
### Taskliste für die Umsetzung der User Story
### Anreicherung der User Stories für die Umsetzung
### UML Package, Klassen- und Sequenzdiagramm
### Dokumentation wichtiger Code Snippets
### Herleitung der Testfälle aus den Akzeptanzkriterien der User Stories



 

