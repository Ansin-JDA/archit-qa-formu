package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledge.infra.server.dao.ManagerDao;
import com.knowledge.infra.server.model.Manager;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;
	
	
	public void addManager(Manager manager) {
		// TODO Auto-generated method stub
		managerDao.addManager(manager);
	}

	public void updateManager(Manager manager) {
		// TODO Auto-generated method stub
		managerDao.updateManager(manager);
		
	}

	public void deleteManager(Manager manager) {
		// TODO Auto-generated method stub
		managerDao.deleteManager(manager.getManagerid());
	}

	public List<Manager> getManagers(Map<String,Object> param) {
		// TODO Auto-generated method stub
		return managerDao.getManagers(param);
	}

}
