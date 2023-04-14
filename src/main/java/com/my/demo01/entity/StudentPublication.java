package com.my.demo01.entity;

import lombok.Data;

@Data
public class StudentPublication {

  private int id;
  private String title;
  private String author;
  private String publicationType;
  private java.sql.Date publicationTime;
  private String journalOrConference;
  private String college;
  private String state;


}
