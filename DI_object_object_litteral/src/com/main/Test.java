package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.HappyCoach;


public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HappyCoach service1 = (HappyCoach) context.getBean("coach");
		
		service1.display();
		

	}

}
