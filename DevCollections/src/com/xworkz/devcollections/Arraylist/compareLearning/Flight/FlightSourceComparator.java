package com.xworkz.devcollections.Arraylist.compareLearning.Flight;

import java.util.Comparator;

public class FlightSourceComparator implements Comparator<FlightDto> {
    @Override
    public int compare(FlightDto o1, FlightDto o2) {
        return o1.getSource().compareTo(o2.getSource());
    }
}
