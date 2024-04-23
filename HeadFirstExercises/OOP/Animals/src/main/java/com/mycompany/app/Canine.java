
package com.mycompany.app;
public class Canine extends Animals implements Pet{

    void roam(){
        System.out.println("Grrrr, must find anything moving!");

    }

    @Override
    public void behave(){
        System.out.print("I am now behaved!");

    }
    @Override
    public void beCute(){
        System.out.print("I am cute!");

    }
}

