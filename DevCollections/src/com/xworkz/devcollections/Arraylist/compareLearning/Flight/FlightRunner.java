package com.xworkz.devcollections.Arraylist.compareLearning.Flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightRunner {

    public static void main(String[] args) {

        FlightDto flight1 = new FlightDto(101, "IndiGo", "Bengaluru", "Delhi", 6200, false);
        FlightDto flight2 = new FlightDto(102, "Air India", "Mumbai", "Dubai", 28500, true);
        FlightDto flight3 = new FlightDto(103, "SpiceJet", "Chennai", "Hyderabad", 4500, false);
        FlightDto flight4 = new FlightDto(104, "Emirates", "Bengaluru", "London", 78000, true);
        FlightDto flight5 = new FlightDto(105, "Akasa Air", "Pune", "Goa", 3500, false);
        FlightDto flight6 = new FlightDto(106, "Qatar Airways", "Delhi", "Doha", 46500, true);
        FlightDto flight7 = new FlightDto(107, "Vistara", "Kolkata", "Mumbai", 7100, false);
        FlightDto flight8 = new FlightDto(108, "Singapore Airlines", "Chennai", "Singapore", 39500, true);
        FlightDto flight9 = new FlightDto(109, "AirAsia", "Kochi", "Bangkok", 24500, true);


        List<FlightDto> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);
        flights.add(flight4);
        flights.add(flight5);
        flights.add(flight6);
        flights.add(flight7);
        flights.add(flight8);
        flights.add(flight9);


        System.out.println("without sort");
        for(FlightDto flight : flights){
            System.out.println(flight);
        }

        System.out.println("sort by id(Comparable)");
        Collections.sort(flights);
        for(FlightDto flight : flights){
            System.out.println(flight);
        }

        System.out.println("sort by Destination");
        Collections.sort(flights, new FlightDestinationComparator());
        for(FlightDto flight : flights){
            System.out.println(flight);
        }

        System.out.println("sort by isInternational");
        Collections.sort(flights, new FlightIsInternationalComparator());
        for(FlightDto flight : flights){
            System.out.println(flight);
        }

        System.out.println("sort by name");
        Collections.sort(flights, new FlightNameComparator());
        for(FlightDto flight : flights){
            System.out.println(flight);
        }

        System.out.println("sort by source");
        Collections.sort(flights, new FlightSourceComparator());
        for(FlightDto flight : flights){
            System.out.println(flight);
        }

        System.out.println("sort by id(Comparable)");
        Collections.sort(flights, new FlightTicketPriceComparator());
        for(FlightDto flight : flights){
            System.out.println(flight);
        }



    }
}
