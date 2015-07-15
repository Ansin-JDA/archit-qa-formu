package com.knowledge.infra.server.dao;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.User;

public interface UserDao {
    public List<User> getUsers(Map<String,Object> param);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}