package com.xworkz.devcollections.Arraylist.compareLearning.Movie;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<MovieDto> {

    @Override
    public int compare(MovieDto o1, MovieDto o2) {
        return Double.compare(o1.getRating(), o2.getRating());
    }
}
