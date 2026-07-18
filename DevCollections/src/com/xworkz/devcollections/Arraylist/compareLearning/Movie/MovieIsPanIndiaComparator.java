package com.xworkz.devcollections.Arraylist.compareLearning.Movie;

import java.util.Comparator;

public class MovieIsPanIndiaComparator implements Comparator<MovieDto> {

    @Override
    public int compare(MovieDto o1, MovieDto o2) {
        return Boolean.compare(o1.isPanIndia(),o2.isPanIndia());
    }
}
