package com.my.demo01.entity;

import lombok.Data;

@Data
public class TeachingEffectiveness {

  private int id;
  private String courseName;
  private String teacherName;
  private int studentNum;
  private int goodStudentNum;
  private String excellentRate;
  private String college;
  private String state;


}
