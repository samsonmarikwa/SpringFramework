package com.samsonmarikwa.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamsController {

	@RequestMapping("/showData")
	// the keys used in the RequestParam should match those passed via the url
	// http://localhost:8080/springmvc/showData?id=1234&name=John&sal=1250.59
	public ModelAndView showData(
			@RequestParam("id") int id,
			@RequestParam("name") String name,
			@RequestParam(value="sal", required=false, defaultValue="60.95") double salary) {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		return new ModelAndView("userReg");
	}
}
