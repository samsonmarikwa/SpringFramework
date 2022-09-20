package com.samsonmarikwa.springbean.lifecycle.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springbean/lifecycle/xmlconfig/config.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient);

		ctx.registerShutdownHook();
	}

}
