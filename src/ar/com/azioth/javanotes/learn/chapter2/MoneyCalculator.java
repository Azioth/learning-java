package ar.com.azioth.javanotes.learn.chapter2;

import ar.com.azioth.javanotes.utils.TextIO;

public class MoneyCalculator {

	public static void main(String[] args) {
		int pennies;
		int nickels;
		int dimes;
		int quarters;
		double dollars;
		
		System.out.print("Enter the number of quarters:  ");
	    quarters = TextIO.getlnInt();
	     
	    System.out.print("Enter the number of dimes:     ");
	    dimes = TextIO.getlnInt();
	    
	    System.out.print("Enter the number of nickels:   ");
	    nickels = TextIO.getlnInt();
	      
	    System.out.print("Enter the number of pennies:   ");
	    pennies = TextIO.getlnInt();
		
		dollars = (0.25 * quarters) + (0.10 * dimes) 
                + (0.05 * nickels) + (0.01 * pennies);
		
		System.out.println();
	    System.out.print("The total in dollars is $");
	    System.out.printf("%1.2f", dollars);  // Formatted output!
	    System.out.println();
		
	}

	
}
