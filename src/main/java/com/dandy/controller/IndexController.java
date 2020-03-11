package com.dandy.controller;

import com.dandy.model.Item;
import com.dandy.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李旦
 * @date 2020/3/4,17:05
 */
@Controller
public class IndexController {

    @Resource
    private ItemService itemService;

    /**
     * 跳转回首页
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model){
        List<Item> items = itemService.listAll();
        model.addAttribute("items",items);
        return "redirect:/";
    }
}

