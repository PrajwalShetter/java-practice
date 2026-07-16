package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DroneDto implements Comparable<DroneDto>{

    private int droneId;
    private String Material;
    private int capacity;
    private double price;
    private String capturedQuality;
    private double flyDuration;
    private boolean isChargeable;



    @Override
    public int compareTo(DroneDto o) {
        return this.droneId-o.droneId;
    }
}
