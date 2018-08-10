package com.spring.starter.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int topicId;
	
	@Column
	private String name;
	
	@Column
	private String description;

	public Topic(int topicId, String name, String description) {
		super();
		this.topicId = topicId;
		this.name = name;
		this.description = description;
	}

	public Topic(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
		public Topic() {
		super();
	}

	public int getTopicId() {
		return topicId;
	}
	

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;}
	
}
