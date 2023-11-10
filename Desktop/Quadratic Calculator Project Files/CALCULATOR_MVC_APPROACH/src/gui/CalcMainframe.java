/*Author: Nathaniel Cobbinah
 *Email:  baby.hugo74@yahoo.com
 *Email:  fmg3ckali@gmail.com
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class CalcMainframe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CalcTxtField displaytxtfd;
	private CalcButtons calcbuttons;
	private About about;
	private Manual manual;
	private Historytxtfd historytxtfd;

	public CalcMainframe() {
		super("TANK CALCULATOR v3");

		createGUI();

		setJMenuBar(createMenuBar());
	}

	public void createGUI() {

		/*
		 * try { UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel()); } catch
		 * (UnsupportedLookAndFeelException | ParseException e) { // TODO Auto-generated
		 * catch block }
		 */
		setSize(700, 530);

		setResizable(false);
		setLayout(new BorderLayout());
		
		//------------------------------------------------------------------------
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		//------------------------------------------------------------------------

		displaytxtfd = new CalcTxtField();
		calcbuttons = new CalcButtons();
		historytxtfd = new Historytxtfd();
		
		calcbuttons.setHistoryandDisplayListener(new HistoryandDisplaytxtfdListener() {

			public void buttonTextEmitted(String text, JButton btnText) {
				displaytxtfd.appendText(text, btnText);
			}

			public void compute_ReversePolishNotation() {
				displaytxtfd.compute_ReversePolishNotation();
			}

			public void clearTextOneAtaTime() {
				displaytxtfd.clearTextBack();
			}

			public void computeSolution() {
				displaytxtfd.computeSolutions();				
			}

			@Override
			public void clearTextField() {
				displaytxtfd.clearTextField();
			}

		});
		
		//----DISPLAY AND HISTORY PANEL MERGE
		JPanel disphistoryPanel = new JPanel();
		disphistoryPanel.setLayout(new BorderLayout());
		disphistoryPanel.add(historytxtfd,BorderLayout.NORTH);
		disphistoryPanel.add(displaytxtfd,BorderLayout.SOUTH);
		
		displaytxtfd.sethistoryPanellistener(new HistoryPanelListener() {
			public void textEmitted(String text) {
				historytxtfd.appendText(text);
			}
		});
		

		add(disphistoryPanel, BorderLayout.NORTH);
		add(calcbuttons, BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenuItem exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);

		
		//JMenu windowMenu = new JMenu("Quadratic Equation");
		//JMenuItem solveQuadraticMenuItem = new JMenuItem("Solve Quadratic Equation");
		//JMenuItem graphMenuItem = new JMenuItem("Show Quadratic Graph");
		//windowMenu.add(solveQuadraticMenuItem);
		//windowMenu.add(graphMenuItem);
		
		//solveQuadraticMenuItem.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//		displaytxtfd.quadraticEqnsolver(); //functionality degraded in this current version
		//	}
		//});
		
		JMenu historyMenu = new JMenu("History");
		JMenuItem showhistoryMenuItem = new JMenuItem("Show History");
		JMenuItem hidehistoryMenuItem = new JMenuItem("Hide History");
		JMenuItem clearhistoryMenuItem = new JMenuItem("Clear History");
		historyMenu.add(showhistoryMenuItem);
		historyMenu.add(hidehistoryMenuItem);
		historyMenu.add(clearhistoryMenuItem);
		
		hidehistoryMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				historytxtfd.setVisible(false);
			}
		});
		
		showhistoryMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				historytxtfd.setVisible(true);
			}
		});
		
		clearhistoryMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				historytxtfd.clearText();
			}	
		});
		
		/*
		 * JMenu matrixMenu = new JMenu("Systems of Equations"); JMenuItem
		 * matrixMenuItem = new JMenuItem("Show Equation Field"); JMenuItem
		 * gaussjordanMenuItem = new JMenuItem("Solve Equation using Gauss Jordan");
		 * JMenuItem gaussianMenuItem = new JMenuItem("Solve Equation using Gaussian");
		 * JMenuItem ludecompMenuItem = new
		 * JMenuItem("Solve Equation lower upper decomposition"); JMenuItem
		 * inverseMenuItem = new JMenuItem("Solve the inverse of Matrix");
		 * matrixMenu.add(matrixMenuItem); matrixMenu.add(gaussjordanMenuItem);
		 * matrixMenu.add(gaussianMenuItem); matrixMenu.add(ludecompMenuItem);
		 * matrixMenu.add(inverseMenuItem);
		 */
		
		JMenu helpMenu = new JMenu("Help");
		JMenuItem manualItem = new JMenuItem("Manual");
		JMenuItem aboutItem = new JMenuItem("About");
		helpMenu.add(manualItem);
		helpMenu.add(aboutItem);

		menuBar.add(fileMenu);
		//menuBar.add(windowMenu);
		menuBar.add(historyMenu);
		//menuBar.add(matrixMenu);
		menuBar.add(helpMenu);
		
		manualItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   if(e.getSource() == manualItem){
					   SwingUtilities.invokeLater(new Runnable(){
				    	   public void run(){
				    		   new Manual();
				    	   }
				       });
			     }
			}
		});
		
		aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   if(e.getSource() == aboutItem){
					   SwingUtilities.invokeLater(new Runnable(){
				    	   public void run(){
				    		   new About();
				    	   }
				       });
			     }
			}
		});

		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action = JOptionPane.showConfirmDialog(CalcMainframe.this,
						"Do you really want to exit the application?", "Confirm Exit", JOptionPane.OK_CANCEL_OPTION);

				if (action == JOptionPane.OK_OPTION) {
					WindowListener[] listeners = getWindowListeners();

					for (WindowListener listener : listeners) {
						listener.windowClosing(new WindowEvent(CalcMainframe.this, 0));
					}
				}
			}
		});

		return menuBar;
	}

}
