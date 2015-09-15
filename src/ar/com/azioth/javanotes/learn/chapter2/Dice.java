package ar.com.azioth.javanotes.learn.chapter2;

/**
 * Created by Sebastian Sandri on 16/05/2015.
 */
public class Dice {

    public static void main(String[] args){

        int firstDice;
        int secondDice;
        int totalRoll;

        firstDice = (int)(Math.random()*6) + 1;
        secondDice = (int)(Math.random()*6) + 1;
        totalRoll = firstDice + secondDice;
        System.out.println("The first die comes up " + firstDice);
        System.out.println("The second die comes up " + secondDice);
        System.out.println("Your total roll is " + totalRoll);
    }
}
