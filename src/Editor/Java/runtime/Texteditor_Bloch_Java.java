runtime;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;

public class Texteditor_Bloch_0$2 {
	private JFrame rahmen;
	private JTextPane editor;
	

	public static void main(String[] args) throws Exception {

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {

				new Texteditor_Bloch_0$2().createAndShowGUI();
			}
		});
	}

	private void createAndShowGUI() {

		rahmen = new JFrame();
		editor = new JTextPane();
		
		JScrollPane editorScrollPane = new JScrollPane(editor);

		rahmen.add(editorScrollPane, BorderLayout.CENTER);
		
		rahmen.setSize(900, 600);
		rahmen.setLocation(80, 80);
		rahmen.setVisible(true);

		editor.requestFocusInWindow();

		
	}
}
