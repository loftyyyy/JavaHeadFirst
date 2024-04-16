package com.mycompany.app;
public class DogLauncher{

    public static void main(String[] args){

        Dog rando = new Dog();
        Dog olga = new Dog();
        Dog sandra = new Dog();

        // Golga
        olga.name = "olga";
        olga.breed = "toy poodle";
        olga.weight = 3;

        //Sandwa
        sandra.name = "sandra";
        sandra.breed = "half labra, half noypi";
        sandra.weight = 25;

        olga.bark();
        sandra.bark();
        rando.bark();



    }
}

