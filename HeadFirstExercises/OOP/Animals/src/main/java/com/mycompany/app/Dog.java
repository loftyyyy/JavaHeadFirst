
package com.mycompany.app;
public class Dog extends Canine{

    private String name;
    private int age;
    // An example of a constructor this gets called before it gets assigned to a reference variable
    protected Dog(int age){
        this.age = age;
    }
    protected Dog(String x){
        this(32);
        name = x;
        System.out.println("I have been called " + name);
    }
    void makeNoise(){
        super.makeNoise();
        System.out.println("Arf arf");
    }
    void test(){
        System.out.println("hel");
    }






//    @override
//    public void behave(){
//
//    }
//
//    @override
//    public void becute(){
//
//    }

}
