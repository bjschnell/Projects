/* Herbology Calculator
*	Calculates the cost to make certain Legion version potions
* 	and displays profit margins. Helps users with the crafting process
*	by telling them how many of each herb is needed to make X amount
* 	of potions (can also provide an estimate for cost)
*	Version 1.0 
*	Author: Brady Schnell
*	Date Created: Oct 26 2016
*/

import java.io.File;
import java.util.Scanner;

public class Herbology {
	private static final int STAR = 0, FOX = 1, FJARN = 2, DREAM = 3, AETH = 4;
	public static void main(String[] args) throws InterruptedException {
		File f = new File("kush.txt");
		Herb[] herbs = new Herb[6]; // Create herbs list.
		// 0 = Starlight Rose, 1 = Foxflower, 2 = Fjarnskaggl, 3 = Dreamleaf, 4 = Aethril.

		// If the file doesn't exist program has never been loaded before. Initiate first time start-up.
		if(!f.exists() && !f.isDirectory()) {
			System.out.println("Welcome to Herbology!");
			Thread.sleep(1000); // Pauses execution for 2 seconds.
			System.out.println("This is a basic profit calculator for alchemy and herbalism in the World of Warcraft!");
			System.out.println("Usage is very simple!"); 
			System.out.println("Simply input the current price of individual herbs from the auction house");
			System.out.println("and the program will take care of the rest!");
			herbs[STAR] = new Herb("Starlight Rose");
			herbs[FOX] = new Herb("Foxflower");
			herbs[FJARN] = new Herb("Fjarnskaggl");
			herbs[DREAM] = new Herb("Dreamleaf");
			herbs[AETH] = new Herb("Aethril");
		} else if (f.exists() && !f.isDirectory()) {
			// Load everything from the file and perform calculations based on previously input values.
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Let's enter some prices!");
		for (int i = 0; i <= 4; i++) {
			System.out.println("Enter the current price for " + herbs[i].getName() + ": ");
			boolean err = true;
			while (err) {
				if (input.hasNextInt()) {
					herbs[i].setVal(input.nextInt());
				} else {
					System.out.println("Sorry that's not a valid input! Please enter the value in gold (rounded however you like!):");
					input.next();
					continue;
				}
				err = false;
			} 
		}

		System.out.println("Awesome! Now that we got our prices, lets do some math!");
		// Calculate prices of 

	}


}