package com.example.binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	Adress address;	
	public void stud()

	{
		System.out.println("student methods");	
		address.address();
	}
}
