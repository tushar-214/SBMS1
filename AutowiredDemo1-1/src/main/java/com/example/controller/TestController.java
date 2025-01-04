package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Student;
import com.example.binding.Teacher;

@RestController
public class TestController {

	@Autowired
	Teacher techer;

	@GetMapping("/teacher")
	String getTeacher() {

		int id = techer.getTid();
		String name = techer.gettName();
		Student data = techer.getStudent();
		return " id = " + id +"name = " +name +" Data :: "+data ;

	}

}
