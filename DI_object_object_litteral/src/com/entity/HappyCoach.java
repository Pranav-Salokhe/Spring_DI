package com.entity;

import com.service.FortuneService;

public class HappyCoach {

	private String name;
	
	private FortuneService fortuneService;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public HappyCoach(FortuneService fortuneService) {
		this.fortuneService= fortuneService;
	}


	public void display() {
//		System.out.println("Name is: "+name);
		fortuneService.getFortune(name);
	}
}
