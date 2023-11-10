package gui;

import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class Manual extends JOptionPane {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public Manual() {
		String msg = "INTRODUCTION\n" + "USING THE CALCULATOR\n" + "eg: ( 1 + 2 ) * 3" +"\n"
				+ "Click on the corresponding button presses\n" 
				+ "and after click on the = symbol should\n"
				+ "provide an answer of 9\n"
				+ "\n"
				+ "To get the reverse polish notation (RPN) Postfix form\n"
				+ "Type the same expression using the buttons and click\n"
				+ "on RPN Expr to get the solution as\n"
				+ "1 2 + 3 *\n"
				+ "\n"
				+ "One can copy and paste any arithmetic expression\n"
				+ "in the textfield and get the required result, BUT\n"
				+ "each character should be separated by space";
			

		setFont(new Font("Serif", Font.PLAIN, 15));
		setBorder(BorderFactory.createLoweredBevelBorder());
		JOptionPane.showMessageDialog(Manual.this, msg);
	}
}
