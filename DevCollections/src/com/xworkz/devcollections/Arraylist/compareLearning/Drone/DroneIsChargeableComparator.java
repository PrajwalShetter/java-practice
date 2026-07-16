package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import com.xworkz.devcollections.Arraylist.compareLearning.Book.BookDto;

import java.util.Comparator;

public class DroneIsChargeableComparator implements Comparator<DroneDto> {

    @Override
    public int compare(DroneDto o1, DroneDto o2) {
        return Boolean.compare(o1.isChargeable(),o2.isChargeable());
    }
}
