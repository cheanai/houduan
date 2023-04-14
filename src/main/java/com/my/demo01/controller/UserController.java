package com.my.demo01.controller;

import com.my.demo01.entity.Users;
import com.my.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/login")
    @ResponseBody
    public Users select(String userName,String pwd){
        System.out.println(userName+"---"+pwd);
        return service.select(userName,pwd);
    }
}
