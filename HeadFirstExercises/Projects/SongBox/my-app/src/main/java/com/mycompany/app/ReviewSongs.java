package com.mycompany.app;

public class ReviewSongs {
    private String author;
    private String title;

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    private String genre;
    private int year;

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


    public ReviewSongs(String title, String artist, String genre, int year, int bpm){
        this.title = title;
        this.author = artist;
        this.genre = genre;
        this.year = year;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return getAuthor() + ", " + getTitle() + ", " + getBpm();
    }

    // Compares the title if a duplicate
    @Override
    public boolean equals(Object obj) {
        ReviewSongs other = (ReviewSongs) obj;
        return title.equals(((ReviewSongs) obj).getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
