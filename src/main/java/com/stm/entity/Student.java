package com.stm.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="student")
@Data
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="std_id")
private int studentId;
@Column(name="std_nm")
private String studentName;
@Column(name="father_nm")
private String fatherName;
@Column(name="mother_nm")
private String motherName;
private LocalDate dob;
@Column(name="email_id")
private String emailId;
@Column(name="mobile_no")
private String mobileNo;
private String gender;




}


