package com.springcore.removeXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.removeXml")
// not used when we are using bean annotation
public class JavaConfig {
	@Bean
	public Result getResult() {
		return new Result();
	}
	
	@Bean(name = {"firstStudent","temp","student1"})
	public Student firstStudent() {
		Student s = new Student(getResult());
		
		return s;
	}

}
