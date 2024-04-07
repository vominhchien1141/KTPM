package com.fit.se.Course.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {
	@GetMapping("/course")
	public String hello() {
		return "hello";
	}
}
