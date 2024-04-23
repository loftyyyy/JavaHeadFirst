
package com.mycompany.app;
public abstract class Animals{

    public String picture;
    public String food;
    public String hunger;
    public String boundaries;
    public String location;

    void makeNoise(){
        System.out.println("Aghh");
    }

    void eat(){
        System.out.println("NomNom");

    }

    void sleep(){
        System.out.println("ZZZZZzzzzzZZZ");

    }
    void roam(){
        System.out.println("Finding enemies");

    }
}
