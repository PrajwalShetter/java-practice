package com.xworkz.devcollections.Arraylist.compareLearning.Drone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DroneRunner {
    public static void main(String[] args) {

        DroneDto Drone1 = new DroneDto(1,"Plastic",200,2500,"1080p",3.5,true);
        DroneDto Drone2 = new DroneDto(2,"Steel",1000,5000,"4k",4,true);
        DroneDto Drone3 = new DroneDto(3,"Fiber",500,3000,"720",3,false);
        DroneDto Drone4 = new DroneDto(4,"Silicon",300,2000,"1080p",2,false);
        DroneDto Drone5 = new DroneDto(5,"Iron",4000,8000,"420p",8,true);
        DroneDto Drone6 = new DroneDto(6,"MicroFiber",2000,4000,"1080p",5,false);
        DroneDto Drone7 = new DroneDto(7,"Powder",100,1000,"420",3,true);
        DroneDto Drone8 = new DroneDto(8,"Cement",3000,2800,"720p",2,false);

        List<DroneDto> drones = new ArrayList<>();
        drones.add(Drone1);
        drones.add(Drone2);
        drones.add(Drone3);
        drones.add(Drone4);
        drones.add(Drone5);
        drones.add(Drone6);
        drones.add(Drone7);
        drones.add(Drone8);

        System.out.println("Without sort");
        for(DroneDto drone : drones){
            System.out.println(drone);
        }

        Collections.sort(drones);
        System.out.println("Sort by id(Comparable)");
        for (DroneDto drone : drones){
            System.out.println(drone);
        }

        Collections.sort(drones,new DroneMaterialComparator());
        System.out.println("Sort by Material(Comparator)");
        for (DroneDto drone : drones){
            System.out.println(drone);
        }

        Collections.sort(drones,new DroneCapacityComparator());
        System.out.println("Sort by Capacity(Comparator)");
        for (DroneDto drone : drones){
            System.out.println(drone);
        }


        Collections.sort(drones, new DronePriceComparator());
        System.out.println("Sort by price(Comparator)");
        for (DroneDto drone : drones){
            System.out.println(drone);
        }

        Collections.sort(drones, new DroneFlyDurationComparator());
        System.out.println("Sort by FlyDuration");
        for (DroneDto drone : drones){
            System.out.println(drone);
        }

        Collections.sort(drones, new DroneIsChargeableComparator());
        System.out.println("Sort by isChargeable");
        for (DroneDto drone : drones){
            System.out.println(drone);
        }


    }
}
