package com.mycompany.app;

import java.util.List;

import static java.util.Collections.sort;

public class TestJukeBox {

    public static void main(String[] args){
        MockCompareByTitle ct = new MockCompareByTitle();
        MockCompareByArtist ca = new MockCompareByArtist();

        List<Songs> currentAlbum = ReviewMockUpSong.getSongs();
        for(Songs s : currentAlbum){
            System.out.println(s.getTitle());
        }
        System.out.println("After sort: ");
        sort(currentAlbum,ct);

//        System.out.println(currentAlbum);
        for(Songs s : currentAlbum){
            System.out.println(s.getTitle());
        }

    }
}
