package com.springcore.auto.wire;

public class Emp {
	
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
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
