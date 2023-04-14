package com.my.demo01.controller;

import com.my.demo01.entity.TaskTable;
import com.my.demo01.service.TaskTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class TaskTableController {

    @Autowired
    TaskTableService service;

    @RequestMapping("/selectTaskTable")
    @ResponseBody
    public TaskTable[] select(){
        return service.select();
    }

    @RequestMapping("/updateTaskTable")
    @ResponseBody
    public void update(int id,String state){
        service.update(id,state);
    }
}
