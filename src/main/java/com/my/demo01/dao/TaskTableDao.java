package com.my.demo01.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface TaskTableDao {

    void insert(String college, String secondaryIndicators, String tertiaryIndicators, String taskVolume, Date date);
}
