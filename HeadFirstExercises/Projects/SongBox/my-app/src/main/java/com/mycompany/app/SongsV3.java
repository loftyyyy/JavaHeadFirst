package com.mycompany.app;

public class SongsV3 implements Comparable<SongsV3>{

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
        return this.author;
    }


    public int compareTo(SongsV3 songsV3) {
        return title.compareTo(songsV3.getTitle());
    }
}
