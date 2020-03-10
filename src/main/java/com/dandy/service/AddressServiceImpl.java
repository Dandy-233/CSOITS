package com.dandy.service;

import com.dandy.dao.AddressDao;
import com.dandy.model.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public String getProvince(int pid) {
        return addressDao.getProvince(pid);
    }

    @Override
    public String getCity(int cid) {
        return addressDao.getCity(cid);
    }

    @Override
    public String getDistrict(int did) {
        return addressDao.getDistrict(did);
    }

    @Override
    public String getStreet(int sid) {
        return addressDao.getStreet(sid);
    }

    @Override
    public List<Address> getAddress(int uid) {
        return addressDao.getAddress(uid);
    }

    @Transactional
    @Override
    public int addAddress(Address address) {
        return addressDao.addAddress(address);
    }

    @Override
    public Address findAddress(int aid) {
        return addressDao.findAddress(aid);
    }

    @Transactional
    @Override
    public int editAddress(Address address) {
        return addressDao.editAddress(address);
    }
}
