package com.entity;

import com.service.Coach;
import com.service.FortuneService;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public CricketCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}



	@Override
	public void display() {
		System.out.println("This is a cricket coach class...");
		System.out.println(fortuneService.getFortune());
		
	}
	
}
