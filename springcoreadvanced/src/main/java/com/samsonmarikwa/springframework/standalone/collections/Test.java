package com.samsonmarikwa.springframework.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext(
						"com/samsonmarikwa/springframework/standalone/collections/config.xml");
		ProductsList productsList = (ProductsList) ctx.getBean("productsList");
		System.out.println(productsList);
	}

}
