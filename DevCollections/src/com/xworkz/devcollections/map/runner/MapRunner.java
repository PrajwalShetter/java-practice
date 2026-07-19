package com.xworkz.devcollections.map.runner;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {

        Map<Integer, String> countries = new HashMap<>();

        countries.put(1,"India");
        countries.put(2,"Austrlia");
        countries.put(3,"Russia");
        countries.put(4,"India");
        System.out.println(countries);


        Map<String, Integer> map = new HashMap<>();
        map.put("prajwal", 1);
        map.put("kiran", 6);
        map.put("kalmesh", 8);
        map.put("manoj", 10);

        System.out.println(map.get("kiran"));
        System.out.println(map);
        map.remove("prajwal");
        System.out.println(map);
        System.out.println(map.size());

        map.replace("kalmesh", 8,12);
        System.out.println(map);

        map.putIfAbsent("kiran",34);
        System.out.println(map);





    }
}
