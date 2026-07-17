package com.xworkz.devcollections.Arraylist.compareLearning.Flight;

import java.util.Comparator;

public class FlightNameComparator implements Comparator<FlightDto> {

    @Override
    public int compare(FlightDto o1, FlightDto o2) {
        return o1.getFlightName().compareTo(o2.getFlightName());
    }
}
