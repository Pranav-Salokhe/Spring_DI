package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;
import com.service.Coach;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("studentbean",Coach.class);
		coach.display();
		
		Student student = (Student) context.getBean("studentbean");
		student.displayy();

	}

}
