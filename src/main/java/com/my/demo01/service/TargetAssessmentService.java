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

    public void insert(String college, String secondaryIndicators, String tertiaryIndicators, String taskVolume, String date) {
        String tertiaryIndicator=null;
        switch (tertiaryIndicators){
            case  "学院校级选修课程" : tertiaryIndicator ="college_school_level_elective_course";break;
            case  "教学项目申报" : tertiaryIndicator ="teaching_project_application";break;
            case  "教学项目获得" : tertiaryIndicator ="teaching_project_achievement";break;
            case  "实验室建设" : tertiaryIndicator ="lab_construction";break;
            case  "实践基地建设" : tertiaryIndicator ="practice_base_construction";break;
            case  "教学效果" : tertiaryIndicator ="teaching_effectiveness";break;
            case  "教学竞赛" : tertiaryIndicator ="teaching_competition";break;
            case  "毕业生四级就业率" : tertiaryIndicator ="graduation_pass_rate";break;
            case  "职业证书通过率" : tertiaryIndicator ="certificate_pass";break;
            case  "省级以上获奖" : tertiaryIndicator ="province_award";break;
            case  "学生论文发表" : tertiaryIndicator ="student_publication";break;
            case  "领导听课" : tertiaryIndicator ="leadership_class_observation";break;
            case  "教授授课" : tertiaryIndicator ="professor_teaching";break;
            case  "考试考核改革" : tertiaryIndicator ="assessment_reform";break;
            case  "专业认证" : tertiaryIndicator ="professional_certification";break;
            case  "调课率" : tertiaryIndicator ="schedule_change";break;
            case  "活动竞赛" : tertiaryIndicator ="event_competition";break;
            case  "国际化发展规划" : tertiaryIndicator ="plan_implementation";break;
            default: tertiaryIndicator=null;
        }
        dao.insert(college,tertiaryIndicator,taskVolume,date);
        dao1.insert(college,secondaryIndicators,tertiaryIndicators,taskVolume,date);
    }
}
