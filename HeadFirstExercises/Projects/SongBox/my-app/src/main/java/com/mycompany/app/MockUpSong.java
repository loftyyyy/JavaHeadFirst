package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class MockUpSong {

    private List<SongsV3> songList = getSongs();

    public static List<SongsV3> getSongs(){
        List<SongsV3> songs = new ArrayList<>();
        songs.add(new SongsV3("DNA", "Kendrick Lamar", 120));
        songs.add(new SongsV3("A lot", "21 Savage", 120));
        songs.add(new SongsV3("Pride", "Kendrick Lamar", 120));
        songs.add(new SongsV3("Prides", "Sabon", 220));

        return songs;

    }
}
