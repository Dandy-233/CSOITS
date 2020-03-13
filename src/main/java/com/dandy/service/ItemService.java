package com.dandy.service;

import com.dandy.model.Item;

import java.util.List;

public interface ItemService {
    int addItem(Item item);

    List<Item> listAll();

    List<Item> pickItem(String text);

    Item getItemById(int iid);

    List<Item> getItemsBySid(int uid);

    int editItem(Item item);

    int remove(int iid);
}
