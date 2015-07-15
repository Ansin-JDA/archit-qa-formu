package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user.getUserid());
	}

	public List<User> getUser(Map<String,Object> param) {
		// TODO Auto-generated method stub
		return userDao.getUsers(param);
	}

}
