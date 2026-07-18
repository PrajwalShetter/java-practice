package com.xworkz.devcollections.Arraylist.compareLearning.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MovieRunner {
    public static void main(String[] args) {

        MovieDto movie1 = new MovieDto(101, "KGF", "Yash", 9.4, 168, true);
        MovieDto movie2 = new MovieDto(102, "Kantara", "Rishab Shetty", 9.3, 150, true);
        MovieDto movie3 = new MovieDto(103, "Charlie 777", "Rakshit Shetty", 8.9, 164, false);
        MovieDto movie4 = new MovieDto(104, "Salaar", "Prabhas", 8.7, 175, true);
        MovieDto movie5 = new MovieDto(105, "Pushpa", "Allu Arjun", 8.8, 179, true);
        MovieDto movie6 = new MovieDto(106, "Mungaru Male", "Ganesh", 8.5, 143, false);
        MovieDto movie7 = new MovieDto(107, "Kirik Party", "Rakshit Shetty", 9.0, 165, false);
        MovieDto movie8 = new MovieDto(108, "Vikrant Rona", "Kichcha Sudeep", 8.2, 147, true);
        MovieDto movie9 = new MovieDto(109, "Kaatera", "Darshan", 8.4, 183, false);


        List<MovieDto> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);


        System.out.println("Sort without");
        for (MovieDto movie : movies){
            System.out.println(movie);
        }

        System.out.println("sort by id(Comparable)");
        Collections.sort(movies);
        for(MovieDto movie : movies){
            System.out.println(movie);
        }

        System.out.println("sort by Name");
        Collections.sort(movies, new MovieNameComparator());
        for(MovieDto movie : movies){
            System.out.println(movie);
        }

        System.out.println("sort by HeroName");
        Collections.sort(movies, new MovieHeroNameComparator());
        for(MovieDto movie : movies){
            System.out.println(movie);
        }

        System.out.println("sort by Duration");
        Collections.sort(movies, new MovieDurationComparator());
        for(MovieDto movie : movies){
            System.out.println(movie);
        }

        System.out.println("sort by rating");
        Collections.sort(movies, new MovieRatingComparator());
        for(MovieDto movie : movies){
            System.out.println(movie);
        }

        System.out.println("sort by isPanIndia");
        Collections.sort(movies,new MovieIsPanIndiaComparator());
        for(MovieDto movie : movies){
            System.out.println(movie);
        }

        


    }
}
