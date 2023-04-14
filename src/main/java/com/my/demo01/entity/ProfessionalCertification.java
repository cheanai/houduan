package com.my.demo01.entity;

import lombok.Data;

@Data
public class ProfessionalCertification {

  private int id;
  private String college;
  private String majorName;
  private java.sql.Timestamp certificationTime;
  private String certificationAgency;
  private String state;



}
