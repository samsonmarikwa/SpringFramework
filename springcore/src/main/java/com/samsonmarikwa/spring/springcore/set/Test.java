package com.samsonmarikwa.spring.springcore.set;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/samsonmarikwa/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("carDealer");
		System.out.println("Car Dealer: " + carDealer.getName());
		System.out.println("Models:");
		Set<String> models = carDealer.getModels();
		for (String model : models) {
			System.out.println("   " + model);
		}

	}

}
