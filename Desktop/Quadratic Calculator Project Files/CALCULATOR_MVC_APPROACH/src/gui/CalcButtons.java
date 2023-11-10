/*Author: Nathaniel Cobbinah
 *Email:  baby.hugo74@yahoo.com
 *Email:  fmg3ckali@gmail.com
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CalcButtons extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private HistoryandDisplaytxtfdListener histdisplaylistener;

	private JButton btnone;
	private JButton btntwo;
	private JButton btnthree;
	private JButton btnfour;
	private JButton btnfive;
	private JButton btnsix;
	private JButton btnseven;
	private JButton btneight;
	private JButton btnnine;
	private JButton btnzero;
	private JButton btntan;
	private JButton btnlog;
	private JButton btnplus;
	private JButton btnminus;
	private JButton btntimes;
	private JButton btndivide;
	private JButton btnback;
	private JButton btnRPN;
	private JButton btnClear;
	//private JButton btnAccumulatorClear; //not used anymore
	private JButton btnexponent;
	private JButton btnsquareroot;
	private JButton btnequalsto;
	

	private JPanel basicbuttonpanels;
	private JPanel advancedbuttonpanels2;

	// --------ADVANCED BUTTONS--------------
	private JButton btndot;
	private JButton btnxfact;
	private JButton btncombination;

	private JButton btnln;
	private JButton btngamma;
	private JButton btnph;
	private JButton btnpermutation;
	private JButton btnopenbrace;
	private JButton btnclosebrace;

	// ---------------END---------------------//

	public CalcButtons() {

		btnone = new JButton("1");
		btntwo = new JButton("2");
		btnthree = new JButton("3");
		btnfour = new JButton("4");
		btnfive = new JButton("5");
		btnsix = new JButton("6");
		btnseven = new JButton("7");
		btneight = new JButton("8");
		btnnine = new JButton("9");
		btnzero = new JButton("0");
		btntan = new JButton("tan");
		btnlog = new JButton("log");
		btnlog.setToolTipText("Log of:");

		btnplus = new JButton("+");
		btnminus = new JButton("-");
		btntimes = new JButton("*");
		btndivide = new JButton("/");
		btnback = new JButton("←");
		btnRPN = new JButton("RPN Expr");
		btnClear = new JButton("C");
		//btnAccumulatorClear = new JButton("AC");
		btnexponent = new JButton("^");

		btnsquareroot = new JButton("√");
		btnsquareroot.setToolTipText("Square root of:");

		btnequalsto = new JButton("=");

		// ---------ADVANCED MODE BUTTONS-----------------//
		btndot = new JButton(".");
		btnxfact = new JButton("!");
		btnxfact.setToolTipText("Factorial of:");

		btncombination = new JButton("C");
		btncombination.setToolTipText("Combination:");

		btnln = new JButton("ln");
		btngamma = new JButton("Γ");
		btngamma.setToolTipText("Gamma of:");

		btnph = new JButton("ph");
		btnpermutation = new JButton("P");
		btnpermutation.setToolTipText("Permutation of:");

		btnopenbrace = new JButton("(");
		btnclosebrace = new JButton(")");

		// -----------------------------------------------------------//
		JButton[] setBtnActionListeners = new JButton[] { btnone, btntwo, btnthree, btnfour, btnfive, btnsix, btnseven,
				btneight, btnnine, btnzero, btntan, btnlog, btnplus, btnminus, btntimes, btndivide, btnback, btnRPN,
				btnClear, btnexponent, btnsquareroot, btnequalsto, btndot, btnxfact, btncombination,
				btnopenbrace, btnclosebrace, btnln, btngamma, btnph, btnpermutation };
		
		for(JButton btn : setBtnActionListeners) {
			btn.addActionListener(this);
		}
		// -------------------------------------------------

		layoutdesign();

		setBorder(BorderFactory.createEtchedBorder());
	}

	public void layoutdesign() {
		setLayout(new BorderLayout());

		basicbuttonpanels = new JPanel();
		basicbuttonpanels.setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		gc.insets = new Insets(2, 2, 2, 2);

		// first row
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipady = 10;
		gc.ipadx = 5;
		gc.fill = GridBagConstraints.HORIZONTAL;
		basicbuttonpanels.add(btnseven, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		basicbuttonpanels.add(btneight, gc);

		gc.gridx = 2;
		gc.gridy = 0;
		basicbuttonpanels.add(btnnine, gc);

		gc.gridx = 3;
		gc.gridy = 0;
		basicbuttonpanels.add(btnminus, gc);

		gc.gridx = 4;
		gc.gridy = 0;
		basicbuttonpanels.add(btnback, gc);

		gc.gridx = 5;
		gc.gridy = 0;
		basicbuttonpanels.add(btnClear, gc);

		// second row
		gc.gridx = 0;
		gc.gridy = 1;
		basicbuttonpanels.add(btnfour, gc);

		gc.gridx = 1;
		gc.gridy = 1;
		basicbuttonpanels.add(btnfive, gc);

		gc.gridx = 2;
		gc.gridy = 1;
		basicbuttonpanels.add(btnsix, gc);

		gc.gridx = 3;
		gc.gridy = 1;
		basicbuttonpanels.add(btntimes, gc);

		gc.gridx = 4;
		gc.gridy = 1;
		basicbuttonpanels.add(btnRPN, gc);

		//gc.gridx = 5;
		//gc.gridy = 1;
		//basicbuttonpanels.add(btnAccumulatorClear, gc);

		// third row
		gc.gridx = 0;
		gc.gridy = 2;
		basicbuttonpanels.add(btnone, gc);

		gc.gridx = 1;
		gc.gridy = 2;
		basicbuttonpanels.add(btntwo, gc);

		gc.gridx = 2;
		gc.gridy = 2;
		basicbuttonpanels.add(btnthree, gc);

		gc.gridx = 3;
		gc.gridy = 2;
		basicbuttonpanels.add(btndivide, gc);

		gc.gridx = 4;
		gc.gridy = 2;
		basicbuttonpanels.add(btnexponent, gc);

		gc.gridx = 5;
		gc.gridy = 2;
		basicbuttonpanels.add(btndot, gc);

		// fourth row
		gc.gridx = 0;
		gc.gridy = 3;
		basicbuttonpanels.add(btnzero, gc);
		// ------------------------------------------------------

		gc.gridx = 1;
		gc.gridy = 3;
		gc.fill = GridBagConstraints.HORIZONTAL;
		basicbuttonpanels.add(btnopenbrace, gc);

		gc.gridx = 2;
		gc.gridy = 3;
		basicbuttonpanels.add(btnclosebrace, gc);

		gc.gridx = 3;
		gc.gridy = 3;
		basicbuttonpanels.add(btnplus, gc);

		// -------------------------------------------------------

		gc.gridx = 4;
		gc.gridy = 3;
		gc.gridwidth = 4;
		gc.ipadx = 2 * 1;
		basicbuttonpanels.add(btnequalsto, gc);

		// -------------------------------------------------------------

		add(basicbuttonpanels, BorderLayout.CENTER);

		basicbuttonpanels.setBorder(BorderFactory.createEtchedBorder());

		// =====================================================
		advancedbuttonpanels2 = new JPanel();

		advancedbuttonpanels2.setLayout(new GridBagLayout());
		GridBagConstraints gc4 = new GridBagConstraints();

		gc4.gridx = 0;
		gc4.gridy = 0;
		gc4.ipadx = 10;
		gc4.ipady = 10;
		gc4.insets = new Insets(2, 2, 2, 2);
		gc4.anchor = GridBagConstraints.NORTHWEST;
		// advancedbuttonpanels2.add(btndot, gc4); //tan btn position exchanged with
		// this

		Dimension btndotsize = btndot.getPreferredSize();

		// ------------------------------------------------------
		btnln.setPreferredSize(btndotsize);
		// ------------------------------------------------------
		gc4.gridx = 1;
		gc4.gridy = 0;
		advancedbuttonpanels2.add(btnln, gc4);

		// ------------------------------------------------------
		btngamma.setPreferredSize(btndotsize);
		// ------------------------------------------------------
		gc4.gridx = 0;
		gc4.gridy = 1;
		advancedbuttonpanels2.add(btngamma, gc4);

		// ------------------------------------------------------
		btnph.setPreferredSize(btndotsize);

		gc4.gridx = 1;
		gc4.gridy = 1;
		advancedbuttonpanels2.add(btnph, gc4);
		// ------------------------------------------------------
		btnopenbrace.setPreferredSize(btndotsize);

		gc4.gridx = 0;
		gc4.gridy = 2;
		// advancedbuttonpanels2.add(btnopenbrace, gc4); //squareroot btn exchanged with
		// this

		// ------------------------------------------------------
		btnclosebrace.setPreferredSize(btndotsize);

		gc4.gridx = 1;
		gc4.gridy = 2;
		// advancedbuttonpanels2.add(btnclosebrace, gc4);//log btn exchanged with this

		btnpermutation.setPreferredSize(btndotsize);

		gc4.gridx = 0;
		gc4.gridy = 3;
		advancedbuttonpanels2.add(btnpermutation, gc4);

		btnxfact.setPreferredSize(btndotsize);

		gc4.gridx = 1;
		gc4.gridy = 3;
		advancedbuttonpanels2.add(btnxfact, gc4);

		// -----------------------------------------------------
		btncombination.setPreferredSize(btndotsize);
		// ----------------------------------------------------

		gc4.gridx = 0;
		gc4.gridy = 4;
		advancedbuttonpanels2.add(btncombination, gc4);
		// -----------------------------------------------------

		// add(advancedbuttonpanels2, BorderLayout.EAST);

		// advancedbuttonpanels2.setBorder(BorderFactory.createEtchedBorder());

	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();

		Map<String, JButton> buttonPressed = new HashMap<>();
		buttonPressed.put(" 1 ", btnone);
		buttonPressed.put(" 2 ", btntwo);
		buttonPressed.put(" 3 ", btnthree);
		buttonPressed.put(" 4 ", btnfour);
		buttonPressed.put(" 5 ", btnfive);
		buttonPressed.put(" 6 ", btnsix);
		buttonPressed.put(" 7 ", btnseven);
		buttonPressed.put(" 8 ", btneight);
		buttonPressed.put(" 9 ", btnnine);
		buttonPressed.put(" 0 ", btnzero);
		buttonPressed.put(" + ", btnplus);
		buttonPressed.put(" - ", btnminus);
		buttonPressed.put(" x ", btntimes);
		buttonPressed.put(" / ", btndivide);
		buttonPressed.put(" ( ", btnopenbrace);
		buttonPressed.put(" ) ", btnclosebrace);
		buttonPressed.put(" . ", btndot);
		buttonPressed.put(" ^ ", btnexponent);
		buttonPressed.put(" log ", btnlog);
		buttonPressed.put(" tan ", btntan);
		buttonPressed.put(" √ ", btnsquareroot);
		buttonPressed.put(" ! ", btnxfact);
		buttonPressed.put(" C ", btncombination);
		buttonPressed.put(" ln ", btnln);
		buttonPressed.put(" Γ ", btngamma);
		buttonPressed.put(" ph ", btnph);
		buttonPressed.put(" P ", btnpermutation);

		for (Map.Entry<String, JButton> btnSymbol : buttonPressed.entrySet()) {
			if (clicked == btnSymbol.getValue()) {
				if (histdisplaylistener != null) {
					histdisplaylistener.buttonTextEmitted(btnSymbol.getKey(), clicked);
				}
			}
		}

		if (clicked == btnback) {
			if (histdisplaylistener != null) {
				histdisplaylistener.clearTextOneAtaTime();
			}
		}

		if (clicked == btnRPN) {
			if (histdisplaylistener != null) {
				histdisplaylistener.compute_ReversePolishNotation();
			}
		}
		
		if (clicked == btnClear) {
			if (histdisplaylistener != null) {
				histdisplaylistener.clearTextField();
			}
		}
		
		/*
		 * if (clicked == btnAccumulatorClear) { if (histdisplaylistener != null) {
		 * histdisplaylistener.clearAccumulator(); } }
		 */

		if (clicked == btnequalsto) {
			if (histdisplaylistener != null) {
				histdisplaylistener.computeSolution();
			}
		}
	}

	public void setHistoryandDisplayListener(HistoryandDisplaytxtfdListener historyandDisplaytxtfdListener) {
		this.histdisplaylistener = historyandDisplaytxtfdListener;
	}

}
