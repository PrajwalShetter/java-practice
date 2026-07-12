package com.xworkz.devcollections.linkedlist.countryInfo.service.impl;

import com.xworkz.devcollections.linkedlist.countryInfo.constant.Continent;
import com.xworkz.devcollections.linkedlist.countryInfo.dao.CountryDao;
import com.xworkz.devcollections.linkedlist.countryInfo.dao.impl.CountryDaoImpl;
import com.xworkz.devcollections.linkedlist.countryInfo.dto.CountryDto;
import com.xworkz.devcollections.linkedlist.countryInfo.service.CountryService;

public class CountryServiceImpl implements CountryService {

    CountryDao dao = new CountryDaoImpl();

    @Override
    public void add(CountryDto country) {

        if(country != null){
            if(country.getCountryId() >0 && country.getCountryName() != null && country.getCountryCode() != null
            && country.getContinent() != null && country.getPollution() >0 && country.getAreaSqft() >0 &&
            country.getNoOfState() >0 && country.getPrimeMinister() != null){
                dao.add(country);
            }
            else{
                System.out.println("validations are failed");
            }
        }
        else{
            System.out.println("country could not be null");
        }


    }

    @Override
    public void getAllCountryInfo() {
        dao.getAllCountryInfo();
    }

    @Override
    public void getCountriesByContinent(Continent continent) {
        dao.getCountriesByContinent(continent);
    }

    @Override
    public void getNoOfStatesByCountryName(String countryName) {
        dao.getNoOfStatesByCountryName(countryName);
    }

    @Override
    public double getAreaByCountryName(String countryName) {
        return dao.getAreaByCountryName(countryName);
    }

    public String getCountryCodeByCountryName(String countryName){
        return dao.getCountryCodeByCountryName(countryName);
    }

    @Override
    public String getPrimeMinisterNameByCountryName(String countryName) {
        return dao.getPrimeMinisterNameByCountryName(countryName);
    }

    @Override
    public boolean updatePollutionByCountryCode(String countryCode) {
        return dao.updatePollutionByCountryCode(countryCode);
    }
}
