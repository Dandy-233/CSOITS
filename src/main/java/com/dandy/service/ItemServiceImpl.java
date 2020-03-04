package com.dandy.service;

import com.dandy.dao.ItemDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 李旦
 * @date 2020/3/4,16:55
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemDao itemDao;
}
