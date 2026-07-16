package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import java.util.Comparator;

public class DroneFlyDurationComparator implements Comparator<DroneDto> {

    @Override
    public int compare(DroneDto o1, DroneDto o2) {
        return Double.compare(o1.getFlyDuration(), o2.getFlyDuration());
    }
}
