package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import java.util.Comparator;

public class DronePriceComparator implements Comparator<DroneDto> {
    @Override
    public int compare(DroneDto o1, DroneDto o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
