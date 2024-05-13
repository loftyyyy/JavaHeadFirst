package com.mycompany.app;

import java.util.List;

public class TestJukeBox {


    public static void main(String[] args){

        List<Songs> currentAlbum = ReviewMockUpSong.getSongs();
        System.out.println(currentAlbum);


    }
}
