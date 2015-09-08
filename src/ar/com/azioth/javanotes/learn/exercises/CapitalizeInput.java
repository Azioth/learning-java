package ar.com.azioth.javanotes.learn.exercises;

import ar.com.azioth.javanotes.utils.TextIO;

/**
 * Created by Azioth on 25/08/2015.
 */
public class CapitalizeInput {

    public static void main(String[] args) {

        System.out.print("Input a phrase: ");
        String input = TextIO.getlnString();
        System.out.println("User input: " + input);
        printCapitalized(input);
    }

    private static void printCapitalized(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char ch;
        char prevCh = '.';
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            if ( Character.isLetter(ch) && !Character.isLetter(prevCh) && !Character.isUpperCase(ch) ) {
                stringBuilder.append(Character.toUpperCase(ch));
            } else if ( Character.isLetter(ch) && Character.isLetter(prevCh) && Character.isUpperCase(ch) ){
                stringBuilder.append(Character.toLowerCase(ch));
            } else {
                stringBuilder.append(ch);
            }
            prevCh = ch;
        }
        System.out.println("Capitalized input: " + stringBuilder.toString());
    }


}
