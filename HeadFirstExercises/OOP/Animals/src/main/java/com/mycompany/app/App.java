package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args){
        Animals[] animals = new Animals[6];

        animals[0] = new Dog("John");
        animals[1] = new Cat();
        animals[2] = new Hippo();
        animals[3] = new Wolf();
        animals[4] = new Tiger();
        animals[5] = new Lion();

        animals[0].makeNoise();

        Object dog1 = new Dog("James");
        Dog d = (Dog) dog1;
        System.out.println(dog1.hashCode());
        d.makeNoise();
        d.behave();
        d.test();
        d.dobject(animals[0]);
        System.out.println(Constant.escapeVelocity);

//        Vet dogVet = new Vet();
//        Animals dog = new Dog();
//        dog.food = "meat";
//        dog.makeNoise();
//        dog.roam();
//        dogVet.inject(dog);
//        System.out.println(dog.food);


    }
}
