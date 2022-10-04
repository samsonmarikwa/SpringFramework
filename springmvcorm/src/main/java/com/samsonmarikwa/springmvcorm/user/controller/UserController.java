package com.samsonmarikwa.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samsonmarikwa.springmvcorm.user.entity.User;
import com.samsonmarikwa.springmvcorm.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result = userService.create(user);
		model.addAttribute("result", "User created with Id: " + result);
		return "userReg";
	}

	@RequestMapping("getUsers")
	public String getUsers(ModelMap model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

	@RequestMapping("validateEmail")
	// @ResponseBody tells Spring that the String is not a view otherwise without
	// this annotation, it will try to resolve for a view name.
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {

		String msg = "";

		User user = userService.getUser(id);

		if (user != null) {
			msg = id + " already exists";
		}

		return msg;
	}
}
