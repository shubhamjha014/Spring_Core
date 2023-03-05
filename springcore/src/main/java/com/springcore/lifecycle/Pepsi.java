package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// This method works as "init" method
		System.out.println("Taking Pesi: init");
		
	}

	public void destroy() throws Exception {
		// destroy
		System.out.println("Going to put bottle back after drinking: destroy");
		
	}

}
