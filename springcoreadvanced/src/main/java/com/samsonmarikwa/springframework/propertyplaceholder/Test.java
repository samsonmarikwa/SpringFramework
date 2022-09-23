package com.samsonmarikwa.springframework.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/samsonmarikwa/springframework/propertyfilereader/config.xml");
		MyDAO myDAO = (MyDAO) ctx.getBean("myDAO");
		System.out.println(myDAO.getDbSever());
	}

}
