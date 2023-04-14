package com.my.demo01.entity;

import lombok.Data;

@Data
public class TeachingCompetition {

  private int id;
  private String competitionName;
  private String competitionLevel;
  private String competitionType;
  private String teacherName;
  private String awardLevel;
  private java.sql.Date awardDate;
  private String college;
  private String state;



}
