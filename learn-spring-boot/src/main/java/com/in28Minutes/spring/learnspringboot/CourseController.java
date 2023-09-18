package com.in28Minutes.spring.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
//    @GetMapping("/course")
    @GetMapping("/courses")
    public List<Course> retrieveAllCourses( ) {
        return Arrays.asList(
                new Course(1,"Learn spring","Abdullah"),
                new Course(2,"Learn Spring boot","Abdullah"),
                new Course(3,"Learn AWS","Abdullah"),
                new Course(4,"Learn Azure","Abdullah"),
                new Course(5,"Learn MAc","Rana Abdullah")
        );
    }
}
