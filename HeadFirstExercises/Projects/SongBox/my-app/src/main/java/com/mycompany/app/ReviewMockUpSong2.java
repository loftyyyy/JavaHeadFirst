package com.mycompany.app;

import java.util.ArrayList;

public class ReviewMockUpSong2 {

    public static ArrayList<ReviewSongs> getSongs(){
        ArrayList<ReviewSongs> initialSong = new ArrayList<>();
        initialSong.add(new ReviewSongs("M83", "Wait", 180));
        initialSong.add(new ReviewSongs("Radiohead", "No Surprises", 180));
        initialSong.add(new ReviewSongs("Don Tolver", "Bandit", 180));
        initialSong.add(new ReviewSongs("Tame Impala", "Let it happen", 180));



        return initialSong;
    }
}
