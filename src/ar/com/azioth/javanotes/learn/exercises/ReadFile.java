package ar.com.azioth.javanotes.learn.exercises;

import ar.com.azioth.javanotes.utils.TextIO;

/**
 * Created by Sebastian Sandri on 16/05/2015.
 */
public class ReadFile {

    public static void main(String[] args){
        TextIO.readUserSelectedFile();
        String studentName = TextIO.getln();
        int firstScore = TextIO.getInt();
        int secondScore = TextIO.getInt();
        int thirdScore = TextIO.getInt();
        double average = (double)( firstScore + secondScore + thirdScore ) / 3;
        System.out.print("The student " + studentName + " has an average of " + average);
    }
}
