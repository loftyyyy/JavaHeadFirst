package com.mycompany.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Collections.sort;

public class ReviewJukeBox {

    public static void main(String[] args){
        String s1 = "hi";
        String s2 = new String("hi");
        System.out.println(s1.equals(s2));
        ArrayList<ReviewSongs> songs = ReviewMockUpSong2.getSongs();
        ReviewSortByTitle sortTitle = new ReviewSortByTitle();

        ReviewCompareByArtist sortArtist = new ReviewCompareByArtist();
        //Lambda's
        songs.sort((o1, o2) -> Integer.compare(o1.getBpm(), o2.getBpm()));

        System.out.println(songs);

        Set<ReviewSongs> songSet = new HashSet<>(songs);
        Set<ReviewSongs> songTreeSet = new TreeSet<>((o1, o2) -> Integer.compare(o2.getBpm(), o1.getBpm()));
        songTreeSet.addAll(songs);

        System.out.println(songTreeSet);
        System.out.println(songSet);



    }
}