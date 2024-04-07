package com.fit.se.Student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Retryable;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RetryTemplate retryTemplate;
	
	@Retryable
	public String sayHello() {
		return retryTemplate.execute(context -> restTemplate.getForObject("http://localhost:8081/course", String.class));
	}
}
