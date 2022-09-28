package com.samsonmarikwa.springframework.springjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.samsonmarikwa.springframework.springjdbc.dao.EmployeeDao;
import com.samsonmarikwa.springframework.springjdbc.dto.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/samsonmarikwa/springframework/springjdbc/test/config.xml");
		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(40);
		employee.setFirstName("Cynthia");
		employee.setLastName("Kanakembizi");
		int result = employeeDao.create(employee);
		System.out.println("Number of records created: " + result);
		
		// update
		employee.setId(30);
		employee.setFirstName("Laureen");
		employee.setLastName("Marikwa");
		result = employeeDao.update(employee);
		System.out.println("Number of records updated: " + result);
		
		// delete
		result = employeeDao.delete(30);
		System.out.println("Number of records deleted: " + result);
	
		// read one record
		try {
			Employee employee2 = employeeDao.read(30);
			System.out.println("Employee Record: " + employee2);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("Employee Record Not Found");
		}
		
		// read multiple records
		List<Employee> employees = employeeDao.read();
		System.out.println("List of Employees");
		for (Employee employee2 : employees) {
			System.out.println(employee2);
		}

	}

}
