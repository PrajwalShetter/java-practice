package com.xworkz.devcollections.Arraylist.compareLearning.Laptop;

import java.util.Comparator;

public class LaptopProcessorComparator implements Comparator<LaptopDto> {

    @Override
    public int compare(LaptopDto o1, LaptopDto o2) {
        return o1.getProcessor().compareTo(o2.getProcessor());
    }
}
