package com.mycompany.app;

import java.util.Comparator;

public class MockCompareByArtist implements Comparator<Songs> {

    public int compare(Songs o1, Songs o2){

        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
