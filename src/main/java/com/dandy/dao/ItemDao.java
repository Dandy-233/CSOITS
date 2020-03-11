package com.dandy.dao;

import com.dandy.model.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemDao {
    int addItem(Item item);

    List<Item> listAll();

    List<Item> pickItem(String text);
}
