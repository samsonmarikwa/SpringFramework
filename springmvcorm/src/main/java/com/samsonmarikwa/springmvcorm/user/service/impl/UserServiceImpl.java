package com.samsonmarikwa.springmvcorm.user.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samsonmarikwa.springmvcorm.user.dao.UserDao;
import com.samsonmarikwa.springmvcorm.user.entity.User;
import com.samsonmarikwa.springmvcorm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	// it's good practice to have @Transactional at the service layer because there
	// may be multiple calls to database stmnts at this level depending on the
	// business logic
	public int create(User user) {
		int result = userDao.create(user);
		return result;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.getUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUser(Integer id) {
		return userDao.findUser(id);
	}

}
