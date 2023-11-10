package gui;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Historytxtfd extends JPanel {

	public JTextArea historyarea;

	private Font font;

	public Historytxtfd() {

		historyarea = new JTextArea(5, 55);

		font = new Font("Courier", Font.BOLD, 15);

		historyarea.setFont(font);

		historyarea.setEditable(false);

		add(new JScrollPane(historyarea));

		setVisible(true);
	}

	public void appendText(String text) {
		historyarea.append(text + "\n");
	}
	
	public void clearText() {
		historyarea.setText("");
	}

}
