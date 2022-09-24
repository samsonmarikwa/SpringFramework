package com.samsonmarikwa.springframework.autowiringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/autowiringannotation/config.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
	}

}
