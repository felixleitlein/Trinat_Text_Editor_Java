package bloch;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

public class TexteditorBloch {
	private JFrame rahmen;
	private JTextPane editor;
	File datei;

	private JFileChooser chooser = new JFileChooser();

	private static final String TITLE_Bar = "Texteditor Bloch - ";

	public static void main(String[] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new TexteditorBloch().createAndShowGUI();
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
		fileMenu.setMnemonic(KeyEvent.VK_D);

		JMenuItem newItem = new JMenuItem("Neu");
		newItem.addActionListener(new NewFileListener());
		newItem.setMnemonic(KeyEvent.VK_N);

		JMenuItem openItem = new JMenuItem("Oeffnen");
		openItem.addActionListener(new OpenFileListener());
		openItem.setMnemonic(KeyEvent.VK_O);

		JMenuItem saveItem = new JMenuItem("Speichern");
		saveItem.addActionListener(new SaveFileListener());
		saveItem.setMnemonic(KeyEvent.VK_S);

		JMenuItem exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic(KeyEvent.VK_X);
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

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

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
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

			chooser.setMultiSelectionEnabled(true);
			registerDelAction();

			if (chooser.showSaveDialog(rahmen) == JFileChooser.APPROVE_OPTION) {

				return chooser.getSelectedFile();
			} else {
				return null;
			}
		}
	}


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

			chooser.setMultiSelectionEnabled(true);
			registerDelAction();

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