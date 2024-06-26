package com.mycompany.app;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Collections.sort;

public class ReviewJukeBox {

    public static void main(String[] args){
        String s1 = "hi";
        String s2 = new String("hi");
        System.out.println(s1.equals(s2));
        List<ReviewSongs> songs = ReviewMockUpSong2.getSongs();
        ReviewSortByTitle sortTitle = new ReviewSortByTitle();

        ReviewCompareByArtist sortArtist = new ReviewCompareByArtist();
        //Lambda's
//        songs.sort((o1, o2) -> Integer.compare(o1.getBpm(), o2.getBpm()));

//        System.out.println(songs);
//
//        Set<ReviewSongs> songSet = new HashSet<>(songs);
//        Set<ReviewSongs> songTreeSet = new TreeSet<>((o1, o2) -> Integer.compare(o2.getBpm(), o1.getBpm()));
//        Map<String, ReviewSongs> hashMap = new HashMap();
//        songTreeSet.addAll(songs);
//
//        System.out.println(songTreeSet);
//        System.out.println(songSet);
//        System.out.println(hashMap);
//
//        Stream<ReviewSongs> setStream = songSet.stream();
//        Stream<ReviewSongs> treeSetStream = songTreeSet.stream();
//        Stream<ReviewSongs> mapStream = hashMap.values().stream();
//
//        Stream<ReviewSongs> limit = treeSetStream.limit(2);
//
//        System.out.println("Set: " + setStream + " " + "TreeSet: " + treeSetStream + " " + "mapStream: " + mapStream);
//        System.out.println("Set Limit: " +  limit);
//
//        List<ReviewSongs> newSong = limit.toList();
//        newSong.forEach(song -> System.out.println(song));
//
//        List<Integer> intnumber = List.of(1,2,3,4,5);
//        List<Integer> numbers = intnumber.stream().filter(n -> n % 2 != 0).toList();
//        System.out.println(numbers);

//        System.out.println(songs.stream().filter(o1 -> o1.getTitle().startsWith("H")).toList());
//        System.out.println(songs.stream().filter(year -> year.getYear() > 1995).toList());

//        System.out.println(songs.stream().map(x -> x.getGenre()).distinct().toList());
        System.out.println(songs.stream().filter(song -> song.getTitle().equals("With a Little Help from My Friends")).toList());
//        System.out.println(songs.stream().filter(song -> song.getTitle().equals("With a Little Help from My Friends")).map(song -> song.getAuthor()).filter(author -> !author.equals("The Beatles")).count());
    }
}
