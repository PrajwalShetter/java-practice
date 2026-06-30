package com.xworkz.devcollections.Arraylist.patientdetails;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor

public class Patient {

    private int patientId;
    private String PatientName;
    private String address;
    private  Gender gender;
    private  BloodGroup bloodGroup;
    private int age;

}
