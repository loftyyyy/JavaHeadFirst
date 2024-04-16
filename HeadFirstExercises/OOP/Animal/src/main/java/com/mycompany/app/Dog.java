package com.mycompany.app;
public class Dog{

    String name;
    String breed;
    Integer weight;

    void bark(){


        if(weight >= 25){
        System.out.println("RUFF RUFF RUFFF");
        }else if(weight < 25){

        System.out.println("ruff ruff ruff");
        }else{
            System.out.println("Ruff");

        }


    }
}
