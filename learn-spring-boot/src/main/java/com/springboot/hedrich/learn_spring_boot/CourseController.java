package com.springboot.hedrich.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

		@RequestMapping("/courses")
		public List<Course> retrieveAllCourses(){
			return Arrays.asList(
					new Course(1,"Learn Swift","Hedrich"),
					new Course (2,"Learn Java","Hedrich"),
					new Course (3,"Learn React Native","Hedrich"),
					new Course (4,"Learn Python","Hedrich")
					);
		}
}
