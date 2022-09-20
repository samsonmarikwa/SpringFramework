package com.samsonmarikwa.spring.springcore.reftypes2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/samsonmarikwa/spring/springcore/reftypes2/reftypesconfig.xml");
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingCart");
		
		System.out.println(shoppingCart);
	}

}
