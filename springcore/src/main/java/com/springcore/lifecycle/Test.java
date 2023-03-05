package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleConfig.xml");
//		Samosa s1 = (Samosa) context.getBean("samosa1");
//		System.out.println(s1);
//		
//		System.out.println("+++++++++++++++++++++++++++++++++++++");
//		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
//		System.out.println(p1);
		Employee e1 = (Employee) context.getBean("emp1");
		System.out.println(e1);
		context.registerShutdownHook();
	}

}
