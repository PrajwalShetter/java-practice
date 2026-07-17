package com.xworkz.devcollections.Arraylist.compareLearning.Flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightDto implements Comparable<FlightDto>{

    private int flightId;
    private String flightName;
    private String source;
    private String destination;
    private double ticketPrice;
    private boolean isInternational;

    @Override
    public int compareTo(FlightDto o) {
        return this.flightId-o.flightId;
    }
}
