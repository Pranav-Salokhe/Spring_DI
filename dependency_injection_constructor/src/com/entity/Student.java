package com.entity;


public class Student {

	private String myname;
	private String myemail;
	
	public Student() {
		
	}

	public Student(String myname,String myemail) {
		this.myname = myname;
		this.myemail = myemail;
	}


	public void display() {
//		System.out.println("name is: "+myname+" email id is:"+myemail);
		System.out.println(myname.concat(myemail));

	}

}
