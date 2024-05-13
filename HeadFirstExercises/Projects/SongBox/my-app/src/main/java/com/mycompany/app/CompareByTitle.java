package com.mycompany.app;

import java.util.Comparator;

public class CompareByTitle implements Comparator<SongsV3> {

    @Override
    public int compare(SongsV3 o1, SongsV3 o2) {
        return o1.getTitle().compareTo(o2.getTitle());

    }
}
