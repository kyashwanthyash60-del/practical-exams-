package com.example.program17;
import jakarta.persistence.*;
@Entity
public class Student {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
 private String regNo; private String name; private String branch;
 public Integer getId(){return id;} public String getRegNo(){return regNo;} public void setRegNo(String v){regNo=v;}
 public String getName(){return name;} public void setName(String v){name=v;} public String getBranch(){return branch;} public void setBranch(String v){branch=v;}
}
