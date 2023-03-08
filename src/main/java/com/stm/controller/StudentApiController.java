package com.stm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stm.entity.Student;
import com.stm.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentApiController {
	@Autowired
	private StudentService studentService;
	@PostMapping(value="/save",produces = {MediaType.APPLICATION_JSON_VALUE})
public Student saveStudent(@RequestBody Student student) {
	return studentService.saveStudent(student);
}
	@DeleteMapping(value="delete/{studentId}")
	public void deleteById(@PathVariable("studentId") int studentId) {
		studentService.deleteById(studentId);
	}
	@GetMapping(value="/{motherName}/search" ,produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Student> serchByName(@PathVariable("motherName") String motherName){
		return studentService.serchByName(motherName);
		
	}
}
