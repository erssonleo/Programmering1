package lesson.ifstatements;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
	
		Scanner usersGuess = new Scanner(System.in);
		System.out.println("Select Krona or Klave");
		String usersPick = usersGuess.nextLine().toLowerCase();
		// System.out.println(usersPick);
		
		Random randomGenerator = new Random();
		boolean coinFlippValue = randomGenerator.nextBoolean();
		if (coinFlippValue == true) {
			System.out.println("Computer - Krona");
		
		} else {
			System.out.println("Computer - Klave");
		}
		
		
		if (coinFlippValue == true && usersPick.equals("krona")  coinFlippValue == false && usersPick.equals("klave")) {
			System.out.println("You Won!!");
		} else {
			System.out.println("You Lost!");

	}

}

}
