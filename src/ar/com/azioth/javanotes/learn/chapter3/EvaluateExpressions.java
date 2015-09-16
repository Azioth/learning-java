package ar.com.azioth.javanotes.learn.chapter3;

import ar.com.azioth.javanotes.utils.TextIO;

public class EvaluateExpressions {

	public static void main(String[] args) {
		double firstNumber;
		double secondNumber;
		char operator;
		double result;
		
		System.out.println("Enter expressions such as  2 + 2  or  34.2 * 7.81");
	    System.out.println("using any of the operators +, -, *, /.");
	    System.out.println("To end, enter a 0.");
	    System.out.println();
	      
		while (true) {
			System.out.print("? ");
			firstNumber = TextIO.getDouble();
			if (firstNumber == 0) {
				break;
			}
			operator = TextIO.getChar();
			secondNumber = TextIO.getDouble();
			if (secondNumber == 0 && operator == '/') {
				System.out.println("Cannot divide by 0");
				continue;
			}
			switch (operator) {
            case '+':
               result = firstNumber + secondNumber;
               break;
            case '-':
            	result = firstNumber - secondNumber;
            	break;
            case '*':
            	result = firstNumber * secondNumber;
            	break;
            case '/':
            	result = firstNumber / secondNumber;
            	break;
            default:
               System.out.println("Unknown operator: " + operator);
               continue;  // Back to start of loop!
			} // end switch
			System.out.println("Value is " + result);
			System.out.println();
		}
		System.out.println("Good bye");
	}

}
