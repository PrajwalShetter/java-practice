package com.xworkz.devcollections.map.runner;

import com.xworkz.devcollections.Arraylist.patientdetails.BloodGroup;
import com.xworkz.devcollections.Arraylist.patientdetails.Gender;
import com.xworkz.devcollections.Arraylist.patientdetails.Patient;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {
    public static void main(String[] args) {

        Map<Integer, String> countries = new HashMap<>();

        Map<Integer,Patient> patients = new HashMap<>();

        Patient patient3 = new Patient(03,"laxmi","jaya nagar", Gender.FEMALE, BloodGroup.BOMBYBLOODGROPU,18);
        Patient patient1 = new Patient(01,"suraj","RR nagar",Gender.MALE,BloodGroup.APOSITIVE,22);
        Patient patient2 = new Patient(02,"Kiran","rajaji nagar",Gender.MALE,BloodGroup.BNEGATIVE,24);
        Patient patient4 = new Patient(04,"prakruthi","BTM",Gender.FEMALE,BloodGroup.ONEGATIVE,28);


        countries.put(1,"India");
        countries.put(2,"Austrlia");
        countries.put(3,"Russia");
        countries.put(4,"India");
        System.out.println(countries);


        Map<String, Integer> map = new HashMap<>();
        map.put("prajwal", 1);
        map.put("kiran", 6);
        map.put("kalmesh", 8);
        map.put("manoj", 10);

        patients.put(1,patient1);
        patients.put(2,patient2);
        patients.put(3,patient3);
        patients.put(4,patient4);


        System.out.println(map.get("kiran"));
        System.out.println(map);
        map.remove("prajwal");
        System.out.println(map);
        System.out.println(map.size());

        map.replace("kalmesh", 8,12);
        System.out.println(map);

        map.putIfAbsent("kiran",34);
        System.out.println(map);

        System.out.println("fetching both key and value pair at once using entry");
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        map.forEach((s,i)-> System.out.println(s+ " "+i));

        System.out.println("fetching both key and value pair at once using entry");
        Set<Map.Entry<Integer,Patient>> entries1 = patients.entrySet();
        for(Map.Entry<Integer,Patient> entry:entries1){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        patients.forEach((i,p)-> System.out.println(i+ " "+p));











    }
}
