package com.mycompany.app;
import java.util.Random;

public class GuessGame{
    Player Player1; 
    Player Player2;
    Player Player3;


    public void startGame(){
        Player1 = new Player();
        Player2 = new Player();
        Player3 = new Player();

        int guessp1 = Player1.guess();
        int guessp2 = Player3.guess();
        int guessp3 = Player3.guess();

        boolean p1 = false;
        boolean p2 = false;
        boolean p3 = false;

        Random randomNumber = new Random();
        int numberToGuess;


        while(true){
            numberToGuess = randomNumber.nextInt(10);
            System.out.println("I'm guessing the number: " + " " + numberToGuess);

            System.out.println("Player 1 has guessed " + guessp1);
            System.out.println("Player 2 has guessed " + guessp2);
            System.out.println("Player 3 has guessed " + guessp3);

            if(guessp1 == numberToGuess){
                p1 = true;

            }
            if(guessp2 == numberToGuess){
                p2 = true;

            }
            if(guessp3 == numberToGuess){
                p3 = true;

            }else{
                guessp1 = Player1.guess();
                guessp2 = Player3.guess();
                guessp3 = Player3.guess();

            }

            if( p1 || p2 || p3){

                if(p1){
                    System.out.println("Player one got it right!");
                }
                if(p2){
                    System.out.println("Player two got it right!");
                }
                if(p3){
                    System.out.println("Player three got it right!");
                }

                break;

            }else{

                System.out.println("No one got the correct guess!");
                System.out.println("\n\n");
            }
        }

    }
    
}
