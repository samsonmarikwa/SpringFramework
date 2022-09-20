package com.samsonmarikwa.spring.springcore.list;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/samsonmarikwa/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name: " + hospital.getName());
		System.out.println("Departments:");
		
		List<String> departments = hospital.getDepartments();
		for (Iterator<String> iterator = departments.iterator(); iterator.hasNext();) {
			String department = (String) iterator.next();
			System.out.println("  " + department);
		}
	}
}
