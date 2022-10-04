package com.samsonmarikwa.springmvcorm.user.dao;

import java.util.List;

import com.samsonmarikwa.springmvcorm.user.entity.User;

public interface UserDao {
	
	int create(User user);
	
	List<User> getUsers();

}
