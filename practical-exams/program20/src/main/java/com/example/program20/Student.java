package com.example.program20;
import org.springframework.data.annotation.Id;import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="students")
public class Student {@Id private String id;private String regNo;private String name;private String branch;
public String getId(){return id;}public String getRegNo(){return regNo;}public void setRegNo(String v){regNo=v;}public String getName(){return name;}public void setName(String v){name=v;}public String getBranch(){return branch;}public void setBranch(String v){branch=v;}}
