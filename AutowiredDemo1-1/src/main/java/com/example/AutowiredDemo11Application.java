package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.binding.Student;
import com.example.binding.Teacher;

@SpringBootApplication
public class AutowiredDemo11Application {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(AutowiredDemo11Application.class, args);
		Student std = context.getBean(Student.class);
		Teacher tcr = context.getBean(Teacher.class);
		
		std.setName("abcd");
		std.setSid(10);
		
		tcr.setTid(1);
		tcr.settName("tusharsir");
		tcr.setStudent(std);
		

	}

}
