package com.example.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
	@GetMapping("/githublogin")
	ResponseEntity<String> gitHubLogin() { 
		String msg = "Good morning sir ";
		return new ResponseEntity<>(msg, HttpStatus.OK);

	}
	@GetMapping("/test")
	ResponseEntity<String> testMethod() { 
		String msg = "Testing message";
		return new ResponseEntity<>(msg, HttpStatus.OK);

	}
}
