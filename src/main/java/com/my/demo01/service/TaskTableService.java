package com.my.demo01.service;

import com.my.demo01.dao.TaskTableDao;
import com.my.demo01.entity.TaskTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskTableService {

    @Autowired
    TaskTableDao dao;

    public TaskTable[] select() {
        return dao.select();
    }

    public void update(int id,String state) {
        dao.update(id,state);
    }
}
