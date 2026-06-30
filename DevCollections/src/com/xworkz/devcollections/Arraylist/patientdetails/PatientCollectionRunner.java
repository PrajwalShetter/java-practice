package com.xworkz.devcollections.Arraylist.patientdetails;

import java.util.ArrayList;
import java.util.List;

public class PatientCollectionRunner {

    public static void main(String[] args) {

        Patient patient1 = new Patient(01,"suraj","RR nagar",Gender.MALE,BloodGroup.APOSITIVE,22);
        Patient patient2 = new Patient(02,"Kiran","rajaji nagar",Gender.MALE,BloodGroup.BNEGATIVE,24);
        Patient patient3 = new Patient(03,"laxmi","jaya nagar",Gender.FEMALE,BloodGroup.BOMBYBLOODGROPU,18);
        Patient patient4 = new Patient(04,"prakruthi","BTM",Gender.FEMALE,BloodGroup.ONEGATIVE,28);

        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);

        for (Patient pt : patients){
            System.out.println(pt);
        }


    }
}
