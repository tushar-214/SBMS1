package com.example.binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	private int tid;
	private String tName;
	private Student student;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}
     
	public Student getStudent() {
		return student;
	}
	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tName=" + tName + ", student=" + student + "]";
	}

	public Teacher(int tid, String tName, Student student) {
		super();
		this.tid = tid;
		this.tName = tName;
		this.student = student;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

}
