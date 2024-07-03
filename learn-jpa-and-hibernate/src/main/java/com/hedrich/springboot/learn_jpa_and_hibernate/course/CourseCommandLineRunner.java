package com.hedrich.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hedrich.springboot.learn_jpa_and_hibernate.course.Course;
import com.hedrich.springboot.learn_jpa_and_hibernate.course.jdbc.CourseJdbcRepository;
import com.hedrich.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
	@Autowired
	private CourseJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn Java","Udemy"));
		repository.insert(new Course(2,"Learn React","Udemy"));
		repository.insert(new Course(3,"Learn Angular","Udemy"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
	}

}
