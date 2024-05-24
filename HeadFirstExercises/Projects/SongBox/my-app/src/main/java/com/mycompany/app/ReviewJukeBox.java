package com.mycompany.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static java.util.Collections.sort;

public class ReviewJukeBox {

    public static void main(String[] args){
        ArrayList<ReviewSongs> songs = ReviewMockUpSong2.getSongs();
        ReviewSortByTitle sortTitle = new ReviewSortByTitle();
        ReviewSortByTitle sortByTitle2 = sortTitle;
        System.out.println(sortTitle.equals(sortByTitle2));
        System.out.println(sortTitle.hashCode() + " == " + sortByTitle2.hashCode());

        ReviewCompareByArtist sortArtist = new ReviewCompareByArtist();
        //Lambda's
        songs.sort((o1, o2) -> Integer.compare(o1.getBpm(), o2.getBpm()));

        System.out.println(songs);

        Set<ReviewSongs> songSet = new HashSet<>(songs);

        System.out.println(songSet);



    }
}
