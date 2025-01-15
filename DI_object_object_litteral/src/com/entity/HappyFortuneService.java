package com.entity;

import com.service.FortuneService;

public class HappyFortuneService implements FortuneService {

	
	
	public void getFortune(String name) {
		System.out.println("This is a HappyFortuneService Class....."+name);
		System.out.println("Name is: "+name);
	}

}
