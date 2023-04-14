package com.my.demo01.dao;

import com.my.demo01.entity.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    @Select("select * from users where username = #{userName} and password = #{pwd}")
    Users select(String userName, String pwd);
}
