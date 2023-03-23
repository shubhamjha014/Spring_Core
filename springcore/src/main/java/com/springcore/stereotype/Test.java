package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo_config.xml");
		Student student = context.getBean("student1",Student.class);
		System.out.println(student);
//		System.out.println(student.hashCode());
//		Student student2 = context.getBean("student1",Student.class);
//		System.out.println(student2.hashCode());
		Teacher t1 = context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(t2.hashCode());
		
	}

}
