package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.User;

public interface UserService {

	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public List<User> getUsers(Map<String,Object> para);
	
}
