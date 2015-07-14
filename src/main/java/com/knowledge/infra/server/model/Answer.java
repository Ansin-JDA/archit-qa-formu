package com.knowledge.infra.server.model;

import java.util.Date;

public class Answer {
	private Integer answerid; 
	private Integer areferenceqid;
	private String  atitle ;
	private String  acontent;
	private Integer acreateuserid;
	private Integer aupdateuserid;
	private Date    acreatetime;
	private Date    aupdatetime; 
	private Integer agoodnum;
	private Integer abadnum  ;
	private String  astaus;
	
	public Answer(){}

	public Integer getAnswerid() {
		return answerid;
	}

	public void setAnswerid(Integer answerid) {
		this.answerid = answerid;
	}

	public Integer getAreferenceqid() {
		return areferenceqid;
	}

	public void setAreferenceqid(Integer areferenceqid) {
		this.areferenceqid = areferenceqid;
	}

	public String getAtitle() {
		return atitle;
	}

	public void setAtitle(String atitle) {
		this.atitle = atitle;
	}

	public String getAcontent() {
		return acontent;
	}

	public void setAcontent(String acontent) {
		this.acontent = acontent;
	}

	public Integer getAcreateuserid() {
		return acreateuserid;
	}

	public void setAcreateuserid(Integer acreateuserid) {
		this.acreateuserid = acreateuserid;
	}

	public Integer getAupdateuserid() {
		return aupdateuserid;
	}

	public void setAupdateuserid(Integer aupdateuserid) {
		this.aupdateuserid = aupdateuserid;
	}

	public Date getAcreatetime() {
		return acreatetime;
	}

	public void setAcreatetime(Date acreatetime) {
		this.acreatetime = acreatetime;
	}

	public Date getAupdatetime() {
		return aupdatetime;
	}

	public void setAupdatetime(Date aupdatetime) {
		this.aupdatetime = aupdatetime;
	}

	public Integer getAgoodnum() {
		return agoodnum;
	}

	public void setAgoodnum(Integer agoodnum) {
		this.agoodnum = agoodnum;
	}

	public Integer getAbadnum() {
		return abadnum;
	}

	public void setAbadnum(Integer abadnum) {
		this.abadnum = abadnum;
	}

	public String getAstaus() {
		return astaus;
	}

	public void setAstaus(String astaus) {
		this.astaus = astaus;
	}
	
	

}
