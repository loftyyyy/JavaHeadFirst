package com.mycompany.app;
public class Dog{

    private String name;
    private String breed;
    private Integer size;

    // Encapsulation
    // setters and getters
    public void setName(String dogName){
        name = dogName;

    }
    public void setBreed(String dogBreed){
        breed = dogBreed;

    }
    public void setSize(Integer dogSize){
        size = dogSize;
        
    }

    public String getName(){
        return name;

    }
    public String getBreed(){
        return breed;

    }
    public Integer getSize(){

        return size;
    }

    void bark(){


        try{

            if(size >= 25 ){
                System.out.println("RUFF RUFF RUFFF");
            }else if(size < 25) {

                System.out.println("ruff ruff ruff");
            }
        }catch (NullPointerException e){

            System.out.println("Ruff");
        }


    }
}
