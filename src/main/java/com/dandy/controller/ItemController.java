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
import java.util.Collections;
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
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(HttpServletRequest request, MultipartFile picture, Item item){
        String fileName = UpFileUtil.getFile(picture);
        HttpSession session = request.getSession();
        int sid = ((User) session.getAttribute("user")).getUid();
        item.setIpic(fileName);
        item.setSid(sid);
        int addCount = itemService.addItem(item);
        log.info("商品["+item.getIname()+"]添加成功");
        return "{\"count\":\"" + addCount + "\"}";
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

    /**
     * 获取指定物品信息并跳转到展示页面
     * @param iid
     * @param model
     * @return
     */
    @RequestMapping("/info")
    public String info(int iid,Model model){
        Item item = itemService.getItemById(iid);
        model.addAttribute("item",item);
        return "iteminfo";
    }

    /**
     * 获取我的物品
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/myItem")
    public String myItem(Model model,HttpServletRequest request){
        HttpSession session = request.getSession();
        int uid = ((User)session.getAttribute("user")).getUid();
        List<Item> items = itemService.getItemsBySid(uid);
        Collections.reverse(items);
        model.addAttribute("items",items);
        return "itemList";
    }

    /**
     * 获取物品信息并跳转到修改物品页面
     * @param iid
     * @param model
     * @return
     */
    @RequestMapping("/editPage")
    public String editPage(int iid,Model model){
        Item item = itemService.getItemById(iid);
        model.addAttribute("item",item);
        return "editItem";
    }

    /**
     * 修改物品信息
     * @param request
     * @param picture
     * @param item
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(HttpServletRequest request,MultipartFile picture, Item item){
        if (!picture.isEmpty()){
            String fileName = UpFileUtil.getFile(picture);
            item.setIpic(fileName);
        }
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int editCount = itemService.editItem(item);
        log.info("商品["+item.getIname()+"]修改成功");
        return "{\"count\":\"" + editCount + "\"}";
    }

    /**
     * 下架物品
     * @param iid
     * @param iname
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/remove",method = RequestMethod.POST)
    public String remove(int iid,String iname){
        int editCount = itemService.remove(iid);
        log.info("商品["+iname+"]下架成功");
        return "{\"count\":\"" + editCount + "\"}";
    }
}
