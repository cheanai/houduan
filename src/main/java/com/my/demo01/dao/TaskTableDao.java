package com.my.demo01.dao;

import com.my.demo01.entity.TaskTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskTableDao {

    @Insert("INSERT INTO task_table (college, secondaryIndicators, tertiaryIndicators, taskVolume, date) VALUES (#{college},#{secondaryIndicators},#{tertiaryIndicators},#{taskVolume},#{date})")
    void insert(String college, String secondaryIndicators, String tertiaryIndicators, String taskVolume, String date);

    @Select("SELECT * FROM task_table")
    TaskTable[] select();

    @Update("UPDATE task_table SET state=#{state} WHERE id = #{id}")
    void update(int id,String state);
}
