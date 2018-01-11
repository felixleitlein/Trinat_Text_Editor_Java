# trinat-bloch-texteditor

Das Projekt wurde durch EyHoCk, felixleitlein, G3r0m3, mzbinden und Flip87 erstellt.

___
## Inhaltsverzeichnis
- [Einleitung](#einleitung)
	* [Ziele](#ziele)
	* [Randbedingungen](#randbedingungen)
- [Build-Anleitung](#build-anleitung)
	* [Vorausetzungen](#vorausetzungen)
	* [Build](#build)
	  + [Build Anleitung für alle Betriebssysteme](#build-anleitung-für-alle-betriebssysteme)
	  + [Erstellen eines Desktop Icon zum Starten des Programms](#erstellen-eines-desktop-icon-zum-starten-des-programms)
- [Kurze Bedienungsanleitung ](#kurze-bedienungsanleitung)
	* [Texteditor starten](#texteditor-starten)
	* [Texteditor schließen](#texteditor-schließen)
	* [Textdatei speichern](#textdatei-speichern)
	* [Textdatei öffnen](#textdatei-öffnen)
	* [Textdatei löschen](#textdatei-löschen)
	* [Hot-Keys](#hot-keys)
- [User Stories](#user-stories)
	* [Ausbaustufe 1](#ausbaustufe-1)
	* [Ausbaustufe 2](#ausbaustufe-2)
	* [Ausbaustufe 3](#ausbaustufe-3)
- [Releaseplan mit den Ausbaustufen](#releaseplan-mit-den-ausbaustufen)
- [Dokumentation Sprint 1](#dokumentation-sprint-1)
  	* [Taskliste für die Umsetzung der User Stories _US1_](#taskliste-für-die-umsetzung-der-user-stories-us1)
  	* [Dokumentation wichtiger Code Snippets _US1_](#dokumentation-wichtiger-code-snippets-us1)
- [Dokumentation Sprint 2](#dokumentation-sprint-2)
  	* [Taskliste für die Umsetzung der User Stories _US2_](#taskliste-für-die-umsetzung-der-user-stories-us2)
  	* [Dokumentation wichtiger Code Snippets _US2_](#dokumentation-wichtiger-code-snippets-us2)
- [Dokumentation Sprint 3](#dokumentation-sprint-3)
  	* [Taskliste für die Umsetzung der User Stories _US3_](#taskliste-für-die-umsetzung-der-user-stories-us3)
  	* [Dokumentation wichtiger Code Snippets _US3_](#dokumentation-wichtiger-code-snippets-us3)
- [UML Diagramm](#uml-diagramm)	
___
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

___
## Build-Anleitung 

### Vorausetzungen
* Korrekte Installation von Eclipse.
* Richtig gesetztes Java Home Verzeichnis.
* Korrekte Installation von Maven.
* Korrekte Installation von Git.

### Build

#### Build Anleitung für alle Betriebssysteme
* Datei von GitHub Trinat-Bloch-Texteditor-Master herunterladen.
* Im gewünschten Ordner entpacken.
* Den Pfad der gewünschten Versionsdatei (.jar) kopieren.
* Die Eingabeaufforderung (Konsole) öffnen.
* java -jar in die Eingabeaufforderung eingeben, gefolgt von dem kopierten Pfad der .jar Datei. Mit Enter bestätigen.

##### Beispiel _Eingabeaufforderung_:
```
java -jar C:\Users\Max Mustermann\trinat-bloch-texteditor-master\Ausbaustufe01.jar
```
#### Erstellen eines Desktop Icon zum Starten des Programms 
* Den Pfad der gewünschten Versionsdatei (.jar) kopieren.
* Auf dem Desktop mit Rechtsklick eine neue Verknüpfung erstellen.
* Den Pfad zuvor kopierten Pfad dort eingeben.
* Die Verknüpfung benennen und mit OK bestätigen.
* Die Eigenschaften der Verknüpfung aufrufen, dort im Reiter "Verknüpfung" "Anderes Symbol..." auswählen dort Symbol auswählen und mit OK bestätigen.
* Im Reiter "Allgemein" die Option "öffnen mit" ändern auf "Java(TM) Plattform..." und mit OK bestätigen.


___
## Kurze Bedienungsanleitung 
### Texteditor Starten
* Siehe Buildanleitung.
#### oder
Aus diesem GitHub Repository Die JarDatei mit _-jar-with-dependencies_ downloaden und durch einen Doppelklick ausführen.
### Texteditor schließen
![alt text](https://github.com/felixleitlein/Trinat_Text_Editor_Java/blob/master/attachment/images/exit.jpeg "Texteditor schließen")


### Textdatei speichern
![alt text](https://github.com/felixleitlein/Trinat_Text_Editor_Java/blob/master/attachment/images/speichern.jpeg "Textdatei speichern")


### Textdatei öffnen
![alt text](https://github.com/felixleitlein/Trinat_Text_Editor_Java/blob/master/attachment/images/oeffnen.jpeg "Textdatei öffnen")


### Textdatei löschen
_Date_ -> _Öffnen_ -> gewünschte Datei mit Mausklick auswählen und mit Taste _Entf_ löschen.

### Hot-Keys
#### Menu _Datei_ öffnen
```
ALT + D
```
#### Eine neue Datei öffnen
```
ALT + N
```
#### Auswahl der gespeicherten Dateien
```
ALT + O
```
#### Speichern der geöffneten Datei
```
ALT + S
```
#### Texteditor beenden
```
ALT + X
```


___
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

___
## Releaseplan mit den Ausbaustufen

### Dokumentation Sprint 1
#### Taskliste für die Umsetzung der User Stories _US1_
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


#### Dokumentation wichtiger Code Snippets _US1_
##### Erzeugt main Methode für Einstieg in Programmablauf. Wirft eine Ausnahme für die folgenden Zeilen. Mithilfe der Klasse SwingUtilities und deren Methode invokeLater wird darauffolgend in einem Lambda Event mit neuer Runnable die möglichkeit gegeben eine Methode run zu bedienen. In dieser wird eine Neue Instanz der Hauptklasse erzeugt mit der Methode createAndShowGUI.
```javascript
public static void main(String[] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new TexteditorBloch().createAndShowGUI();
			}
		});
	}

```
##### Methode createAndShowGUI für alle Komponenten die im Texteditor angezeigt und Instanziiert werden sollen. JScrollPane ist die Klasse die für das beschreibbare Fenster verantwortlich ist. Durch Hinzufügen der Elemente zum JFrame werden diese angezeigt an der gewünschten Stelle. 
```javascript
private void createAndShowGUI() {

		rahmen = new JFrame();
		editor = new JTextPane();
		
		JScrollPane editorScrollPane = new JScrollPane(editor);

		rahmen.add(editorScrollPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("Datei");
		
		
		
		JMenuItem openItem = new JMenuItem("Oeffnen");
		
		JMenuItem saveItem = new JMenuItem("Speichern");
		
		JMenuItem exitItem = new JMenuItem("Exit");
		
		
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		
		rahmen.setJMenuBar(menuBar);
		rahmen.setSize(900, 600);
		rahmen.setLocation(80, 80);
		rahmen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rahmen.setVisible(true);

		editor.requestFocusInWindow();

	}


```

___
### Dokumentation Sprint 2 
#### Taskliste für die Umsetzung der User Stories _US2_

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


#### Dokumentation wichtiger Code Snippets _US2_
##### Klasse SaveFileListener mit Action Listener enthält die Methoden  actionPerformed und chooseFIle. In actionPerformed wird zuerst eine kontrollschleife ausgeführt ob ein datei (File) geladen ist. Darauffolgend wird versucht dieses als DefaultStyledDocument in einer Try-Catch Schleife durch einen FileOutputStream abzuspeichern. 

```javascript
private class SaveFileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (datei == null) {

				datei = chooseFile();

				if (datei == null) {

					return;
				}
			}

			DefaultStyledDocument doc = (DefaultStyledDocument) getEditorDocument();

			try (OutputStream fos = new FileOutputStream(datei); ObjectOutputStream oos = new ObjectOutputStream(fos)) {

				oos.writeObject(doc);
			} catch (IOException ex) {

				throw new RuntimeException(ex);
			}

			setFrameTitleWithExtn(datei.getName());
		}

		private File chooseFile() {

			JFileChooser chooser = new JFileChooser();

			if (chooser.showSaveDialog(rahmen) == JFileChooser.APPROVE_OPTION) {

				return chooser.getSelectedFile();
			} else {
				return null;
			}
		}
	}

```
##### Klasse OpenFileListener hat ähnlichkeiten zu SaveFileListener mit dem Unterschied dieses Mal in Methode readFile mit der Mitgegeben Datei aus chooseFile einen InputStream in eine Try-Catch Schleife mit zusätzlicher Catch-Bedingungzu erzeugen.

```javascript
private class OpenFileListener implements ActionListener {

public void actionPerformed(ActionEvent e)
{…………}

private File chooseFile()
{…………}

private void readFile(File file) {

			StyledDocument doc = null;

			try (InputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {

				doc = (DefaultStyledDocument) ois.readObject();
			} catch (FileNotFoundException ex) {

				JOptionPane.showMessageDialog(rahmen, "Input file was not found!");
				return;
			} catch (ClassNotFoundException | IOException ex) {

				throw new RuntimeException(ex);
			}

			editor.setDocument(doc);
			
		}

	}

```
___
### Dokumentation Sprint 3 
#### Taskliste für die Umsetzung der User Stories _US3_
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


#### Dokumentation wichtiger Code Snippets _US3_
##### Neue Klasse für die Erstellung einer neuen Datei. Somit wird die alte Überschrieben und auch der Titel der Titel Bar aktualisiert.
```javascript
private class NewFileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			editor.setDocument(getNewDocument());
			datei = null;
			setFrameTitleWithExtn("Neu");
		}

	}

```

##### Durch Aufruf dieser Methode in Klasse OpenFileListener und SaveFileListener wird einem die Möglichkeit gegeben Dateien zu löschen durch drücken der delete taste. 

```javascript
private void registerDelAction() {
		
		// Create AbstractAction
		// It is an implementation of javax.swing.Action
		AbstractAction a = new AbstractAction() {

			private static final long serialVersionUID = 1L;

			// Write the handler
			public void actionPerformed(ActionEvent ae) {
				chooser = (JFileChooser) ae.getSource();
				try {

					// If some file is selected
					if (chooser.getSelectedFiles() != null) {
						// If user confirms to delete
						if (askConfirm() == JOptionPane.YES_OPTION) {

							// Call Files.delete(), if any problem occurs
							// the exception can be printed, it can be
							// analysed
							for (File f : chooser.getSelectedFiles())
								java.nio.file.Files.delete(f.toPath());

							// Rescan the directory after deletion
							chooser.rescanCurrentDirectory();
						}
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		};

		// Get action map and map, "delAction" with a
		chooser.getActionMap().put("delAction", a);

		// Get input map when jf is in focused window and put a keystroke DELETE
		// associate the key stroke (DELETE) (here) with "delAction"
		chooser.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("DELETE"), "delAction");
	}
	public int askConfirm() {
		// Ask the user whether he/she wants to confirm deleting
		// Return the option chosen by the user either YES/NO
		
		return JOptionPane.showConfirmDialog(chooser, "Möchten Sie diese Datei(en) löschen? ");
	}

```
___
## UML Diagramm

 
![alt text](https://github.com/felixleitlein/Trinat_Text_Editor_Java/blob/master/attachment/images/UML1.jpeg "UML Diagramm")


 

