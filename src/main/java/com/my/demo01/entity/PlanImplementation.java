package com.my.demo01.entity;

import lombok.Data;

@Data
public class PlanImplementation {

  private int id;
  private String college;
  private String planName;
  private String planType;
  private java.sql.Date startTime;
  private String progress;
  private String state;


}
