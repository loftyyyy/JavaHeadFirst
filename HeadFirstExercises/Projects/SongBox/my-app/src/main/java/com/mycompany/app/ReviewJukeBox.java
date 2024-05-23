package com.mycompany.app;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ReviewJukeBox {

    public static void main(String[] args){
        ArrayList<ReviewSongs> songs = ReviewMockUpSong2.getSongs();
        ReviewSortByTitle sortTitle = new ReviewSortByTitle();
        ReviewCompareByArtist sortArtist = new ReviewCompareByArtist();
        //Lambda's
        songs.sort((o1, o2) -> o1.getAuthor().compareTo(o2.getAuthor()));

        for(ReviewSongs song: songs){
            System.out.println(song.getAuthor());
        }
    }
}
