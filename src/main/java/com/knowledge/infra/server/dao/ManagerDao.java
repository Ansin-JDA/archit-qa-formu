package com.knowledge.infra.server.dao;

import com.knowledge.infra.server.model.Manager;

public interface ManagerDao {

	    public void addManager(Manager Manager);
	    public void updateManager(Manager Manager);
	    public void deleteManager(int ManagerId);
}
