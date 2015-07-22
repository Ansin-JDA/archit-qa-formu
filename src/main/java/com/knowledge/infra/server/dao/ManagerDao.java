package com.knowledge.infra.server.dao;

import java.util.List;
import java.util.Map;

import com.knowledge.infra.server.model.Manager;

public interface ManagerDao {

		public List<Manager> getManagers(Map<String, Object> param);
	    public void addManager(Manager Manager);
	    public void updateManager(Manager Manager);
	    public void deleteManager(int ManagerId);
}
