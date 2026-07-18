package com.xworkz.devcollections.Arraylist.compareLearning.Laptop;

import java.util.Comparator;

public class LaptopIsGaming implements Comparator<LaptopDto> {
    @Override
    public int compare(LaptopDto o1, LaptopDto o2) {
        return Boolean.compare(o1.isGaming(),o2.isGaming());
    }
}
