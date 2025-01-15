package com.entity;

import com.service.Coach;

public class Student implements Coach {

	private String myname;
	private String myemail;
	
	
	public void setMyname(String myname) {
		this.myname = myname;
	}


	public void setMyemail(String myemail) {
		this.myemail = myemail;
	}


	@Override
	public void display() {
		System.out.println("name is: "+myname+" email id is:"+myemail);

	}
	
	public void displayy() {
		System.out.println("name is: "+myname+" email id is:"+myemail);

	}

}
