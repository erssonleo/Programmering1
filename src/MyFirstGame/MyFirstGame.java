package MyFirstGame;

import javax.swing.JOptionPane;

public class MyFirstGame {
	
	private static String playerName = "";

	public static void main(String[] args) {
		welcomescreen();

	}
	
	public static void welcomescreen () {
		JOptionPane.showMessageDialog(null, "Welcome to the Game");
		playerName = JOptionPane.showInputDialog("Enter your name; ");
		welcomescreen();
	}
	public static void level1() {
		String [] options = new String[] { "Left", "Right", "Straigt Ahead", "Show my inventory" };
		int response = JOptionPane.showOptionDialog(null, "After many hours of walking, you have reached the forrest with three paths \now what would you like to do?",
				"YOU HAVE ENTRENCE THE FORREST!!", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
				options[3]);
		
		JOptionPane.showMessageDialog(null, "Response: "+ response);
		
		if (response == 1) {
			JOptionPane.showMessageDialog(null, "Left");
			JOptionPane.showMessageDialog(null, "You have reached the scorpions territory");
			
		} else if (response == 2) {
			JOptionPane.showMessageDialog(null, "Right");
			
			
		}
		
		
				
	}
}

