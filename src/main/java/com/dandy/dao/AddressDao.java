package com.dandy.dao;

import com.dandy.model.City;
import com.dandy.model.District;
import com.dandy.model.Province;
import com.dandy.model.Street;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressDao {
    List<Province> getAllProvince();

    List<City> getCities(int pid);

    List<District> getDistricts(int cid);

    List<Street> getStreets(int did);
}
