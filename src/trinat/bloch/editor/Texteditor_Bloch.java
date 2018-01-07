package trinat.bloch.editor;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
// Version 0$4
public class Texteditor_Bloch {

	private JFrame rahmen;
	private JTextPane editor;

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
}
