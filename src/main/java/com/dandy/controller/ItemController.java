package com.dandy.controller;

import com.dandy.model.Item;
import com.dandy.model.User;
import com.dandy.service.ItemService;
import com.dandy.util.UpFileUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
     *跳转到添加商品页面
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage(){
        return "addItem";
    }

    /**
     * 添加商品
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addItem",method = RequestMethod.POST)
    public String addItem(HttpServletRequest request, MultipartFile picture, Item item){
        String fileName = UpFileUtil.getFile(picture);
        HttpSession session = request.getSession();
        int sid = ((User) session.getAttribute("user")).getUid();
        item.setIpic(fileName);
        item.setSid(sid);
        int addCount = itemService.addItem(item);
        log.info("商品["+item.getIname()+"]添加成功");
        return "{\"code\":\"" + addCount + "\"}";
    }

    /**
     * 搜索并跳转到搜索结果页面
     * @param text
     * @param model
     * @return
     */
    @RequestMapping(value = "/pickItem",method = RequestMethod.POST)
    public String pickItem(String text, Model model){
        char[] chars = text.toCharArray();
        List<Item> items = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(items.size());
        List<Item> list = itemService.pickItem(text);
        for (char c:chars) {
            list.addAll(itemService.pickItem(String.valueOf(c))) ;
        }
        for (Item item : list) {
            if (set.add(item.getIid())) {
                items.add(item);
            }
        }
        model.addAttribute("items",items);
        return "searchPage";
    }
}
