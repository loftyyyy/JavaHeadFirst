package com.mycompany.app;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class JukeBox {
    public static void main(String[] args){
        List<SongsV3> songsV3s = MockUpSong.getSongs();
        System.out.println("Original List: " + songsV3s);
        sort(songsV3s);
        System.out.println("After sort: " + songsV3s);

        CompareByArtist compareByArtist = new CompareByArtist();

        System.out.println("Original List: " + songsV3s);
        songsV3s.sort(compareByArtist);
        System.out.println("After sort: " + songsV3s);

    }
}
