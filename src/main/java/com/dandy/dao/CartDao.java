package com.dandy.dao;

import com.dandy.model.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartDao {
    int addCart(Cart cart);

    int plusCart(Cart cart);

    List<Cart> getCartList(int uid);
}
