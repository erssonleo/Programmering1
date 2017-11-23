package Yatzy;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		printBoard();
	}
	/**
	 * Print the game board
	 */
	private static void printBoard() {
		JOptionPane.showMessageDialog(null, "Continue for access", "AUDI STOCKHOLM", -1);
		JOptionPane.showInternalMessageDialog(null, "AUDI STOCKHOLM", "LOGO", -1, icon);
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "So your name is " + name);
		JOptionPane.showInputDialog("Your Audi RS6 AVANT is ready for delivery", "Comment");
		JOptionPane.showMessageDialog(null, "Thanks!", "AUDI STOCKHOLM", -1);
	}
	
}
