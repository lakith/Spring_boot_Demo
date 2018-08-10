package com.spring.starter.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.starter.models.Course;
import com.spring.starter.models.Topic;
import com.spring.starter.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllCourses()
	{	
		return topicRepository.findAll();
	}
	
	public Optional<Topic> getOneCourse(int id) {
		return topicRepository.findById(id);
	}
	
	public void saveCourse(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateCourse(int id , Topic topic){
		topicRepository.save(topic);		
	}
	
	public void deleteCourse(int id) 
	{
		topicRepository.deleteById(id);
	}	
}
