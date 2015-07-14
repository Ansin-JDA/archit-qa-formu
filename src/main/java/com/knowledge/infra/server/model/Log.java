package com.knowledge.infra.server.model;

import java.util.Date;

public class Log {

	private Integer logid ;
	private String  lcontent ;
	private Date    lcreatetime ;
	public Integer getLogid() {
		return logid;
	}
	public void setLogid(Integer logid) {
		this.logid = logid;
	}
	public String getLcontent() {
		return lcontent;
	}
	public void setLcontent(String lcontent) {
		this.lcontent = lcontent;
	}
	public Date getLcreatetime() {
		return lcreatetime;
	}

	
}
