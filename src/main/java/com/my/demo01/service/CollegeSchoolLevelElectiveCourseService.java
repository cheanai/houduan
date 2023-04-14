    package com.my.demo01.service;

    import com.my.demo01.dao.CollegeSchoolLevelElectiveCourseDao;
    import com.my.demo01.entity.CollegeSchoolLevelElectiveCourse;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    import org.springframework.transaction.annotation.Transactional;

    @Service
    public class CollegeSchoolLevelElectiveCourseService {

        @Autowired
        CollegeSchoolLevelElectiveCourseDao dao;

        public CollegeSchoolLevelElectiveCourse[] select(String department) {
            return dao.select(department);
        }

        @Transactional
        public void insert(String collageName,String courseName, String instructorName, String courseCount) {
            dao.insert(collageName,courseName,instructorName,courseCount);
        }

        @Transactional
        public void delete(int id) {
            dao.delete(id);
        }

        public CollegeSchoolLevelElectiveCourse[] searchCollegeCourse(String course, String department) {
            return dao.searchCollegeCourse(course,department);
        }

        @Transactional
        public void update(int id, String courseName, String instructorName, String courseCount) {
            dao.update(id,courseName,instructorName,courseCount);
        }
    }
