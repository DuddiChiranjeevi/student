package com.stm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stm.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>{

}
