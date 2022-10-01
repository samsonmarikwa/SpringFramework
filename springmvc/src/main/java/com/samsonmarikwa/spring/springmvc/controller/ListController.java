package com.samsonmarikwa.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samsonmarikwa.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("Annet");
		employee.setSalary(8000);

		Employee employee2 = new Employee();
		employee2.setId(5678);
		employee2.setName("Cynthia");
		employee2.setSalary(15000);

		Employee employee3 = new Employee();
		employee3.setId(9012);
		employee3.setName("Laureen");
		employee3.setSalary(20000);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);

		modelAndView.addObject("employees", employees);

		return modelAndView;
	}
}
