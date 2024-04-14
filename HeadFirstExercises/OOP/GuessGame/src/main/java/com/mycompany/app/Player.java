
package com.mycompany.app;

import java.util.Random;

public class Player{

    int number;

        Random randomNumber = new Random();

    int guess(){
        number = randomNumber.nextInt(10);
        return number;

    }


}
