package com.brutech.courseApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @GetMapping("/")
    public String getAllCourses(){
        return "Courses";
    }

}
