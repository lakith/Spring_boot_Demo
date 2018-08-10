package com.spring.starter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.starter.models.Course;
import com.spring.starter.repository.CoursesRepository;


@Service
public class CourseService {
	
	@Autowired
	CoursesRepository coursesRepository;
	
	List<Course> courses = new ArrayList<>(Arrays.asList(
			new Course(1,"java","Consists java 8 basics"),
			new Course(2,"nodeJs","Consists node js basics"),
			new Course(3,"PHP","Consists PHP basics")));
	
	public List<Course> getAllCourses()
	{	
		return coursesRepository.findAll();
	}
	
	public Optional<Course> getOneCourse(int id) {
		return coursesRepository.findById(id);
	}
	
	public void saveCourse(Course course) {
		coursesRepository.save(course);
	}
	
	public void updateCourse(int id , Course course){
		coursesRepository.save(course);		
	}
	
	public void deleteCourse(int id) 
	{
		coursesRepository.deleteById(id);
	}
	
}
