package com.hunau.mydatauser.controller;

import com.hunau.mydatauser.dao.UserDao;
import com.hunau.mydatauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class UserController {
    // @Resource
    // private UserDao userDao;
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    public String Query(Model model){

        model.addAttribute("users", userService.findBy("xiaowang"));
        return "query";
    }

    @RequestMapping("showUser/{id}")
    public String showUser(@PathVariable int id,Model model){
        model.addAttribute("name",userService.selectUser(id).toString());
        return "showuser";
    }
}
