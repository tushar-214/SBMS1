package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PrimerDemoServ;

@RestController
public class PrimeryDemoController {

	@Autowired
	PrimerDemoServ pm;

	@GetMapping("/city")
String getCityDetails()
	{
		String data= pm.bestCity();
		return data;
	}
}
