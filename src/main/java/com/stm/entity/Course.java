package com.stm.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name="course")
@Data
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
private int courseId;
@Column(name="course_nm")	
private String courseName;
@Column(name="duration_in_months")
private int durationInMonths;
private double fee;
private String faculty;
@Column(name="course_timings")
private LocalTime courseTimings;
@ManyToOne
@JoinColumn(name="std_id")
private Student student;

}
