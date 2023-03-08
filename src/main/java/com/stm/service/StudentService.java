package com.stm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stm.entity.Student;
import com.stm.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired	
private StudentRepository studetRepository;
	public Student saveStudent(Student student) {
		return  studetRepository.save(student);
	}
	
	public void deleteById(int studentId) {
		studetRepository.deleteById(studentId);
	}
	
	public List<Student> serchByName(String motherName) {
		return studetRepository.findByMotherName(motherName);
	}
}
