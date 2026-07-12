package com.xworkz.devcollections.linkedlist.countryInfo.dao.impl;

import com.xworkz.devcollections.linkedlist.countryInfo.constant.Continent;
import com.xworkz.devcollections.linkedlist.countryInfo.dao.CountryDao;
import com.xworkz.devcollections.linkedlist.countryInfo.dto.CountryDto;

import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl implements CountryDao {

    List<CountryDto> countries = new ArrayList<>();
    @Override
    public void add(CountryDto country) {
        countries.add(country);
    }

    @Override
    public void getAllCountryInfo() {
        for (CountryDto country : countries) {
            System.out.println(country);
            //System.out.println("[" + country.getCountryId() + " = " + country.getCountryName() + "]");
        }
    }

    @Override
    public void getCountriesByContinent(Continent continent) {
    for (CountryDto country : countries){
        if(country.getContinent().equals(continent)){
            System.out.println(country.getCountryName());
        }
    }
    }

    @Override
    public void getNoOfStatesByCountryName(String countryName) {
        if(countryName != null){
            for(CountryDto country : countries){
                if(country.getCountryName().equals(countryName)){
                    System.out.println(country.getNoOfState());
                }
            }
        }
    }

    @Override
    public double getAreaByCountryName(String countryName) {
        if(countryName != null){
            for(CountryDto country : countries){
                if(country.getCountryName().equals(countryName)){
                    return country.getAreaSqft();
                }
            }
        }
        return 0;
    }

    @Override
    public String getCountryCodeByCountryName(String countryName) {

        if(countryName != null){
            for (CountryDto country : countries){
                if(country.getCountryName().equals(countryName)){
                    return country.getCountryCode();
                }
            }
        }
        return "";
    }

    @Override
    public String getPrimeMinisterNameByCountryName(String countryName) {
        if(countryName != null){
            for(CountryDto country : countries){
                if(country.getCountryName().equals(countryName)){
                    return country.getPrimeMinister();
                }
            }
        }

        return "";
    }

    @Override
    public boolean updatePollutionByCountryCode(String countryCode) {
        boolean isPopulationUpdated=false;
        if(countryCode != null){
            for(CountryDto country : countries){
                if(country.getCountryCode().equals(countryCode)){
                     country.setPollution(120L);
                     isPopulationUpdated=true;
                }
            }
        }
        return isPopulationUpdated;
    }
}
