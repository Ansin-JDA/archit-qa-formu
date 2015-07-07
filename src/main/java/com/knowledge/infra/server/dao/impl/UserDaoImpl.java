package com.knowledge.infra.server.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.knowledge.infra.server.dao.UserDao;
import com.knowledge.infra.server.model.User;

@Component("userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
    private static final String  USER_DAO_NAMESPACE="com.knowledge.infra.server.dao.UserDao.";
	public User getUser(User user) {
		return null;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		 this.getSqlSession().insert(USER_DAO_NAMESPACE+"addUser", user);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int UserId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	

}
