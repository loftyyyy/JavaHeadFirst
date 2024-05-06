package com.mycompany.app;

import java.util.Collections;
import java.util.List;

public class JukeBox {
    public static void main(String[] args){
        List<SongsV3> songsV3s = MockUpSong.getSongs();
        for(SongsV3 songs: songsV3s){
            System.out.println(songs.getTitle());
        }
        System.out.println(songsV3s);
        Collections.sort(songsV3s);
        System.out.println(songsV3s);

    }
}
