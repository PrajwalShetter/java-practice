package com.xworkz.devcollections.linkedlist.countryInfo.dto;

import com.xworkz.devcollections.linkedlist.countryInfo.constant.Continent;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class CountryDto {
        private int countryId;
        private String countryName;
        private  String primeMinister;
        private Continent continent;
        private long pollution;
        private double areaSqft;
        private int noOfState;
        private String countryCode;
    }

