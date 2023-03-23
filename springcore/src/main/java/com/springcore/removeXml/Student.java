package com.springcore.removeXml;

import org.springframework.stereotype.Component;

//@Component("firstStudent")
//implementing using @Bean annotation
public class Student {
	
	private Result result;
	
	public Student(Result result) {
		super();
		this.result = result;
	}

	public void study() {
		System.out.println("Student is reading book");
		this.result.dispay();
	}

}
