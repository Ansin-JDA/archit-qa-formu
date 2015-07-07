package com.knowledge.infra.server.service;

import com.knowledge.infra.server.model.User;

public interface UserService {

	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUser(User user);
	
}
