package com.dandy.service;

import com.dandy.model.City;
import com.dandy.model.District;
import com.dandy.model.Province;
import com.dandy.model.Street;

import java.util.List;

public interface AddressService {
    List<Province> getAllProvince();

    List<City> getCities(int pid);

    List<District> getDistricts(int cid);

    List<Street> getStreets(int did);
}
