package com.xworkz.devcollections.Arraylist.compareLearning.Laptop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class LaptopDto implements Comparable<LaptopDto>{

    private int laptopId;
    private String brand;
    private String processor;
    private int ram;
    private double price;
    private boolean isGaming;

    @Override
    public int compareTo(LaptopDto o) {
        return this.laptopId-o.laptopId;
    }
}
