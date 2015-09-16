package ar.com.azioth.javanotes.learn.chapter3;

public class CountDivisors {

	public static void main(String[] args) {
		int countDivisors;
		int maxDivisors = 1;
		int maxCountDivisors = 1;
		
		for (int i = 2; i <= 10000; i++) {
			countDivisors = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					countDivisors++;
				}
			}
			if ( countDivisors > maxCountDivisors ) {
				maxCountDivisors = countDivisors;
				maxDivisors = i;
			}
		}
		System.out.println("Among integers between 1 and 10000,");
	    System.out.println("The maximum number of divisors is " + maxCountDivisors);
	    System.out.println("A number with " + maxCountDivisors + " divisors is " + maxDivisors);	}

}
