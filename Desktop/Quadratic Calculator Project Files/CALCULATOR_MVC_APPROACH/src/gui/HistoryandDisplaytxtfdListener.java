package gui;

import javax.swing.JButton;

public interface HistoryandDisplaytxtfdListener {

	public void buttonTextEmitted(String text, JButton btnText);
	
	public void compute_ReversePolishNotation();

	public void clearTextOneAtaTime();
	
    public void computeSolution();

	public void clearTextField();
}
