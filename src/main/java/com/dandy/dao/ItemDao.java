package com.dandy.dao;

import com.dandy.model.Item;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemDao {
    int addItem(Item item);
}
