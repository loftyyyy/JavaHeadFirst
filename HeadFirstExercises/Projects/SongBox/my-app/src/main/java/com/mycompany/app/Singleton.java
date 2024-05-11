package com.mycompany.app;

public class Singleton {

    private static Singleton instance;
    private String data;

    private Singleton(String data){
        this.data = data;
    }

    public Singleton getInstance(String data){

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton(data);

                }
            }
        }
        return instance;
        //TODO Damn I'm so tired like what the fuck is going on?
    }
}
