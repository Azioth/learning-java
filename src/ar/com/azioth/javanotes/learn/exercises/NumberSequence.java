package ar.com.azioth.javanotes.learn.exercises;

import ar.com.azioth.javanotes.utils.TextIO;

public class NumberSequence {

    public static void main(String[] args){

        int N;
        int counter;
        String sequence;

        counter = 0;
        sequence = "";

        System.out.print("Input a positive number greater than 1: ");
        N = TextIO.getInt();
        while ( N <= 1 ){
            System.out.print("The number must be greater than 1, please try again: ");
            N = TextIO.getInt();
        }

        while ( N != 1 ){
            if ( counter == 0 ){
                sequence = Integer.toString(N);
            }
            if ( N % 2 == 0){
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }
            if ( counter > 0 ){
                sequence = sequence + "," + N;
            }
            counter++;
        }
        System.out.println("The sequence was \"" + sequence + "\". there were " + counter + " numbers in the sequence");
    }
}
