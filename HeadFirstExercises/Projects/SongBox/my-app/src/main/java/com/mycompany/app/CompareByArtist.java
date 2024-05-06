package com.mycompany.app;

import java.util.Comparator;

public class CompareByArtist implements Comparator<SongsV3> {

    public int compare(SongsV3 o, SongsV3 a){
        return o.getAuthor().compareTo(a.getAuthor());
    }
}

