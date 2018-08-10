package com.spring.starter.controller;

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
import com.spring.starter.models.Topic;
import com.spring.starter.service.CourseService;
import com.spring.starter.service.TopicService;

@RestController
public class TopicConroller {

	@Autowired
	TopicService cs;
	
	@RequestMapping(method=RequestMethod.GET,value="/topic")
	public List<Topic> getAllTopics(){
		return cs.getAllCourses();
	}
	
	@GetMapping(value="/courses/{cid}/topic/{tid}")
	public Optional<Topic> getOneCourse(@PathVariable("tid") int id){
		return cs.getOneCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/courses/{id}/topic")
	public Topic saveCourse(@RequestBody Topic topic ) {
		cs.saveCourse(topic);
		return topic;
	}
	
	@PutMapping(value="/courses/{id}/topic/{tid}")
	public Topic updateCourse(@RequestBody Topic topic,@PathVariable("tid") int id) {
		cs.updateCourse(id, topic);
		return topic;
	}
	
	@DeleteMapping(value="/courses/{id}/topic/{tid}")
	public String deleteCourse(@PathVariable int id) {
		cs.deleteCourse(id);
		return "deletion failed";		
	}
	
	/*@GetMapping(value="/courses/update")
	public List<Topic> testget(){
		return cs.getAllCourses();
	}*/
	
}
