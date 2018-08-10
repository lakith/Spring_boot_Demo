package com.spring.starter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.starter.models.Course;

public interface CoursesRepository extends JpaRepository<Course, Integer> {

}
