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
	private static final int OLD = 0, DEADLY = 1, UNBENDING = 2;
	private static final int SCARS = 0, ARMIES = 1, DEMON = 2, PACT = 3;

	public static void calculateCosts(Potion[] pots, Herb[] herbs) {



	}

	public static void main(String[] args) throws InterruptedException {
		File f = new File("kush.txt");
		Herb[] herbs = new Herb[5]; // Create herbs list.
		Potion[] pots = new Potion[4];
		Potion[] flasks = new Potion[4];

		int[] deadIngred = {2,0,4,4,0};
		pots[DEADLY] = new Potion("Deadly Grace", deadIngred);

		int[] oldWarIngred = {2,4,4,0,0};
		pots[OLD] = new Potion("Old-War",oldWarIngred);

		int[] unbendIngred = {2,4,0,0,4};
		pots[UNBENDING] = new Potion("Unbending", unbendIngred);

		int[] ttsI = {7, 0, 0, 10, 10};
		flasks[SCARS] = new Potion("Ten Thousand Scars", ttsI);

		int[] caIngred = {7,10, 0, 0, 10};
		flasks[ARMIES] = new Potion("Countless Armies", caIngred);

		int[] sdIngred = {7, 10, 10, 0, 0};
		flasks[DEMON] = new Potion("Seventh Demon", sdIngred);

		int[] wpIngred = {7, 0, 10, 10, 0};
		flasks[PACT] = new Potion("Whispered Pact", wpIngred);

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
		calculateCosts(pots, herbs);

	}
}