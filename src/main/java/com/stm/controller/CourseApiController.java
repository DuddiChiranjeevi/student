package com.stm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stm.entity.Course;
import com.stm.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseApiController {
		@Autowired
	private CourseService courseService;
	@GetMapping(value="/{courseId}/details")
	public Optional<Course> serchById( @PathVariable("courseId") int courseId) {
		return courseService.serchById(courseId);
	}
	
	@GetMapping(value="/studentId/{studentId}")
	public Optional<Course> serchByStudentId( @PathVariable("studentId") int studentId) {
		return courseService.serchByStudentId(studentId);
	}
	@PostMapping("/save")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
		
	}
}
