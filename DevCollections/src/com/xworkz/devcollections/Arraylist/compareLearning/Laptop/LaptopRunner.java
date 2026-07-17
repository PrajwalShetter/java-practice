package com.xworkz.devcollections.Arraylist.compareLearning.Laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopRunner {

    public static void main(String[] args) {

        LaptopDto laptop1 = new LaptopDto(101, "Dell", "Intel i5", 8, 55000, false);
        LaptopDto laptop2 = new LaptopDto(102, "HP", "Intel i7", 16, 72000, false);
        LaptopDto laptop3 = new LaptopDto(103, "Lenovo", "Ryzen 5", 8, 58000, false);
        LaptopDto laptop4 = new LaptopDto(104, "Asus", "Ryzen 7", 16, 85000, true);
        LaptopDto laptop5 = new LaptopDto(105, "Acer", "Intel i9", 32, 98000, true);
        LaptopDto laptop6 = new LaptopDto(106, "Apple", "M2", 16, 135000, false);
        LaptopDto laptop7 = new LaptopDto(107, "MSI", "Intel i7", 32, 112000, true);
        LaptopDto laptop8 = new LaptopDto(108, "Samsung", "Intel i5", 8, 61000, false);
        LaptopDto laptop9 = new LaptopDto(109, "LG", "Ryzen 5", 16, 69000, false);


        List<LaptopDto> laptops = new ArrayList<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);

        System.out.println("without sort");
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }

        System.out.println("sort by Id(Comparable)");
        Collections.sort(laptops);
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }

        System.out.println("sort by Brand");
        Collections.sort(laptops, new LaptopBrandComparator());
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }

        System.out.println("sort by isGaming");
        Collections.sort(laptops, new LaptopIsGaming());
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }

        System.out.println("sort by Price");
        Collections.sort(laptops, new LaptopPriceComparator());
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }

        System.out.println("sort by Processor");
        Collections.sort(laptops, new LaptopProcessorComparator());
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }

        System.out.println("sort by Ram");
        Collections.sort(laptops, new LaptopRamComparator());
        for (LaptopDto laptop : laptops){
            System.out.println(laptop);
        }



    }
}
