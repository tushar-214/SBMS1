package com.example.service;

import org.springframework.stereotype.Service;

@Service("StudentSerImpl")

public class StudentSerImpl implements StudentSer {
@Override
public String studentPollForGame() {
	return "playing cricket";
	
}
}
