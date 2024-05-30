package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class ReviewMockUpSong2 {

    public static List<ReviewSongs> getSongs(){
        return  List.of(
                new ReviewSongs("$10", "Hitchhiker", "Electronic", 2016, 183),
                new ReviewSongs("Havana", "Camila Cabello", "R&B", 2017, 324),
                new ReviewSongs("Cassidy", "Grateful Dead", "Rock", 1972, 123),
                new ReviewSongs("50 ways", "Paul Simon", "Soft Rock", 1975, 199),
                new ReviewSongs("Hurt", "Nine Inch Nails", "Industrial Rock", 1995, 257),
                new ReviewSongs("Silence", "Delerium", "Electronic", 1999, 134),
                new ReviewSongs("Hurt", "Johnny Cash", "Soft Rock", 2002, 392),
                new ReviewSongs("Watercolour", "Pendulum", "Electronic", 2010, 155),
                new ReviewSongs("The Outsider", "A Perfect Circle", "Alternative Rock", 2004, 312),
                new ReviewSongs("With a Little Help from My Friends", "The Beatles", "Rock", 1967, 168),
                new ReviewSongs("Come Together", "The Beatles", "Blues rock", 1968, 173),
                new ReviewSongs("Come Together", "Ike & Tina Turner", "Rock", 1970, 165),
                new ReviewSongs("With a Little Help from My Friends", "Joe Cocker", "Rock", 1968, 46),
                new ReviewSongs("Immigrant Song", "Karen O", "Industrial Rock", 2011, 12),
                new ReviewSongs("Breathe", "The Prodigy", "Electronic", 1996, 337),
                new ReviewSongs("What's Going On", "Gaye", "R&B", 1971, 420),
                new ReviewSongs("Hallucinate", "Dua Lipa", "Pop", 2020, 75),
                new ReviewSongs("Walk Me Home", "P!nk", "Pop", 2019, 459),
                new ReviewSongs("I am not a woman, I'm a god", "Halsey", "Alternative Rock", 2021, 384),
                new ReviewSongs("Pasos de cero", "Pablo Alborán", "Latin", 2014, 117),
                new ReviewSongs("Smooth", "Santana", "Latin", 1999, 244),
                new ReviewSongs("Immigrant song", "Led Zeppelin", "Rock", 1970, 484));    }

}
