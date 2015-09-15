package ar.com.azioth.javanotes.learn.chapter2;

import ar.com.azioth.javanotes.utils.TextIO;

public class FindAverage {
	
	public static void main(String[] args) { 
		String studentName;
		int exam1, exam2, exam3;
		double average;
		
		TextIO.readFile("testdata.txt");
		
		studentName = TextIO.getln();
		exam1 = TextIO.getlnInt();
		exam2 = TextIO.getlnInt();
		exam3 = TextIO.getlnInt();
		
		average = ( exam1 + exam2 + exam3 ) / 3.0;
		
		System.out.printf("The average grade for %s was %1.1f", studentName, average);
	    System.out.println();
	}
}
