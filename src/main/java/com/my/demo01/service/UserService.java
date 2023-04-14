package com.my.demo01.service;

import com.my.demo01.dao.UserDao;
import com.my.demo01.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    public Users select(String userName,String pwd){
        return dao.select(userName, pwd);
    }
}
