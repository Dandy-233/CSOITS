package com.dandy.controller;

import com.dandy.model.Cart;
import com.dandy.model.User;
import com.dandy.service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 李旦
 * @date 2020/3/13,10:57
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Resource
    private CartService cartService;

    public static final Logger log = LoggerFactory.getLogger(CartController.class);

    /**
     * 添加购物车
     * @param iid
     * @param cnum
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public String add(int iid, int cnum,String iname, HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Cart cart = new Cart();
        cart.setUid(user.getUid());
        cart.setIid(iid);
        cart.setCnum(cnum);
        int addCount = cartService.addCart(cart);
        log.info("用户:["+user.getUsername()+"]添加["+iname+"]至购物车");
        return "{\"count\":\""+addCount+"\"}";
    }

    /**
     * 获取我的购物车并跳转页面
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/myCart")
    public String myCart(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        int uid = ((User)session.getAttribute("user")).getUid();
        List<Cart> carts = cartService.getCartList(uid);
        model.addAttribute("carts",carts);
        return "myCart";
    }
}
