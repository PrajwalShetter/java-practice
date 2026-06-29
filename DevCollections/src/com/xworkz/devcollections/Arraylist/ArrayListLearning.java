package com.xworkz.devcollections.Arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListLearning {

    public static void main(String[] args) {

        Collection ref = new ArrayList<>();

        ref.add("India");
        ref.add("London");
        ref.add("Paris");
        ref.add("Maldives");
        ref.add("Thailand");

        System.out.println(ref);

        int size=ref.size();
        System.out.println("size of ref :"+size);

        boolean isEmpty= ref.isEmpty();
        System.out.println(isEmpty);

        Collection anotherRef = new ArrayList<>();
        anotherRef.add("Russia");
        anotherRef.add("North Korea");
        anotherRef.add("USA");
        anotherRef.add("Africa");

        System.out.println(anotherRef);

        ref.addAll(anotherRef);
        System.out.println(ref);

       // ref.clear(); // it has no ref
        //System.out.println(ref);

        ref.remove("North Korea");
        System.out.println(ref);
        ref.removeAll(anotherRef); // the difference between clearAll and removeAll is remove needs reference and clear just a function
        System.out.println(ref);

        boolean contain =ref.contains("Thailand");
        System.out.println(contain);

        boolean contain1 =ref.containsAll(anotherRef);
        System.out.println(contain1);

        //check with condition like alphabetic wise
        for(Object obj : ref){
            String country =(String) obj;
            if(country.startsWith("T")){
                System.out.println(country);
            }



        }



    }
}
