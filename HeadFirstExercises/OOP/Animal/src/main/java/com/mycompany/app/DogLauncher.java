package com.mycompany.app;
public class DogLauncher{

    public static void main(String[] args){

        Dog rando = new Dog();
        Dog olga = new Dog();
        Dog sandra = new Dog();

        // Golga
        olga.setName = "olga";
        olga.setBreed = "toy poodle";
        olga.setSize = 3;

        //Sandwa
        sandra.setName = "sandra";
        sandra.setBreed = "half labra, half noypi";
        sandra.setSize = 25;

        olga.bark();
        sandra.bark();
        rando.bark();



    }
}

