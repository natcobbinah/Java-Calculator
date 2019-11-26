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
	private JButton btnclear;
	private JButton btnsine;
	private JButton btncos;
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
		btntimes = new JButton("x");
		btndivide = new JButton("/");
		btnback = new JButton("←");
		btnclear = new JButton("Clear");
		btnsine = new JButton("sin");
		btncos = new JButton("cos");
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

		btnone.addActionListener(this);
		btntwo.addActionListener(this);
		btnthree.addActionListener(this);
		btnfour.addActionListener(this);
		btnfive.addActionListener(this);
		btnsix.addActionListener(this);
		btnseven.addActionListener(this);
		btneight.addActionListener(this);
		btnnine.addActionListener(this);
		btnzero.addActionListener(this);
		btntan.addActionListener(this);
		btnlog.addActionListener(this);
		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		btntimes.addActionListener(this);
		btndivide.addActionListener(this);
		btnback.addActionListener(this);
		btnclear.addActionListener(this);
		btnsine.addActionListener(this);
		btncos.addActionListener(this);
		btnexponent.addActionListener(this);
		btnsquareroot.addActionListener(this);
		btnequalsto.addActionListener(this);

		// ------ADVANCED MODE BUTTONS-----------------------
		btndot.addActionListener(this);
		btnxfact.addActionListener(this);
		btncombination.addActionListener(this);
		
		btnopenbrace.addActionListener(this);
		btnclosebrace.addActionListener(this);
		btnln.addActionListener(this);
		btngamma.addActionListener(this);
		btnph.addActionListener(this);

		btnpermutation.addActionListener(this);
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
		basicbuttonpanels.add(btnsine, gc);	
		
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
		basicbuttonpanels.add(btnclear, gc);

		gc.gridx = 5;
		gc.gridy = 1;
		basicbuttonpanels.add(btncos, gc);

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
		basicbuttonpanels.add(btntan, gc);

		// fourth row
		gc.gridx = 0;
		gc.gridy = 3;
		basicbuttonpanels.add(btnzero, gc);
		// ------------------------------------------------------

		gc.gridx = 1;
		gc.gridy = 3;
		gc.fill = GridBagConstraints.HORIZONTAL;
		basicbuttonpanels.add(btnsquareroot, gc);

		gc.gridx = 2;
		gc.gridy = 3;
		basicbuttonpanels.add(btnlog, gc);

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
		advancedbuttonpanels2.add(btndot, gc4);
		
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
		advancedbuttonpanels2.add(btnopenbrace, gc4);

		// ------------------------------------------------------
		btnclosebrace.setPreferredSize(btndotsize);

		gc4.gridx = 1;
		gc4.gridy = 2;
		advancedbuttonpanels2.add(btnclosebrace, gc4);

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

		add(advancedbuttonpanels2, BorderLayout.EAST);

		advancedbuttonpanels2.setBorder(BorderFactory.createEtchedBorder());

	}

	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton) e.getSource();

		if (clicked == btnone) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("1", btnone);
			}
		}

		 if (clicked == btntwo) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("2", btntwo);
			}
		}

		if (clicked == btnthree) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("3", btnthree);
			}
		}

		if (clicked == btnfour) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("4", btnfour);
			}
		}

		if (clicked == btnfive) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("5", btnfive);
			}
		}

		if (clicked == btnsix) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("6", btnsix);
			}
		}

		if (clicked == btnseven) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("7", btnseven);
			}
		}

		if (clicked == btneight) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("8", btneight);
			}
		}

		if (clicked == btnnine) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("9", btnnine);
			}
		}

		if (clicked == btnzero) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("0", btnzero);
			}
		}

		if (clicked == btnlog) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("log", btnlog);
			}
		}

		if (clicked == btnplus) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("+", btnplus);
			}
		}

		if (clicked == btnminus) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("-", btnminus);
			}
		}

		if (clicked == btntimes) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("x", btntimes);
			}
		}

		if (clicked == btndivide) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("/", btndivide);
			}
		}

		if (clicked == btnback) {
			if (histdisplaylistener != null) {
				histdisplaylistener.clearTextOneAtaTime();
			}
		}

		if (clicked == btnclear) {
			if (histdisplaylistener != null) {
				histdisplaylistener.clearTextEmitted();
			}
		}

		if (clicked == btnsine) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("sin", btnsine);
			}
		}

		if (clicked == btncos) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("cos", btncos);
			}
		}
		
		if (clicked == btntan) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("tan", btntan);
			}
		}

		if (clicked == btnexponent) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("^", btnexponent);
			}
		}

		if (clicked == btnsquareroot) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("√", btnsquareroot);
			}
		}

		// -------------------ADVANCED MODE-------------------------------------------//
		if (clicked == btndot) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted(".", btndot);
			}
		}

		if (clicked == btnxfact) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("!", btnxfact);
			}
		}

		if (clicked == btncombination) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("C", btncombination);
			}
		}

		if (clicked == btnln) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("ln", btnln);
			}
		}

		if (clicked == btngamma) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("Γ", btngamma);
			}
		}

		if (clicked == btnph) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("ph", btnph);
			}
		}

		if (clicked == btnpermutation) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("P", btnpermutation);
			}
		}

		if (clicked == btnopenbrace) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted("(", btnopenbrace);
			}
		}

		if (clicked == btnclosebrace) {
			if (histdisplaylistener != null) {
				histdisplaylistener.buttonTextEmitted(")", btnclosebrace);
			}
		}

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
