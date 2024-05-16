package com.mycompany.app;

import java.util.List;

import static java.util.Collections.sort;

public class JukeBox {
    public static void main(String[] args){
        List<SongsV3> songsV3s = MockUpSong.getSongs();
        CompareByArtist compareByArtist = new CompareByArtist();
        CompareByTitle compareByTitle = new CompareByTitle();



        System.out.println("Before sort: ");
        for(SongsV3 s : songsV3s){
            System.out.println(s.getTitle());
        }
        songsV3s.sort(compareByTitle);
        System.out.println("After sort: ");
        for(SongsV3 s : songsV3s){
            System.out.println(s.getTitle());
        }


        //TODO Study comparable and comparators
        // it is kind of duumb and confusing but we'll get through this
        // Sucks to be me right now but I'm hard grinding calculus right now so I'm not able to take part in this
    }
}
