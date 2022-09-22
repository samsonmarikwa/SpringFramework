package com.samsonmarikwa.springframework.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/ambiguity/config.xml");
		Addition employee = (Addition) ctx.getBean("addition");
	}

}
