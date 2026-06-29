package com.xworkz.devcollections.Arraylist;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ArrayListLearning2 {

    public static void main(String[] args) {

        List cityList = new ArrayList();

        cityList.add("Koppal");
        cityList.add("Gadag");
        cityList.add("hubli");
        cityList.add("Belgavi");
        System.out.println(cityList);

        cityList.add(2, "kushtagi");
        cityList.add(5, "hospet");
        System.out.println(cityList);

        List place= new ArrayList<>();
        place.add("davangerei");
        place.add("bidar");
        System.out.println(place);

        cityList.addAll(place);
        System.out.println(cityList);

        cityList.addAll(3,place);
        System.out.println(cityList);

        System.out.println(cityList);


    }
}
