package com.knowledge.infra.server.model;

import java.util.Date;

public class Question {

	private Integer questionid; 
	private String  qtitle;
	private String  qcontent;
	private Integer qcreateuserid ;
	private Integer qupdateuserid;
	private Date    qcreatetime;
	private Date     qupdatetime;
	private Integer  qgoodnum ;
	private Integer  qbadnum;
	private String    qlabel;
	private String   qstaus ;
	private Integer  qviewtimes;
	
	public Question(){}

	public Integer getQuestionid() {
		return questionid;
	}

	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}

	public String getQtitle() {
		return qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getQcontent() {
		return qcontent;
	}

	public void setQcontent(String qcontent) {
		this.qcontent = qcontent;
	}

	public Integer getQcreateuserid() {
		return qcreateuserid;
	}

	public void setQcreateuserid(Integer qcreateuserid) {
		this.qcreateuserid = qcreateuserid;
	}

	public Integer getQupdateuserid() {
		return qupdateuserid;
	}

	public void setQupdateuserid(Integer qupdateuserid) {
		this.qupdateuserid = qupdateuserid;
	}

	public Date getQcreatetime() {
		return qcreatetime;
	}

	public void setQcreatetime(Date qcreatetime) {
		this.qcreatetime = qcreatetime;
	}

	public Date getQupdatetime() {
		return qupdatetime;
	}

	public void setQupdatetime(Date qupdatetime) {
		this.qupdatetime = qupdatetime;
	}

	public Integer getQgoodnum() {
		return qgoodnum;
	}

	public void setQgoodnum(Integer qgoodnum) {
		this.qgoodnum = qgoodnum;
	}

	public Integer getQbadnum() {
		return qbadnum;
	}

	public void setQbadnum(Integer qbadnum) {
		this.qbadnum = qbadnum;
	}

	public String getQlabel() {
		return qlabel;
	}

	public void setQlabel(String qlabel) {
		this.qlabel = qlabel;
	}

	public String getQstaus() {
		return qstaus;
	}

	public void setQstaus(String qstaus) {
		this.qstaus = qstaus;
	}

	public Integer getQviewtimes() {
		return qviewtimes;
	}

	public void setQviewtimes(Integer qviewtimes) {
		this.qviewtimes = qviewtimes;
	}
	
	
	
	
}
