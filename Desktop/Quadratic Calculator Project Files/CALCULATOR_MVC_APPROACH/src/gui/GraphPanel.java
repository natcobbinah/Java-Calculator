package gui;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class GraphPanel extends JPanel{
	
	public GraphPanel() {
		graphPaneldesign();
	}
	
	private void graphPaneldesign() {
		setLayout(new FlowLayout());
		
		setSize(650, 630);
	}

}
