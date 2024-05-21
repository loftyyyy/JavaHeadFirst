package com.mycompany.app;

import java.util.Comparator;

public class ReviewSortByTitle implements Comparator<ReviewSongs> {

    @Override
    public int compare(ReviewSongs o1, ReviewSongs o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
