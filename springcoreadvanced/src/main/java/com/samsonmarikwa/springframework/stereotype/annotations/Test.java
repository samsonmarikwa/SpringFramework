package com.samsonmarikwa.springframework.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/stereotype/annotations/config.xml");
		Instructor instructor = (Instructor) ctx.getBean("instr");
		System.out.println(instructor);
		
		Instructor instructor2 = (Instructor) ctx.getBean("instr");
		System.out.println(instructor2);
	}

}
