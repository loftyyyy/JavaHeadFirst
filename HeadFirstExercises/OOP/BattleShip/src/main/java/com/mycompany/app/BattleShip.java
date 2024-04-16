
package com.mycompany.app;

import java.util.Random;

public class BattleShip{
    private String finalGuess;
    private String tbd;
    private String[][] grid = new String[7][7];
    private String[] yLabel = {"A","B","C","D","E","F","G"};
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
//            firstRN = randomNumber.nextInt(7);
//            secondRN = randomNumber.nextInt(7);
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

    void startGame(){
        generateShip();

//        for(int i = 0; i < grid.length; i++){
//            for(int j = 0; j < grid[i].length; j++){
//                grid[i][j] = i + "," + j ;
//            }
//
//        }
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf("%-20s", grid[i][j] + ", ");
            }
            System.out.println();

        }
        // TODO: Implement guess functionality.
        boolean guessed = false;

        while(!guessed){
            
        }

    }

}
