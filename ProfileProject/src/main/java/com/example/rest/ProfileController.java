package com.example.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	@Value("${msg}")
	String msg1;

	@GetMapping("/localenv")
	ResponseEntity<String> localProfile() {
		return new ResponseEntity<String>(msg1, HttpStatus.OK);
	}

	@Value("${devpropertyfile}")
	String dev;

	@GetMapping("/devenv")
	ResponseEntity<String> devProfile() {
		return new ResponseEntity<String>(dev, HttpStatus.OK);
	}
	
	@Value("${uatprofile}")
	String uatprofile;
	@GetMapping("/uatEnv")
	ResponseEntity<String> uatProfile() {
		return new ResponseEntity<String>(uatprofile, HttpStatus.OK);
	}
	
	
	

}
