package com.stm.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stm.entity.Course;
import com.stm.repository.CourseRepository;
@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
public Optional<Course> serchById(int courseId) {
	Optional<Course> course= courseRepository.findById(courseId);
	return course;	
}

public Optional<Course> serchByStudentId(int studentId) {
	Optional<Course>  course=courseRepository.findById(studentId);
	return course;
}
public Course saveCourse(Course course) {
Course data=courseRepository.save(course);
	return data;
	
}

} 
 