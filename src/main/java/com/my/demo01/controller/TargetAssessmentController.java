package com.my.demo01.controller;

import com.my.demo01.entity.CollegeSchoolLevelElectiveCourse;
import com.my.demo01.entity.TargetAssessment;
import com.my.demo01.service.CollegeSchoolLevelElectiveCourseService;
import com.my.demo01.service.TargetAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;

@Controller
@CrossOrigin
public class TargetAssessmentController {

    @Autowired
    TargetAssessmentService service;

    @RequestMapping("/selectTargetAssessment")
    @ResponseBody
    public TargetAssessment[] select(){
        return service.select();
    }

    @RequestMapping("/searchTargetAssessment")
    @ResponseBody
    public TargetAssessment[] searchTargetAssessment(String college){
        return service.searchTargetAssessment(college);
    }

    @RequestMapping("/insertTargetAssessment")
    @ResponseBody
    public void insert (String college, String secondaryIndicators, String tertiaryIndicators, String taskVolume, Date date){
        service.insert(college,secondaryIndicators,tertiaryIndicators,taskVolume,date);
    }
}
