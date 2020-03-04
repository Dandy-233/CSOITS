package com.dandy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 李旦
 * @date 2020/3/4,17:05
 */
@Controller
public class IndexController {
    /**
     * 跳转回首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "redirect:/";
    }
}

