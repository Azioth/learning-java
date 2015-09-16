package ar.com.azioth.javanotes.learn.chapter3;

import ar.com.azioth.javanotes.utils.TextIO;

public class ReadLineByLine {

	public static void main(String[] args) {
		String inputString;
		StringBuilder stringBuilder = new StringBuilder();
		char currentChar;
		
		System.out.print("Enter a phrase:    ");
		inputString = TextIO.getln();
		
		for (int i = 0; i < inputString.length(); i++) {
			currentChar = inputString.charAt(i);
			if (Character.isWhitespace(currentChar)){
				System.out.println(stringBuilder.toString());
				stringBuilder = new StringBuilder();
			} else if (Character.isLetter(currentChar)) {
				stringBuilder.append(currentChar);
			}
		}
		System.out.println(stringBuilder.toString());	
	}

}
