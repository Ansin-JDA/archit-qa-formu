package com.knowledge.infra.server.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.knowledge.infra.server.dao.ManagerDao;
import com.knowledge.infra.server.model.Manager;

@Component("managerDao")
public class ManagerDaoImpl extends SqlSessionDaoSupport implements ManagerDao{
    private static final String MANAGER_DAO_NAMESPACE="com.knowledge.infra.server.dao.ManagerDao.";

	public void addManager(Manager manager) {
		// TODO Auto-generated method stub
		 this.getSqlSession().insert(MANAGER_DAO_NAMESPACE+"addManager", manager);
	}

	public void updateManager(Manager manager) {
		// TODO Auto-generated method stub
		this.getSqlSession().update(MANAGER_DAO_NAMESPACE+"updateManager", manager);
	}

	public void deleteManager(int ManagerId) {
		// TODO Auto-generated method stub
		this.getSqlSession().delete(MANAGER_DAO_NAMESPACE+"deleteManager", ManagerId);		
	}

	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	

}
