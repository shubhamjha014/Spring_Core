package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending Method");
	}

}
