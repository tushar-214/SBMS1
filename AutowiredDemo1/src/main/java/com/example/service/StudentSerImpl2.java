package com.example.service;

import org.springframework.stereotype.Service;
// use byname 
@Service("StudentSerImpl2")
public class StudentSerImpl2 implements StudentSer {
@Override
public String studentPollForGame() {
	return "playing hockey";
	
}
}
