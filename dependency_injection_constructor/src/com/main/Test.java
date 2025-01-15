package com.main;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class Test {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Student student = (Student) context.getBean("studentbean");
		student.display();

	}

}
