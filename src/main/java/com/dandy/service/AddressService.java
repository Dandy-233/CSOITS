package com.dandy.service;

import com.dandy.model.*;

import java.util.List;

public interface AddressService {
    List<Province> getAllProvince();

    List<City> getCities(int pid);

    List<District> getDistricts(int cid);

    List<Street> getStreets(int did);

    String getProvince(int pid);

    String getCity(int cid);

    String getDistrict(int did);

    String getStreet(int sid);

    List<Address> getAddress(int uid);

    int addAddress(Address address);

    Address findAddress(int aid);

    int editAddress(Address address);

    int remove(int aid);
}
