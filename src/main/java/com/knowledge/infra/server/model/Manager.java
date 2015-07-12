package com.knowledge.infra.server.model;

public class Manager {

	  private Integer managerid;
	  private String  mname ;
	  private String  memail;
	  private String  mpassword; 
	  private Integer mstatus;
	  
	  public Manager(){}

	public Integer getManagerid() {
		return managerid;
	}

	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMemail() {
		return memail;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public String getMpassword() {
		return mpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public Integer getMstatus() {
		return mstatus;
	}

	public void setMstatus(Integer mstatus) {
		this.mstatus = mstatus;
	}
	  
	  
}
