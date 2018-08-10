package com.spring.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.starter.models.Topic;

public interface TopicRepository extends JpaRepository<Topic,Integer> {
}
