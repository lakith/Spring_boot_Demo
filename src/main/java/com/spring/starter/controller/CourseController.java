package com.spring.starter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.starter.models.Course;
import com.spring.starter.service.CourseService;



@RestController
public class CourseController {

	@Autowired
	CourseService cs;
	
	@RequestMapping(method=RequestMethod.GET,value="/courses")
	public List<Course> getAllCourses(){
		return cs.getAllCourses();
	}
	
	@GetMapping(value="/courses/{id}")
	public Optional<Course> getOneCourse(@PathVariable int id){
		return cs.getOneCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses")
	public Course saveCourse(@RequestBody Course course ) {
		cs.saveCourse(course);
		return course;
	}
	
	@PutMapping(value="/courses/{id}")
	public Course updateCourse(@RequestBody Course course,@PathVariable int id) {
		cs.updateCourse(id, course);
		return course;
	}
	
	@DeleteMapping(value="/courses/{id}")
	public String deleteCourse(@PathVariable int id) {
		cs.deleteCourse(id);
		return "deletion failed";		
	}
	
	@GetMapping(value="/courses/update")
	public List<Course> testget(){
		return cs.getAllCourses();
	}
}
