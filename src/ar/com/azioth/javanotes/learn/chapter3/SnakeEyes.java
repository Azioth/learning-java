package ar.com.azioth.javanotes.learn.chapter3;

public class SnakeEyes {

	public static void main(String[] args) {
		int firstDice;
		int secondDice;
		int totalRoll;
		int numberRolls = 0;
		
		do {
			firstDice = (int)(Math.random() * 6) + 1;
			secondDice = (int)(Math.random() * 6) + 1;
			totalRoll = firstDice + secondDice;
			//System.out.println(totalRoll);
			numberRolls++;
		} while (totalRoll != 2);
				
		System.out.printf("It took %d attemps to get the snake eyes", numberRolls);
		
	}
}
