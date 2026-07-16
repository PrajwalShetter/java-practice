package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import java.util.Comparator;

public class DroneCapacityComparator implements Comparator<DroneDto> {
    @Override
    public int compare(DroneDto o1, DroneDto o2) {
        return o1.getCapacity()-o2.getCapacity();
    }
}
