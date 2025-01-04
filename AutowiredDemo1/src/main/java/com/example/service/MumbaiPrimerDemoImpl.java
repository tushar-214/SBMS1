package com.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary

public class MumbaiPrimerDemoImpl implements PrimerDemoServ {

	@Override
	public String bestCity() {
		// TODO Auto-generated method stub
		return "mumbai is the best city";
	}
}
