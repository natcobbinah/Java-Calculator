package gui;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SolverEqntxtfd extends JPanel {

	public JTextArea solverArea;

	private Font font;

	public SolverEqntxtfd() {
		solverArea = new JTextArea(10, 70);

		font = new Font("Courier", Font.BOLD, 15);

		solverArea.setFont(font);

		solverArea.setEditable(true);

		add(new JScrollPane(solverArea));

		setVisible(true);
	}
}
