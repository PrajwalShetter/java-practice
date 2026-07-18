package com.xworkz.devcollections.Arraylist.compareLearning.Movie;

import java.util.Comparator;

public class MovieHeroNameComparator implements Comparator<MovieDto> {

    @Override
    public int compare(MovieDto o1, MovieDto o2) {
        return o1.getHeroName().compareTo(o2.getHeroName());
    }
}
