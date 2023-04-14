package com.my.demo01.controller;

import com.my.demo01.entity.CollegeSchoolLevelElectiveCourse;
import com.my.demo01.service.CollegeSchoolLevelElectiveCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class CollegeSchoolLevelElectiveCourseController {

    @Autowired
    CollegeSchoolLevelElectiveCourseService service;

    @RequestMapping("/selectCollegeSchoolLevelElectiveCourse")
    @ResponseBody
    public CollegeSchoolLevelElectiveCourse[] select(String department){
        return service.select(department);
    }

    @RequestMapping("/selectAllCollegeSchoolLevelElectiveCourse")
    @ResponseBody
    public CollegeSchoolLevelElectiveCourse[] selectAll(){
        return service.selectAll();
    }

    @RequestMapping("/searchCollegeCourse")
    @ResponseBody
    public CollegeSchoolLevelElectiveCourse[] searchCollegeCourse(String Course,String department){
        System.out.println(Course+department);
        return service.searchCollegeCourse(Course,department);
    }

    @RequestMapping("/insertCollegeCourse")
    @ResponseBody
    public void insert (String collageName,String courseName,String instructorName,String courseCount){
        System.out.println(collageName+courseName+instructorName+courseCount);
        service.insert(collageName,courseName,instructorName,courseCount);
    }

    @RequestMapping("/updateCollegeCourse")
    @ResponseBody
    public void update (int id ,String collageName,String courseName,String instructorName,String courseCount){
        System.out.println(id+collageName+courseName+instructorName+courseCount);
        service.update(id,courseName,instructorName,courseCount);
    }

    @RequestMapping("/deleteCollegeCourse")
    @ResponseBody
    public void delete(int id){
        service.delete(id);
    }
}
