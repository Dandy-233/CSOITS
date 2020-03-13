package com.dandy.service;

import com.dandy.model.Cart;

import java.util.List;

public interface CartService {
    int addCart(Cart cart);

    List<Cart> getCartList(int uid);
}
