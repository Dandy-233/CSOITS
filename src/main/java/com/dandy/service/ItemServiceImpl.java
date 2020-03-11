package com.dandy.service;

import com.dandy.dao.ItemDao;
import com.dandy.model.Item;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旦
 * @date 2020/3/4,16:55
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemDao itemDao;

    @Transactional
    @Override
    public int addItem(Item item) {
        return itemDao.addItem(item);
    }

    @Override
    public List<Item> listAll() {
        return itemDao.listAll();
    }

    @Override
    public List<Item> pickItem(String text) {
        return itemDao.pickItem(text);
    }
}
