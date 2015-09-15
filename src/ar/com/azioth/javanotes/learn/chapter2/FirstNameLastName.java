package ar.com.azioth.javanotes.learn.chapter2;

import ar.com.azioth.javanotes.utils.TextIO;

public class FirstNameLastName {

	public static void main(String[] args) {
		String userInput;
		String firstName;
		String lastName;
		int fnLength;
		int lnLength;
		
		System.out.println("Please enter your first name and last name, separated by a space:");
		System.out.print("> ");
		userInput = TextIO.getln();
		
		firstName = userInput.substring(0, userInput.indexOf(" "));
		fnLength = firstName.length();
		
		System.out.printf("Your first name is %s, which has %d characters.%n", firstName, fnLength);
		
		lastName = userInput.substring(userInput.indexOf(" ")+1);
		lnLength = lastName.length();
		
		
		System.out.printf("Your last name is %s, which has %d characters.%n", lastName, lnLength);
		
		System.out.printf( "Your initials are %s%s%n", 
                firstName.charAt(0), lastName.charAt(0) );
		
		
	}

}
