package com.xworkz.devcollections.Arraylist.compareLearning.Movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto implements Comparable<MovieDto>{

        private int movieId;
        private String movieName;
        private String heroName;
        private double rating;
        private int duration;
        private boolean isPanIndia;


    @Override
    public int compareTo(MovieDto o) {
        return this.movieId-o.movieId;
    }
}
