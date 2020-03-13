package com.dandy.service;

import com.dandy.dao.CartDao;
import com.dandy.model.Cart;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旦
 * @date 2020/3/13,11:06
 */
@Service
public class CartServiceImpl implements CartService{

    @Resource
    private CartDao cartDao;

    @Transactional
    @Override
    public int addCart(Cart cart) {
        List<Cart> carts = cartDao.getCartList(cart.getUid());
        int count=0;
        for (Cart cart1:carts){
            if (cart.getIid()==cart1.getIid()){
                count=1;
                cart.setCnum(cart.getCnum()+cart1.getCnum());
            }
        }
        if (count>0){
            return cartDao.plusCart(cart);
        }else {
            return cartDao.addCart(cart);
        }
    }

    @Override
    public List<Cart> getCartList(int uid) {
        return cartDao.getCartList(uid);
    }
}
