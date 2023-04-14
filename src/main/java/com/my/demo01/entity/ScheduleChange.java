package com.my.demo01.entity;

import lombok.Data;

@Data
public class ScheduleChange {

  private int id;
  private String college;
  private String teacherId;
  private String courseId;
  private String reason;
  private java.sql.Date applyTime;
  private String state;


}
