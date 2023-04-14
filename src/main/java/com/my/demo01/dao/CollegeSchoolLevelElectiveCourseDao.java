package com.my.demo01.dao;

import com.my.demo01.entity.CollegeSchoolLevelElectiveCourse;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeSchoolLevelElectiveCourseDao {
    @Select("select * from college_school_level_elective_course where college_name=#{department}")
    CollegeSchoolLevelElectiveCourse[] select(String department);

    @Insert("INSERT INTO college_school_level_elective_course (college_name, course_name, course_count, instructor_name) VALUES (#{collageName}, #{courseName}, #{courseCount}, #{instructorName});")
    void insert(String collageName,String courseName, String instructorName, String courseCount);

    @Delete("DELETE FROM college_school_level_elective_course WHERE  id = #{id} ")
    void delete(int id);

    @Select("select * from college_school_level_elective_course where college_name=#{department} and course_name like CONCAT('%', #{course}, '%')")
    CollegeSchoolLevelElectiveCourse[] searchCollegeCourse(String course, String department);

    @Update("UPDATE college_school_level_elective_course SET course_name = #{courseName}, course_count =#{courseCount}, instructor_name =#{instructorName},state ='待审批' WHERE  id =#{id}")
    void update(int id, String courseName, String instructorName, String courseCount);

    @Select("select * from college_school_level_elective_course")
    CollegeSchoolLevelElectiveCourse[] selectAll();

    @Update("UPDATE college_school_level_elective_course SET state =#{state} WHERE  id =#{id}")
    void updateState(int id, String state);
}
