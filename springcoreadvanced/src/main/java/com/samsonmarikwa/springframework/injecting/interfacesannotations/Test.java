package com.samsonmarikwa.springframework.injecting.interfacesannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/injecting/interfacesannotations/config.xml");
		OrderBO bo = (OrderBO) ctx.getBean("bo");

		bo.placeOrder();
	}
}
