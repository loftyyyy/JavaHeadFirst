package com.mycompany.app;

import java.util.Comparator;

public class ReviewCompareByArtist implements Comparator<ReviewSongs> {

    @Override
    public int compare(ReviewSongs o1, ReviewSongs o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
