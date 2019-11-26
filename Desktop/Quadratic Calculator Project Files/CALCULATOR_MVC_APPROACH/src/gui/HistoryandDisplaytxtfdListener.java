package gui;

import javax.swing.JButton;

public interface HistoryandDisplaytxtfdListener {

	public void buttonTextEmitted(String text, JButton btnText);
	
	public void clearTextEmitted();

	public void clearTextOneAtaTime();
	
    public void computeSolution();

}
