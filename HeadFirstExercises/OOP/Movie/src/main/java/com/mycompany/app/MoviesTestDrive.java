
package com.mycompany.app;

public class MoviesTestDrive{

    public static void main(String[] args){

        Movies movie = new Movies();

        movie.title = "Interstellar";
        movie.genre = "Science Fiction";
        movie.rating = 10;
        movie.playIt();

        System.out.println(movie.title);
    }
}
