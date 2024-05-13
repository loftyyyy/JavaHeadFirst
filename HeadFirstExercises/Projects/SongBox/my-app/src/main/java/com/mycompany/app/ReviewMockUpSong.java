package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class ReviewMockUpSong {

    public static List<Songs> getSongs(){
        List<Songs> songsList = new ArrayList<>();

        songsList.add(new Songs("N.h.i.e","21 Savage"));
        songsList.add(new Songs("Aces x DNA", "Kendrick Lamar"));
        songsList.add(new Songs("I smoked away my brain", "Travis Scott"));
        songsList.add(new Songs("Go all the way","Charles Bukowski"));


        return songsList;

    }
}
