package com.my.demo01.entity;

import lombok.Data;

@Data
public class TeachingProjectAchievement {

  private int id;
  private String projectName;
  private String projectType;
  private String projectLeaderName;
  private java.sql.Date projectStartDate;
  private double projectFund;
  private String state;
  private int college;


}
