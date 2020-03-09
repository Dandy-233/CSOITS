package com.dandy.controller;

import com.dandy.model.City;
import com.dandy.model.District;
import com.dandy.model.Province;
import com.dandy.model.Street;
import com.dandy.service.AddressService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旦
 * @date 2020/3/9,15:37
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @Resource
    private AddressService addressService;

    public static final Logger log = LoggerFactory.getLogger(AddressController.class);

    /**
     * 获取所有省份
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getP",method = RequestMethod.POST)
    public String getP(){
        List<Province> provinces = addressService.getAllProvince();
        String json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(provinces);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    /**
     * 获取对应市
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getC",method = RequestMethod.POST)
    public String getC(int pid){
        List<City> cities = addressService.getCities(pid);
        String json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(cities);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    /**
     * 获取对应区/县
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getD",method = RequestMethod.POST)
    public String getD(int cid){
        List<District> districts = addressService.getDistricts(cid);
        String json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(districts);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    /**
     * 获取对应街道/乡/镇
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getS",method = RequestMethod.POST)
    public String getS(int did){
        List<Street> streets = addressService.getStreets(did);
        String json = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(streets);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
