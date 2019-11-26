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
		String msg = "INTRODUCTION\n" + "USING THE QUADRATIC FUNCTION\n" + "eg: Type 2x^2 + 7x + 3\n"
				+ "eg: Type x^2 + 5x + 6\n" + "eg: Type x^2 + x - 6\n" + "eg: Type 2x^2 - 3x + 1\n"
				+ "eg: Type 3x^2 - 2x - 5\n" + "on the screen by pressing the buttons.\n"
				+ "After the above equation is shown on screen\n" + "Click on  (Quadratic Equation) menu,\n"
				+ " From the answers that appear select\n"
				+ " solve quadratic equation\n And to View graph\n"
				+ "Click on show quadratic graph.\n"
				+ "To use any any other function such as sin, cos and tan\n"
				+ "It should be in the following format\n"
				+ "eg: sin(5) or log(10) or tan(5) or Γ(7) to get answer\n"
				+ "SYSTEMS OF EQUATIONS WILL BE READY ANY TIME SOON :)\n";

		setFont(new Font("Serif", Font.PLAIN, 15));
		setBorder(BorderFactory.createLoweredBevelBorder());
		JOptionPane.showMessageDialog(Manual.this, msg);
	}
}
