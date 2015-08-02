package com.knowledge.infra.server.service;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Manager;

public interface ManagerService {

	public void addManager(Manager manager);
	public void updateManager(Manager manager);
	public void deleteManager(Manager manager);
	public List<Manager> getManagers(Map<String,Object> para);
	
}