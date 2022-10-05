package com.samsonmarikwa.springframework.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samsonmarikwa.springframework.springaop.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/springaop/test/config.xml");
		ProductService productService = (ProductService) ctx.getBean("productService");
		int product = productService.multiply(20, 50);
		System.out.println(product);

	}

}
