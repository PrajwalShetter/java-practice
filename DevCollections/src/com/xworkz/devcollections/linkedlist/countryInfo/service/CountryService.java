package com.xworkz.devcollections.linkedlist.countryInfo.service;

import com.xworkz.devcollections.linkedlist.countryInfo.constant.Continent;
import com.xworkz.devcollections.linkedlist.countryInfo.dto.CountryDto;

public interface CountryService {

    void add(CountryDto country);

     void getAllCountryInfo();

     void getCountriesByContinent(Continent continent);
     void getNoOfStatesByCountryName(String countryName);

     double getAreaByCountryName(String countryName);

     String getCountryCodeByCountryName(String countryName);

     String getPrimeMinisterNameByCountryName(String countryName);

     boolean updatePollutionByCountryCode(String countryCode);
}
