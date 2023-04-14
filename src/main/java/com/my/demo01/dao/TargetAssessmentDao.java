package com.my.demo01.dao;

import com.my.demo01.entity.TargetAssessment;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface TargetAssessmentDao {

    @Select("SELECT * FROM target_assessment")
    TargetAssessment[] select();

    @Select("SELECT * FROM target_assessment where college like CONCAT('%', #{college}, '%')")
    TargetAssessment[] searchTargetAssessment(String college);

    @Update("UPDATE target_assessment SET ${tertiaryIndicators} = #{taskVolume}, date = #{date} WHERE college = #{college}")
    void insert(String college, String tertiaryIndicators, String taskVolume, Date date);
}
