package ar.com.azioth.javanotes.learn.chapter2;

import ar.com.azioth.javanotes.utils.TextIO;

public class Dozens {

	public static void main(String[] args) {
		int eggsInput;
		int gross;
		int dozens;
		int leftOvers;
		
		System.out.print("How many eggs do you have:    ");
		eggsInput = TextIO.getInt();
		gross = eggsInput / 144;
		dozens = (eggsInput % 144) / 12;
		leftOvers = eggsInput % 12;
		
		System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen and " + leftOvers+ " left over.");
	}
	
}
