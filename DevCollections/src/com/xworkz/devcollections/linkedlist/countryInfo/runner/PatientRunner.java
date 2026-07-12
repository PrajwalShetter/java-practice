package com.xworkz.devcollections.linkedlist.countryInfo.runner;

import com.xworkz.devcollections.linkedlist.countryInfo.dto.PatientDto;

import java.util.LinkedList;
import java.util.List;

public class PatientRunner {

    public static void main(String[] args) {

        PatientDto patientDto1 = new PatientDto("ravi",01,"banglurur",23);

        LinkedList<PatientDto> patientDtos = new LinkedList<>();

        patientDtos.offer(patientDto1)
;    }
}
