package com.dandy.controller;

import com.dandy.model.User;
import com.dandy.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 李旦
 * @date 2020/3/2,11:13
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    public static final Logger log = LoggerFactory.getLogger(UserController.class);

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/logPage")
    public String logPage(){
        return "login";
    }

    /**
     * 验证用户名和密码
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletResponse response,Model model, String name, String pass){
        User user = userService.getUser(name,pass);
        int count = 0;
        if (user!=null){
            count = 1;
            Cookie cookie = new Cookie("username",user.getUsername());
            cookie.setMaxAge(500000);
            response.addCookie(cookie);
        }
        return "{\"count\":\"" + count + "\"}";
    }

    /**
     * 检验用户名是否已存在
     * @param regname
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/checkUser",method = RequestMethod.POST)
    public String checkUser(String regname){
        User user = userService.checkUser(regname);
        int count = 0;
        if (user != null) {
            count = 1;
        }
        return "{\"count\":\"" + count + "\"}";
    }

    /**
     * 注册
     * @param regname
     * @param regpass
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public String regist(String regname,String regpass){
        User user = new User();
        user.setUsername(regname);
        user.setPassword(regpass);
        int addCount = userService.addUser(user);
        return "{\"count\":\"" + addCount + "\"}";
    }

    /**
     * 跳转回首页
     * @return
     */
    @RequestMapping("/index")
    public String index(){
        return "redirect:/";
    }

    /**
     * 检查近期是否登录过
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/keepLogin",method = RequestMethod.POST)
    public String keepLogin(Model model,HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                String username = cookie.getValue();
                User user = userService.checkUser(username);
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                return "{\"code\":\"1\"}";
            }
        }
        return "{\"code\":\"0\"}";
    }
}
