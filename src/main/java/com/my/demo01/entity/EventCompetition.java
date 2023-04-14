package com.my.demo01.entity;

import lombok.Data;

@Data
public class EventCompetition {

  private int id;
  private String college;
  private String eventName;
  private String eventType;
  private java.sql.Date eventTime;
  private int studentNum;
  private String state;


}
