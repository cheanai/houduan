package com.my.demo01.entity;

import lombok.Data;

@Data
public class GraduationPassRate {

  private int id;
  private String major;
  private String college;
  private int totalStudents;
  private int passStudents;
  private double passRate;
  private String state;


}
