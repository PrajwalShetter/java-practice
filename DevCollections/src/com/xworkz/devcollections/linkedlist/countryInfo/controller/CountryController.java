package com.xworkz.devcollections.linkedlist.countryInfo.controller;

import com.xworkz.devcollections.linkedlist.countryInfo.constant.Continent;
import com.xworkz.devcollections.linkedlist.countryInfo.dto.CountryDto;
import com.xworkz.devcollections.linkedlist.countryInfo.service.CountryService;
import com.xworkz.devcollections.linkedlist.countryInfo.service.impl.CountryServiceImpl;

public class CountryController {

    CountryService service = new CountryServiceImpl();

    public void add(CountryDto country){
        service.add(country);
    }

    public void getAllCountryInfo(){
        service.getAllCountryInfo();
    }

    public void getCountriesByContinent(Continent continent){
        service.getCountriesByContinent(continent);
    }

    public void getNoOfStatesByCountryName(String countryName){
        service.getNoOfStatesByCountryName(countryName);
    }

    public double getAreaByCountryName(String countryName){
        return service.getAreaByCountryName(countryName);
    }

    public String getCountryCodeByCountryName(String countryName){
        return service.getCountryCodeByCountryName(countryName);
    }

    public String getPrimeMinisterNameByCountryName(String countryName){
        return service.getPrimeMinisterNameByCountryName(countryName);
    }

    public boolean updatePollutionByCountryCode(String countryCode){
        return service.updatePollutionByCountryCode(countryCode);
    }

}
