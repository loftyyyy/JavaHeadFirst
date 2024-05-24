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
