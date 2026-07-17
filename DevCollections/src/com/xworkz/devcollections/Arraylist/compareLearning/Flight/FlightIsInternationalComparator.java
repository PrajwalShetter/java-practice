package com.xworkz.devcollections.Arraylist.compareLearning.Flight;

import java.util.Comparator;

public class FlightIsInternationalComparator implements Comparator<FlightDto> {

    @Override
    public int compare(FlightDto o1, FlightDto o2) {
        return Boolean.compare(o1.isInternational(),o2.isInternational());
    }
}
