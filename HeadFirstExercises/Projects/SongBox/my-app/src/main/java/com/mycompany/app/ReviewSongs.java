package com.mycompany.app;

public class ReviewSongs {
    private String author;
    private String title;

    private int bpm;
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getBpm() {
        return bpm;
    }


    public ReviewSongs(String a, String t, int b){
        this.author = a;
        this.title = t;
        this.bpm = b;
    }


}
