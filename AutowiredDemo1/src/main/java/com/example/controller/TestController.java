package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.binding.Student;
import com.example.service.StudentSer;

@RestController
public class TestController {

    @Autowired
    private Student student; // Ensure this is a valid bean

    @Autowired
    @Qualifier("StudentSerImpl2") // Specify the exact implementation of StudentSer 
    // use byname of the beans matching two beans so we will get confusion to create the object  
    // avoid this ambudiy using qualifier anoataion 
    private StudentSer serv;

    @GetMapping("/test")
    public String testDemo() {
        String msg = "This is the Test API";
        student.stud(); // Ensure the `stud()` method exists in the `Student` class
        return msg;
    }

    @GetMapping("/studentpoll")
    public String studentPoll() {
        System.out.println("Hello, this is student poll");
        String msg = serv.studentPollForGame(); // Ensure `studentPollForGame` is implemented in `StudentSer`
        return msg;
    }
}
