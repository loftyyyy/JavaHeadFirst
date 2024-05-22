package com.mycompany.app;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class ReviewJukeBox {

    public static void main(String[] args){
        ArrayList<ReviewSongs> songs = ReviewMockUpSong2.getSongs();
        ReviewSortByTitle sortTitle = new ReviewSortByTitle();
        ReviewCompareByArtist sortArtist = new ReviewCompareByArtist();
        songs.sort(sortArtist);

        for(ReviewSongs song: songs){
            System.out.println(song.getAuthor());
        }
    }
}
