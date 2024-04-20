package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){

        Animals dog = new Dog();
        dog.food = "meat";
        dog.makeNoise();
        dog.roam();
        System.out.println(dog.food);

    }
}
