package com.samsonmarikwa.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/samsonmarikwa/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages countriesAndLang = (CountriesAndLanguages) ctx.getBean("countriesAndLanguages");
		System.out.println(countriesAndLang.getClass().getCanonicalName());
		System.out.println(countriesAndLang);
		
	}

}
