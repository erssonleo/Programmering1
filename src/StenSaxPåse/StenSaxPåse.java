package StenSaxPåse;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {

	public static void main(String[] args) {
		
		Scanner usersChoice = new Scanner(System.in);
		System.out.println("Select Stone Sciccor or Paper");
		String usersPick = usersChoice.nextLine().toLowerCase();
		//System.out.println(usersPick);
		
		int wins = 0;
		int loss = 0;
		int draw = 0;
		
		int numberOfGames = 20; 
		
		for (int i = 0; i < numberOfGames; i++) {
			System.out.println("Game: " + (i + 1));
		}
			
			
		Random randomGenerator = new Random();
		int stoneSiccorPaper = (int) randomGenerator.nextInt(3);
		
		
		
		if (stoneSiccorPaper == 0) {
			System.out.println("Computer - Stone");
		} else if (stoneSiccorPaper == 1){
			System.out.println("Computer - Siccor");
		} else {
			System.out.println("Computer - Paper");
		}
		 
		
			System.out.println("You Won!);
		}else

	{
			System.out.println("You Lost!);
		}

	System.out.println("You Won!);}else{System.out.println("You Lost!);}

	System.out.println("You Won!);}else{System.out.println("You Lost!);
}

}

}
