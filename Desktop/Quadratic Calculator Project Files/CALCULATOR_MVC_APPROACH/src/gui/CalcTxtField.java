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

public class CalcTxtField extends JPanel {

	private static final long serialVersionUID = 1L;

	private HistoryPanelListener historylistener;

	String operator;

	double result = 0;
	double result2 = 0;
	double quadresult3 = 0.0;
	double quadresult2 = 0.0;
	double quadresult = 0.0;

	ArrayList<String> list1 = new ArrayList<String>();
	ArrayList<String> list2 = new ArrayList<String>();
	ArrayList<String> list3 = new ArrayList<String>();

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

		Double rndvaluenumber = Double.parseDouble(roundedvalue);
		return rndvaluenumber;
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
		displaytxtfd.setEditable(false);
		displaytxtfd.setHorizontalAlignment(JTextField.RIGHT);

		add(displaytxtfd, BorderLayout.CENTER);
		setVisible(true);
	}

	public void computeSolutions() {
		char minus = '-';
		char multiplication = 'x';
		char division = '/';
		char plus = '+';
		char squareroot = '√';
		char exponent = '^';
		char factorial = '!';
		char dot = '.';
		char gamma = 'Γ';
		char combination = 'C';
		char permutation = 'P';
		String sine = "sin";
		String cos = "cos";
		String tan = "tan";
		String log = "log";
		String ln = "ln";
		String ph = "ph";

		operator = displaytxtfd.getText();
		int plussign = operator.indexOf(plus);
		int minussign = operator.indexOf(minus);
		int multsign = operator.indexOf(multiplication);
		int divsign = operator.indexOf(division);
		int squarertsign = operator.indexOf(squareroot);
		int exponentsign = operator.indexOf(exponent);
		int dotsign = operator.indexOf(dot);
		int factorialsign = operator.indexOf(factorial);
		int sinesign = operator.indexOf(sine);
		int cossign = operator.indexOf(cos);
		int tansign = operator.indexOf(tan);
		int logsign = operator.indexOf(log);
		int lnsign = operator.indexOf(ln);
		int phsign = operator.indexOf(ph);
		int gammasign = operator.indexOf(gamma);
		int combinationsign = operator.indexOf(combination);
		int permutationsign = operator.indexOf(permutation);

		// ===============LOGICS IMPLEMENTATION===============
		// If the symbol scan within the txtfield is a plus symbol then do the ff:
		// Scan the txtfd from index 0, to where we meet the plus symbol
		// Store the values obtained in a list
		if (plussign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, plussign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, plussign));
			}
		}

		if (minussign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, minussign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, minussign));
			}
		}

		if (multsign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, multsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, multsign));
			}
		}

		if (divsign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, divsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, divsign));
			}
		}

		if (exponentsign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, exponentsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, exponentsign));
			}
		}

		if (factorialsign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, factorialsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, factorialsign));
			}
		}

		if (combinationsign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, combinationsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, combinationsign));
			}
		}

		if (permutationsign != -1) {
			if (dotsign != -1) {
				list1.add(displaytxtfd.getText().substring(0, permutationsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, permutationsign));
			}
		}

		// Store the values obtained in a variable result
		for (int i = 0; i < list1.size(); i++) {
			result = result * 10 + Double.parseDouble((String) list1.get(i));
		}
		// ------------------------------------------------------------------------------------------------------------------

		// Now scan the values after the plus symbol and store it a second list value
		// list2
		if (plussign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((plussign + 1), displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring((plussign + 1), displaytxtfd.getText().length()));
			}
		}

		if (minussign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((minussign + 1), displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring((minussign + 1), displaytxtfd.getText().length()));
			}
		}

		if (multsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((multsign + 1), displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring((multsign + 1), displaytxtfd.getText().length()));
			}
		}

		if (divsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((divsign + 1), displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring((divsign + 1), displaytxtfd.getText().length()));
			}
		}

		if (exponentsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((exponentsign + 1), displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring((exponentsign + 1), displaytxtfd.getText().length()));
			}
		}

		if (combinationsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring(combinationsign + 1, displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring(combinationsign + 1, displaytxtfd.getText().length()));
			}

		}

		if (permutationsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring(permutationsign + 1, displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring(permutationsign + 1, displaytxtfd.getText().length()));
			}
		}

		if (squarertsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((squarertsign + 1), displaytxtfd.getText().length()));
			} else {
				list2.add(displaytxtfd.getText().substring((squarertsign + 1), displaytxtfd.getText().length()));
			}
		}

		if (sinesign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((sinesign + 4), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((sinesign + 4), displaytxtfd.getText().length() - 1));
			}
		}

		if (cossign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((cossign + 4), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((cossign + 4), displaytxtfd.getText().length() - 1));
			}

		}

		if (tansign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((tansign + 4), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((tansign + 4), displaytxtfd.getText().length() - 1));
			}

		}

		if (logsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((logsign + 4), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((logsign + 4), displaytxtfd.getText().length() - 1));
			}
		}

		if (lnsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((lnsign + 3), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((lnsign + 3), displaytxtfd.getText().length() - 1));
			}
		}

		if (phsign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((phsign + 3), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((phsign + 3), displaytxtfd.getText().length() - 1));
			}
		}

		if (gammasign != -1) {
			if (dotsign != -1) {
				list2.add(displaytxtfd.getText().substring((gammasign + 2), displaytxtfd.getText().length() - 1));
			} else {
				list2.add(displaytxtfd.getText().substring((gammasign + 2), displaytxtfd.getText().length() - 1));
			}
		}

		// Store the values obtained in a variable result2
		for (int i = 0; i < list2.size(); i++) {
			result2 = result2 * 10 + Double.parseDouble((String) list2.get(i));
			System.out.println(result2);
		}

		// ------------------------------------------------------------------------------------------------------------------

		// Now what we do is add the values of list1 and list2 if the plus sign is the
		// symbol btwn them
		if (plussign != -1) {
			double ans = result + result2;
			String ansstring = Double.toString(ans);

			String resultstring = Double.toString(result);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(resultstring + " + " + resultstring2 + " = " + ansstring + "\n");
			}

			displaytxtfd.setText(ansstring);

			resetListandResult();
		}

		if (minussign != -1) {
			double ans2 = result - result2;
			String ansstring2 = Double.toString(ans2);

			String resultstring = Double.toString(result);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(resultstring + " - " + resultstring2 + " = " + ansstring2 + "\n");
			}
			displaytxtfd.setText(ansstring2);

			resetListandResult();
		}

		if (multsign != -1) {
			double ans3 = result * result2;
			String ansstring3 = Double.toString(ans3);

			String resultstring = Double.toString(result);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(
						resultstring + " * " + resultstring2 + " = " + setToThirteenDecimalPlace(ans3) + "\n");
			}

			String roundoffans = Double.toString(setToThirteenDecimalPlace(ans3));

			displaytxtfd.setText(roundoffans);

			resetListandResult();
		}

		if (divsign != -1) {
			double ans4 = result / result2;

			if (result2 == 0) {
				displaytxtfd.setText("ERROR:Division by Zero!");
			}

			else {
				String ansstring4 = Double.toString(ans4);

				String resultstring = Double.toString(result);

				String resultstring2 = Double.toString(result2);

				if (historylistener != null) {
					historylistener.textEmitted(resultstring + " / " + resultstring2 + " = " + ansstring4 + "\n");
				}
				displaytxtfd.setText(ansstring4);

				resetListandResult();
			}
		}

		if (exponentsign != -1) {
			double ans7 = Math.pow(result, result2);
			String ansstring7 = Double.toString(ans7);

			String resultstring = Double.toString(result);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(resultstring + " ^ " + resultstring2 + " = " + ansstring7 + "\n");
			}

			displaytxtfd.setText(ansstring7);

			resetListandResult();
		}

		if (factorialsign != -1) {
			double factorialans = FactorialMethod.setFactorial(result);

			String factorialansstring = Double.toString(factorialans);

			String resultstring2 = Double.toString(result);

			if (historylistener != null) {
				historylistener.textEmitted("Factorial  (" + resultstring2 + ")" + " = " + factorialansstring + "\n");
			}

			displaytxtfd.setText(factorialansstring);

			resetListandResult();
		}

		if (squarertsign != -1) {
			double ans6 = Math.sqrt(result2);

			String ansstring6 = Double.toString(ans6);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted("Square root (" + resultstring2 + ")" + " = " + ans6 + "\n");
			}

			displaytxtfd.setText(ansstring6);

			resetListandResult();
		}

		// -------------------------------------------------------------------------------------------------------------------
		if (sinesign != -1) {
			double ans8 = Math.toRadians(result2);

			double ans8converted = Math.sin(ans8);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(
						"Sin (" + resultstring2 + ")" + " = " + setToThirteenDecimalPlace(ans8converted) + "\n");
			}

			double roundoffans = setToThirteenDecimalPlace(ans8converted);
			String roundoffansvalue = Double.toString(roundoffans);

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

		if (cossign != -1) {
			double ans9 = Math.toRadians(result2);

			double ans9converted = Math.cos(ans9);

			double roundoffans = setToThirteenDecimalPlace(ans9converted);
			String roundoffansvalue = Double.toString(roundoffans);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted("Cos (" + resultstring2 + ")" + " = " + ans9converted + "\n");
			}

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

		if (tansign != -1) {
			double ans10 = Math.toRadians(result2);

			double ans10converted = Math.tan(ans10);

			double roundoffans = setToThirteenDecimalPlace(ans10converted);
			String roundoffansvalue = Double.toString(roundoffans);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted("tan (" + resultstring2 + ")" + " = " + ans10converted + "\n");
			}

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

		// -------------------------------------------------------------------------------------------------------------------
		if (logsign != -1) {
			double ans11 = setToThirteenDecimalPlace(Math.log10(result2));

			double roundoffans = setToThirteenDecimalPlace(ans11);
			String roundoffansvalue = Double.toString(roundoffans);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted("log (" + resultstring2 + ")" + " = " + ans11 + "\n");
			}

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

		if (combinationsign != -1) {
			double combinationanswer = FactorialMethod.setCombination(result, result2);

			String combinationansstring = Double.toString(combinationanswer);

			String resultstring = Double.toString(result);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(resultstring + " C " + resultstring2 + " = " + combinationansstring + "\n");
			}

			displaytxtfd.setText(combinationansstring);

			resetListandResult();
		}

		if (permutationsign != -1) {
			double permutationanswer = FactorialMethod.setPermutation(result, result2);

			String permutationansstring = Double.toString(permutationanswer);

			String resultstring = Double.toString(result);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted(resultstring + " P " + resultstring2 + " = " + permutationansstring + "\n");
			}

			displaytxtfd.setText(permutationansstring);

			resetListandResult();
		}

		// -------------------------------------------------------------------------------------------------------------------

		if (gammasign != -1) {
			double gammaans = GammaMethod.gamma(result2);

			String resultstring2 = Double.toString(result2);

			double roundoffans = setToThirteenDecimalPlace(gammaans);
			String roundoffansvalue = Double.toString(roundoffans);

			if (historylistener != null) {
				historylistener.textEmitted("Gamma(" + resultstring2 + ")" + " = " + gammaans + "\n");
			}

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

		if (lnsign != -1) {
			double lnans = TrigMethods.ln(result2);

			String resultstring2 = Double.toString(result2);

			double roundoffans = setToThirteenDecimalPlace(lnans);
			String roundoffansvalue = Double.toString(roundoffans);

			if (historylistener != null) {
				historylistener.textEmitted("LN  (" + resultstring2 + ")" + " = " + lnans + "\n");
			}

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

		if (phsign != -1) {
			double phans = TrigMethods.getPH(result2);

			double roundoffans = setToThirteenDecimalPlace(phans);
			String roundoffansvalue = Double.toString(roundoffans);

			String resultstring2 = Double.toString(result2);

			if (historylistener != null) {
				historylistener.textEmitted("PH (" + resultstring2 + ")" + " = " + phans + "\n");
			}

			displaytxtfd.setText(roundoffansvalue);

			resetListandResult();
		}

	}

	public void quadraticEqnsolver() {

		String xsquareval = "x^2";
		char plusvalue = '+';
		char minusvalue = '-';
		char dotvalue = '.';

		operator = displaytxtfd.getText();

		int xsquarevalsign = operator.indexOf(xsquareval);
		int plusvaluesign = operator.indexOf(plusvalue);
		int minusvaluesign = operator.indexOf(minusvalue);
		int dotvaluesign = operator.indexOf(dotvalue);

		if (xsquarevalsign != -1) {
			if (dotvaluesign != -1) {
				list1.add(displaytxtfd.getText().substring(0, xsquarevalsign));
			} else {
				list1.add(displaytxtfd.getText().substring(0, xsquarevalsign));
			}
		}

		boolean emptyString = list1.contains("");

		for (int i = 0; i < list1.size(); i++) {
			if (emptyString) {
				quadresult = 1;
				System.out.println("Result=" + quadresult);
			} else {
				quadresult = quadresult * 10 + Double.parseDouble((String) list1.get(i));
				System.out.println("Result=" + quadresult);
			}
		}

		// -----------------------------------------------------------------------------------------------------
		String splittedequation = displaytxtfd.getText().substring((plusvaluesign + 1),
				displaytxtfd.getText().length());

		String splittedequation2 = displaytxtfd.getText().substring((minusvaluesign + 1),
				displaytxtfd.getText().length());

		int newplusvaluesign = splittedequation.indexOf(plusvalue);
		int newplusMinusvaluesign = splittedequation.indexOf(minusvalue);

		int newminusvaluesign = splittedequation2.indexOf(minusvalue);
		int newminusPlusvaluesign = splittedequation2.indexOf(plusvalue);

		if ((newplusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list2.add(splittedequation.substring(0, newplusvaluesign - 1));
			} else {
				list2.add(splittedequation.substring(0, newplusvaluesign - 1));
			}

		} else if ((newminusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list2.add(splittedequation2.substring(0, newminusvaluesign - 1));
			} else {
				list2.add(splittedequation2.substring(0, newminusvaluesign - 1));
			}

		} else if ((newplusMinusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list2.add(splittedequation.substring(0, newplusMinusvaluesign - 1));
			} else {
				list2.add(splittedequation.substring(0, newplusMinusvaluesign - 1));
			}
		} else if ((newminusPlusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list2.add(splittedequation2.substring(0, newminusPlusvaluesign - 1));
			} else {
				list2.add(splittedequation2.substring(0, newminusPlusvaluesign - 1));
			}
		}

		boolean emptyString2 = list2.contains("");

		for (int i = 0; i < list2.size(); i++) {
			if (emptyString2) {
				quadresult2 = 1;
				System.out.println("Result=" + quadresult2);
			} else {
				quadresult2 = quadresult2 * 10 + Double.parseDouble((String) list2.get(i));
				System.out.println("Result2 = " + quadresult2);
			}
		}
		// -----------------------------------------------------------------------------------------------------
		if ((newplusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list3.add(splittedequation.substring((newplusvaluesign + 1), splittedequation.length()));
			} else {
				list3.add(splittedequation.substring((newplusvaluesign + 1), splittedequation.length()));
			}
		} else if ((newminusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list3.add(splittedequation2.substring((newminusvaluesign + 1), splittedequation2.length()));
			} else {
				list3.add(splittedequation2.substring((newminusvaluesign + 1), splittedequation2.length()));
			}
		} else if ((newplusMinusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list3.add(splittedequation.substring((newplusMinusvaluesign + 1), splittedequation.length()));
			} else {
				list3.add(splittedequation.substring((newplusMinusvaluesign + 1), splittedequation.length()));
			}
		} else if ((newminusPlusvaluesign != -1)) {
			if (dotvaluesign != -1) {
				list3.add(splittedequation2.substring((newminusPlusvaluesign + 1), splittedequation2.length()));
			} else {
				list3.add(splittedequation2.substring((newminusPlusvaluesign + 1), splittedequation2.length()));
			}
		}

		for (int i = 0; i < list3.size(); i++) {
			quadresult3 = quadresult3 * 10 + Double.parseDouble((String) list3.get(i));
			System.out.println("Result3 =" + quadresult3);
		}

		historylistener.textEmitted(displaytxtfd.getText());
		// -----------------------------------------------------------------------------------------------------
		if (newplusvaluesign != -1) {
			double root1, root2, d;

			double a = quadresult;
			double b = quadresult2;
			double c = quadresult3;

			double q = (4 * a * c);

			d = ((b * b) - (q));
			System.out.println(d);

			if (d > 0) {
				String msg = "Roots are real and unequal";

				root1 = ((-(b) + Math.sqrt(d)) / (2 * (a)));

				root2 = ((-(b) - Math.sqrt(d)) / (2 * (a)));

				double roundoffroot1 = setToThirteenDecimalPlace(root1);
				double roundoffroot2 = setToThirteenDecimalPlace(root2);

				String rootstring = Double.toString(root1);
				String rootstring2 = Double.toString(root2);

				displaytxtfd.setText("x1=" + roundoffroot1 + " x2=" + roundoffroot2);

				if (historylistener != null) {
					historylistener.textEmitted(msg + "  =  " + rootstring + "," + rootstring2 + "\n");
				}
			}

			else if (d == 0) {
				String msg = "Roots are equal";

				root1 = (-(b) + Math.sqrt(d) / ((2) * a));

				double roundoffroot1 = setToThirteenDecimalPlace(root1);

				String rootstring = Double.toString(root1);

				displaytxtfd.setText("x1=" + roundoffroot1 + " x2=" + roundoffroot1);

				if (historylistener != null) {
					historylistener.textEmitted(msg + " = " + rootstring + "," + rootstring + "\n");
				}

			}

			else {
				String msg = "Roots are imaginary";

				displaytxtfd.setText(msg);
			}

			resetListandResult();
		}
		// --------------------------------------------------------------------------------------------------------------------
		if (newminusvaluesign != -1) {
			double root1, root2, d;

			double a = quadresult;
			double b = quadresult2;
			double c = quadresult3;

			double q = (4 * a * c);

			d = ((b * b) - (-q));
			System.out.println(d);

			if (d > 0) {
				String msg = "Roots are real and unequal";

				root1 = (-1) * ((-(b) + Math.sqrt(d)) / (2 * (a)));

				root2 = (-1) * ((-(b) - Math.sqrt(d)) / (2 * (a)));

				double roundoffroot1 = setToThirteenDecimalPlace(root1);
				double roundoffroot2 = setToThirteenDecimalPlace(root2);

				String rootstring = Double.toString(root1);
				String rootstring2 = Double.toString(root2);

				displaytxtfd.setText("x1=" + roundoffroot1 + " x2=" + roundoffroot2);

				if (historylistener != null) {
					historylistener.textEmitted(msg + " = " + rootstring + "," + rootstring2 + "\n");
				}

			}

			else if (d == 0) {
				String msg = "Roots are equal";

				root1 = (-(b) + Math.sqrt(d) / ((2) * a));

				double roundoffroot1 = setToThirteenDecimalPlace(root1);

				String rootstring = Double.toString(root1);

				displaytxtfd.setText("x1=" + roundoffroot1 + " x2=" + roundoffroot1);

				if (historylistener != null) {
					historylistener.textEmitted(msg + " = " + rootstring + "," + rootstring + "\n");
				}

			}

			else {
				String msg = "Roots are imaginary";

				displaytxtfd.setText(msg);
			}

			resetListandResult();
		}
		// -------------------------------------------------------------------------------------------------------------------
		if (newplusMinusvaluesign != -1) {
			double root1, root2, d;

			double a = quadresult;
			double b = quadresult2;
			double c = quadresult3;

			double q = (4 * a * (-c));

			d = ((b * b) - (q));
			System.out.println(d);

			if (d > 0) {
				String msg = "Roots are real and unequal";

				root1 = ((-(b) + Math.sqrt(d)) / (2 * (a)));

				root2 = ((-(b) - Math.sqrt(d)) / (2 * (a)));

				double roundoffroot1 = setToThirteenDecimalPlace(root1);
				double roundoffroot2 = setToThirteenDecimalPlace(root2);

				String rootstring = Double.toString(root1);
				String rootstring2 = Double.toString(root2);

				displaytxtfd.setText("x1=" + roundoffroot1 + " x2=" + roundoffroot2);

				if (historylistener != null) {
					historylistener.textEmitted(msg + "  =  " + rootstring + "," + rootstring2 + "\n");
				}
			}

			resetListandResult();
		}

		// --------------------------------------------------------------------------------------------------------------------
		if (newminusPlusvaluesign != -1) {
			double root1, root2, d;

			double a = quadresult;
			double b = quadresult2;
			double c = quadresult3;

			double q = (4 * a * c);

			d = ((b * b) - (q));
			System.out.println(d);

			if (d > 0) {
				String msg = "Roots are real and unequal";

				root1 = (-1) * ((-(-b) + Math.sqrt(d)) / (2 * (a)));

				root2 = (-1) * ((-(-b) - Math.sqrt(d)) / (2 * (a)));

				double roundoffroot1 = setToThirteenDecimalPlace(root1);
				double roundoffroot2 = setToThirteenDecimalPlace(root2);

				String rootstring = Double.toString(root1 * (-1));
				String rootstring2 = Double.toString(root2 * (-1));

				displaytxtfd.setText("x1=" + (-roundoffroot1) + " x2=" + (-roundoffroot2));

				if (historylistener != null) {
					historylistener.textEmitted(msg + " = " + rootstring + "," + rootstring2 + "\n");
				}

			}

			resetListandResult();
		}

	}

	public void resetListandResult() {
		result = 0;
		result2 = 0;
		quadresult = 0.0;
		quadresult2 = 0.0;
		quadresult3 = 0.0;
		list1.clear();
		list2.clear();
		list3.clear();
	}

	public void clearTextField() {
		displaytxtfd.setText("");
	}

	public void appendText(String text, JButton btn) {
		String btnText = displaytxtfd.getText() + btn.getText();
		displaytxtfd.setText(btnText);
	}

	public void clearTextBack() {
		displaytxtfd.setText(displaytxtfd.getText().substring(0, displaytxtfd.getText().length() - 1));
	}

	public void sethistoryPanellistener(HistoryPanelListener historyPanelListener) {
		this.historylistener = historyPanelListener;
	}
}