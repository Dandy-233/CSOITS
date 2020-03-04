package com.dandy.controller;

import com.dandy.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author 李旦
 * @date 2020/3/4,16:53
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Resource
    private ItemService itemService;

    public static final Logger log = LoggerFactory.getLogger(ItemController.class);

    /**
     * 跳转回首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "redirect:/";
    }

    /**
     *跳转到添加商品页面
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage(){
        return "addItem";
    }
}
