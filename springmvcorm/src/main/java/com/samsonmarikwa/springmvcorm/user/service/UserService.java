package com.samsonmarikwa.springmvcorm.user.service;

import java.util.List;

import com.samsonmarikwa.springmvcorm.user.entity.User;

public interface UserService {
	
	int create(User user);
	
	List<User> getUsers();

}
