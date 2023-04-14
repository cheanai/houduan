package com.my.demo01.service;

import com.my.demo01.dao.TargetAssessmentDao;
import com.my.demo01.dao.TaskTableDao;
import com.my.demo01.entity.TargetAssessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class TargetAssessmentService {

    @Autowired
    TargetAssessmentDao dao;

    @Autowired
    TaskTableDao dao1;

    public TargetAssessment[] select() {
        return dao.select();
    }

    public TargetAssessment[] searchTargetAssessment(String college) {
        return dao.searchTargetAssessment(college);
    }

    public void insert(String college, String secondaryIndicators, String tertiaryIndicators, String taskVolume, Date date) {
        dao.insert(college,tertiaryIndicators,taskVolume,date);
        dao1.insert(college,secondaryIndicators,tertiaryIndicators,taskVolume,date);
    }
}
