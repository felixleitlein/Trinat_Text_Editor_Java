package trinat.bloch.editor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

public class Texteditor_Bloch_2$1 {
	private JFrame rahmen;
	private JTextPane editor;
	private File datei;

	private static final String TITLE_Bar = "Texteditor Bloch - ";

	public static void main(String[] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new Texteditor_Bloch_2$1().createAndShowGUI();
			}
		});
	}

	private void createAndShowGUI() {

		rahmen = new JFrame();
		setFrameTitleWithExtn("Neu");
		editor = new JTextPane();

		JScrollPane editorScrollPane = new JScrollPane(editor);
		editor.setDocument(getNewDocument());
		
		rahmen.add(editorScrollPane, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("Datei");
		
		JMenuItem newItem = new JMenuItem("Neu");
		newItem.addActionListener(new NewFileListener());
		fileMenu.add(newItem);
		
		JMenuItem openItem = new JMenuItem("Oeffnen");
		openItem.addActionListener(new OpenFileListener());

		JMenuItem saveItem = new JMenuItem("Speichern");
		saveItem.addActionListener(new SaveFileListener());

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

	private void setFrameTitleWithExtn(String titleExtn) {

		rahmen.setTitle(TITLE_Bar + titleExtn);
	}
	
	private StyledDocument getNewDocument() {

		StyledDocument doc = new DefaultStyledDocument();
		return doc;
	}
	
	private StyledDocument getEditorDocument() {

		StyledDocument doc = (DefaultStyledDocument) editor.getDocument();
		return doc;
	}
	
	private class NewFileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			
			editor.setDocument(getNewDocument());
			datei = null;
			setFrameTitleWithExtn("Neu");
		}

	}

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

	private class OpenFileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			datei = chooseFile();

			if (datei == null) {

				return;
			}

			readFile(datei);
			setFrameTitleWithExtn(datei.getName());
		}

		private File chooseFile() {

			JFileChooser chooser = new JFileChooser();

			if (chooser.showOpenDialog(rahmen) == JFileChooser.APPROVE_OPTION) {

				return chooser.getSelectedFile();
			} else {
				return null;
			}
		}

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
}
