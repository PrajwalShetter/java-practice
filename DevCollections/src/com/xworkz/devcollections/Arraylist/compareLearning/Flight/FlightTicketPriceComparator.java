package com.xworkz.devcollections.Arraylist.compareLearning.Flight;

import java.util.Comparator;

public class FlightTicketPriceComparator implements Comparator<FlightDto> {

    @Override
    public int compare(FlightDto o1, FlightDto o2) {
        return Double.compare(o1.getTicketPrice(), o2.getTicketPrice());
    }
}
