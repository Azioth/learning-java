package ar.com.azioth.javanotes.learn.chapter2;

import ar.com.azioth.javanotes.utils.TextIO;

/**
 * Created by Sebastian Sandri on 16/05/2015.
 */
public class Grettings {

    public static void main(String[] args){
        String userName;

        System.out.print("What's your Name? ");
        userName = TextIO.getlnWord();
        userName = userName.toUpperCase();
        System.out.print("Hello " + userName + ", nice to meet you!");
    }
}