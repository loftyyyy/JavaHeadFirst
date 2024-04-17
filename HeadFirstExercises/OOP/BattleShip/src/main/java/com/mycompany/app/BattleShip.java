
package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BattleShip{
    private String finalGuess;
    private String tbd;
    private String[][] grid = new String[7][7];
    private ArrayList<String> yLabel = new ArrayList<>(Arrays.asList("G","F","E","D","C","B","A"));
    private String[] startUpNames = {"SparkForge","AstraFlow","Kinect","Veridify"};


    private void generateShip(){

        Random randomNumber = new Random();
        int firstRN;
        int secondRN;
        int vertiHori;
        int startUpNameRN;


        firstRN = 5;
        secondRN = 0;
        for(int i = 0; i < 3; i++){
            firstRN = randomNumber.nextInt(7);
            secondRN = randomNumber.nextInt(7);
            vertiHori = randomNumber.nextInt(2);
            startUpNameRN = randomNumber.nextInt(4);
            System.out.println(firstRN + "," + secondRN);
            // Corner cases
            if(firstRN == 0 && secondRN == 0 || firstRN == 0 && secondRN == 1 || firstRN == 0 && secondRN == 2 || firstRN == 0 && secondRN == 3 || firstRN == 0 && secondRN == 4 || firstRN == 0 && secondRN == 5 || firstRN == 0 && secondRN == 6 ){
                grid[firstRN][secondRN] = startUpNames[startUpNameRN];
                grid[firstRN + 1][secondRN] = startUpNames[startUpNameRN];
                grid[firstRN + 2][secondRN] = startUpNames[startUpNameRN];
            }else if(firstRN == 6 && secondRN == 0 || firstRN == 6 && secondRN == 1 || firstRN == 6 && secondRN == 2 || firstRN == 6 && secondRN == 3 || firstRN == 6 && secondRN == 4 || firstRN == 6 && secondRN == 5 || firstRN == 6 && secondRN == 6 ){
                grid[firstRN][secondRN] = startUpNames[startUpNameRN];
                grid[firstRN - 1][secondRN] = startUpNames[startUpNameRN];
                grid[firstRN - 2][secondRN] = startUpNames[startUpNameRN];
            }else if(firstRN == 1 && secondRN == 0 || firstRN == 2 && secondRN == 0 || firstRN == 3 && secondRN == 0 || firstRN == 4 && secondRN == 0 || firstRN == 5 && secondRN == 0 || firstRN == 6 && secondRN == 0 ){

                grid[firstRN][secondRN] = startUpNames[startUpNameRN];
                grid[firstRN][secondRN + 1] = startUpNames[startUpNameRN];
                grid[firstRN][secondRN + 2] = startUpNames[startUpNameRN];

            }else if(firstRN == 1 && secondRN == 6 || firstRN == 2 && secondRN == 6 || firstRN == 3 && secondRN == 6|| firstRN == 4 && secondRN == 6 || firstRN == 5 && secondRN == 6 || firstRN == 6 && secondRN == 6 ){
                    grid[firstRN][secondRN] = startUpNames[startUpNameRN];
                    grid[firstRN][secondRN - 1] = startUpNames[startUpNameRN];
                    grid[firstRN][secondRN - 2] = startUpNames[startUpNameRN];

            }else{
                if(vertiHori == 0){

                    grid[firstRN][secondRN] = startUpNames[startUpNameRN];
                    grid[firstRN + 1][secondRN] = startUpNames[startUpNameRN];
                    grid[firstRN - 1][secondRN] = startUpNames[startUpNameRN];
                }else if(vertiHori != 0){


                    grid[firstRN][secondRN] = startUpNames[startUpNameRN];
                    grid[firstRN][secondRN + 1] = startUpNames[startUpNameRN];
                    grid[firstRN][secondRN - 1] = startUpNames[startUpNameRN];
                }
            }


        }

    }
    private void generateField(){

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "X";
            }

        }
    }
    private void showField(){

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf("%-20s", grid[i][j] + " ");
            }
            System.out.println();

        }
    }
    private boolean checkFieldEmpty() {
        boolean completed = false;
        int target = 49;
        int current = 0;

        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j].equals("X")){
                    current += 1;
                }
            }
        }
        if(current == 49){
            completed = true;
        }
        return completed;

    }

    void startGame(){
        generateField();
        generateShip();

//        for(int i = 0; i < grid.length; i++){
//            for(int j = 0; j < grid[i].length; j++){
//                grid[i][j] = i + "," + j ;
//            }
//
//        }
        showField();
        // TODO: Implement guess functionality.
        boolean guessed = false;
        Scanner input = new Scanner(System.in);
        int guesses = 0;

        while(!guessed){
            System.out.println("Guess? ");
            String guess = input.nextLine();
            String[] split = guess.split("");
            guesses += 1;

            if(!grid[yLabel.indexOf(split[0])][Integer.parseInt(split[1])].equals("X")){
                System.out.println(grid[yLabel.indexOf(split[0])][Integer.parseInt(split[1])] + " is found and has been killed!");
                String target = grid[yLabel.indexOf(split[0])][Integer.parseInt(split[1])];

                for(int i = 0; i < grid.length; i++) {
                    for (int j = 0; j < grid[i].length; j++) {
                        if(target.equals(grid[i][j])){
                            grid[i][j] = "X";
                        }
                    }
                }
                if(checkFieldEmpty()){
                    System.out.println("Excellent! You destroyed all of them!!!");
                    System.out.println("Number of guesses: " + guesses);
                    guessed = true;
                }
                showField();
            }else{
                System.out.println("Yous dumb!");
            }



        }

    }

}
