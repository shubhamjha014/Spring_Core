package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	@Autowired
	@Qualifier("address2")
	private Address address;
	
	
	public Emp(Address address) {
		super();
		System.out.println("Inside Contructor Parameterized");
		this.address = address;
	}
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setting through setters");
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
