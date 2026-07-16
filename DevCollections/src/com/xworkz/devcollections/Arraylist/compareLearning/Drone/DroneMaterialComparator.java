package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import java.util.Comparator;

public class DroneMaterialComparator implements Comparator<DroneDto> {

    @Override
    public int compare(DroneDto o1, DroneDto o2) {
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}
