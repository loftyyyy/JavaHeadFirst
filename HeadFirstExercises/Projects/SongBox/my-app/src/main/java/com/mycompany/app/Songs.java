package com.mycompany.app;

public class Songs {
    private String title;
    private String author;

    public Songs(String title, String author){
        this.title = title;
        this.author = author;

    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return this.author;
    }
}
