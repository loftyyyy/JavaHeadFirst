package com.mycompany.app;

public class SongsV3 {

    private String title;
    private String author;
    private int bpm;

    public SongsV3(String title, String author, int bpm){
        this.title = title;
        this.author = author;
        this.bpm = bpm;

    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString(){
        return this.title ;
    }

}
