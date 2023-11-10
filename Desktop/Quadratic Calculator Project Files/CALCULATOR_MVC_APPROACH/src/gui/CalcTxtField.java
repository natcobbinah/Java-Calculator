/*Author: Nathaniel Cobbinah
 *Email:  baby.hugo74@yahoo.com
 *Email:  fmg3ckali@gmail.com
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import stack_ADT.LinkedStack;
import stack_Expression_Infix_Postfix.Eval_Postfix;
import stack_Expression_Infix_Postfix.Infix_toPostfix;

public class CalcTxtField extends JPanel {

	private static final long serialVersionUID = 1L;

	private HistoryPanelListener historylistener;

	/**
	 * Used to separate textField text, so as to pass the expression separated by
	 * whitespaces, to the Eval_Postfix fxn to perform the required computations
	 */
	private static String SPACE = " ";

	public JTextField displaytxtfd;
	private Font font;

	private double ToThirteenDecimalPlace;

	// ----method for rounding values to thirteen decimal places
	public double getToThirteenteenDecimalPlace() {
		return ToThirteenDecimalPlace;
	}

	public double setToThirteenDecimalPlace(double toThirteenDecimalPlace) {
		ToThirteenDecimalPlace = toThirteenDecimalPlace;
		DecimalFormat df = new DecimalFormat("#.#############");
		df.setRoundingMode(RoundingMode.CEILING);

		String roundedvalue = df.format(toThirteenDecimalPlace);

		return Double.parseDouble(roundedvalue);
	}
	// ----method for rounding values to thirteen decimal places

	public CalcTxtField() {

		calctxtfieldlayoutdesign();
	}

	private void calctxtfieldlayoutdesign() {
		setLayout(new BorderLayout());

		Border innerborder = BorderFactory.createRaisedSoftBevelBorder();
		Border outerborder = BorderFactory.createEmptyBorder();
		setBorder(BorderFactory.createCompoundBorder(innerborder, outerborder));

		font = new Font("Courier", Font.BOLD, 40);

		displaytxtfd = new JTextField(26);
		displaytxtfd.setBackground(Color.WHITE);

		displaytxtfd.setFont(font);
		//displaytxtfd.setEditable(false);
		displaytxtfd.setHorizontalAlignment(JTextField.RIGHT);

		add(displaytxtfd, BorderLayout.CENTER);
		setVisible(true);
	}

	public void computeSolutions() {
		double evaluatedResult = Eval_Postfix.evalPostfix(Infix_toPostfix.toPostfix(displaytxtfd.getText()));

		if (historylistener != null) {
			historylistener.textEmitted(displaytxtfd.getText() + " = " + String.valueOf(evaluatedResult) + "\n");
		}

		// placed below the historyText area bcos otherwise, we wouldn't get the
		// expression, but only the answer in the history textarea
		displaytxtfd.setText(String.valueOf(evaluatedResult));
	}

	public void quadraticEqnsolver() {
		// not provided in this version, perhaps, will be included in newer versions
	}

	public void resetListandResult() {

	}

	public void clearTextField() {
		displaytxtfd.setText("");
	}

	public void appendText(String text, JButton btn) {
		String btnText = displaytxtfd.getText() + this.SPACE + btn.getText() + this.SPACE;
		displaytxtfd.setText(btnText + this.SPACE);
	}

	public void clearTextBack() {
		displaytxtfd.setText(displaytxtfd.getText().substring(0, displaytxtfd.getText().length() - 1));
	}

	public void sethistoryPanellistener(HistoryPanelListener historyPanelListener) {
		this.historylistener = historyPanelListener;
	}

	public void compute_ReversePolishNotation() {

		String evaluated_RPN = Infix_toPostfix.toPostfix(displaytxtfd.getText());

		if (historylistener != null) {
			historylistener.textEmitted(displaytxtfd.getText() + " = " + evaluated_RPN + "\n");
		}

		// placed below the historyText area bcos otherwise, we wouldn't get the
		// expression, but only the answer in the history textarea
		displaytxtfd.setText(evaluated_RPN);
	}

}