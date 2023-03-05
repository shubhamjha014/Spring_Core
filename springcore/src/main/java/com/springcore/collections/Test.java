package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp e1 = (Emp) context.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getPhones());
		System.out.println(e1.getAddresses());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones().getClass().getName());
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp e2 = (Emp) context2.getBean("emp1");
		System.out.println(e2.getProps());
	}

}
