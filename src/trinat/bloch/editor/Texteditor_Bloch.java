package trinat.bloch.editor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;


// Version 1$1
// mit JMenuItem NEU
public class Texteditor_Bloch {

	private JFrame rahmen;
	private JTextPane editor;
	private File datei;
	
	public static void main(String[] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new Texteditor_Bloch().createAndShowGUI();
			}
		});
	}

	private void createAndShowGUI() {

		rahmen = new JFrame();
		editor = new JTextPane();

		JScrollPane editorScrollPane = new JScrollPane(editor);

		rahmen.add(editorScrollPane, BorderLayout.CENTER);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("Datei");
		
		JMenuItem saveItem = new JMenuItem("Speichern");
		saveItem.addActionListener(new SaveFileListener());
		JMenuItem openItem = new JMenuItem("Oeffnen");

		JMenuItem newItem= new JMenuItem("Neu");

		JMenuItem exitItem = new JMenuItem("Exit");
		
		
		fileMenu.add(newItem);
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

			try (OutputStream fos = new FileOutputStream(datei);
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {

				oos.writeObject(doc);
			} catch (IOException ex) {

				throw new RuntimeException(ex);
			}

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
	
	private StyledDocument getEditorDocument() {

		StyledDocument doc = (DefaultStyledDocument) editor.getDocument();
		return doc;
	}
}
