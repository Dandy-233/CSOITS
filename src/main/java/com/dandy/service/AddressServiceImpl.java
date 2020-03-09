package com.dandy.service;

import com.dandy.dao.AddressDao;
import com.dandy.model.City;
import com.dandy.model.District;
import com.dandy.model.Province;
import com.dandy.model.Street;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旦
 * @date 2020/3/9,15:56
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Resource
    private AddressDao addressDao;

    @Override
    public List<Province> getAllProvince() {
        return addressDao.getAllProvince();
    }

    @Override
    public List<City> getCities(int pid) {
        return addressDao.getCities(pid);
    }

    @Override
    public List<District> getDistricts(int cid) {
        return addressDao.getDistricts(cid);
    }

    @Override
    public List<Street> getStreets(int did) {
        return addressDao.getStreets(did);
    }
}
