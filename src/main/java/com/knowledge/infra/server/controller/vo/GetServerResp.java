package com.knowledge.infra.server.controller.vo;

import java.io.Serializable;

public class GetServerResp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6651864309573606586L;
	
	
	private Integer code;
	private Object  data;
	private String  msg;
	
	public GetServerResp(){}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
