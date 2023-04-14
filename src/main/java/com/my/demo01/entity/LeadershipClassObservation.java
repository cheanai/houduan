package com.my.demo01.entity;

import lombok.Data;

@Data
public class LeadershipClassObservation {

  private int id;
  private String teacherName;
  private String observerName;
  private java.sql.Date observationTime;
  private String courseName;
  private String college;
  private String state;


}
